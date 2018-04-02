package com.example.purva.quizapp;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity{

    private Button start;
    EditText name;
    TextView tv;
    private ViewFlipper viewFlipper;
    String uname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewFlipper = findViewById(R.id.viewFlipper);
        name = (EditText)findViewById(R.id.nameToBeDisplayed);

        tv = findViewById(R.id.textViewEnterName);
        start = findViewById(R.id.buttonStart);


        //uname = tv.getText().toString();
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.animation_left);
        viewFlipper.setInAnimation(animation);
        viewFlipper.setFlipInterval(3000);
        viewFlipper.startFlipping();

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uname = name.getText().toString();
                //Toast.makeText(MainActivity.this,uname,Toast.LENGTH_SHORT).show();

                Intent i = new Intent(MainActivity.this,MiddleActivity.class);
                i.putExtra("name",uname);
                startActivity(i);

            }
        });
    }


}
