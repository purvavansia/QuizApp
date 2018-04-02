package com.example.purva.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MiddleActivity extends AppCompatActivity implements PassDataInterface {

    String name, ques1, ans1, ques2, ans2, ques3, ans3, ques4, ans4, ques5, ans5, ques6, ans6, ques7, ans7, ques8,ans8,ques9, ans9, ques10, ans10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_middle);
        name = getIntent().getStringExtra("name");


        //Toast.makeText(this,name,Toast.LENGTH_SHORT).show();
        Question1Fragment question1Fragment = new Question1Fragment();
        getFragmentManager().beginTransaction().add(R.id.frameLayout,question1Fragment,"addingFragment").commit();
    }

    @Override
    public void passData(String ques, String ans, int next) {

        if(next == R.id.ButtonNext1) {
           Question2Fragment question2Fragment = new Question2Fragment();
           ques1 = ques;
           ans1 = ans;
           getFragmentManager().beginTransaction().replace(R.id.frameLayout, question2Fragment).commit();

        }

        if(next == R.id.ButtonNext2){
            Question3Fragment question3Fragment = new Question3Fragment();
            ques2 = ques;
            ans2 = ans;
            getFragmentManager().beginTransaction().replace(R.id.frameLayout,question3Fragment).commit();
        }
        if(next == R.id.ButtonNext3){
            Question4Fragment question4Fragment = new Question4Fragment();
            ques3 = ques;
            ans3 = ans;
            getFragmentManager().beginTransaction().replace(R.id.frameLayout,question4Fragment).commit();
        }
        if(next == R.id.ButtonNext4){
            Question5Fragment question5Fragment = new Question5Fragment();
            ques4 = ques;
            ans4 = ans;
            getFragmentManager().beginTransaction().replace(R.id.frameLayout,question5Fragment).commit();
        }
        if(next == R.id.ButtonNext5){
            Question6Fragment question6Fragment = new Question6Fragment();
            ques5 = ques;
            ans5 = ans;
            getFragmentManager().beginTransaction().replace(R.id.frameLayout,question6Fragment).commit();
        }
        if(next == R.id.ButtonNext6){
            Question7Fragment question7Fragment = new Question7Fragment();
            ques6 = ques;
            ans6 = ans;
            getFragmentManager().beginTransaction().replace(R.id.frameLayout,question7Fragment).commit();
        }
        if(next == R.id.ButtonNext7){
            Question8Fragment question8Fragment = new Question8Fragment();
            ques7 = ques;
            ans7 = ans;
            getFragmentManager().beginTransaction().replace(R.id.frameLayout,question8Fragment).commit();
        }
        if(next == R.id.ButtonNext8){
            Question9Fragment question9Fragment = new Question9Fragment();
            ques8 = ques;
            ans8 = ans;
            getFragmentManager().beginTransaction().replace(R.id.frameLayout,question9Fragment).commit();

        }
        if(next == R.id.ButtonNext9){
            Question10Fragment question10Fragment = new Question10Fragment();
            ques9 = ques;
            ans9 = ans;
            getFragmentManager().beginTransaction().replace(R.id.frameLayout,question10Fragment).commit();


        }
        if(next == R.id.ButtonNext10){
            ResultFragment resultFragment = new ResultFragment();
            //resultFragment.getData(name);
            ques10 = ques;
            ans10 = ans;
            Bundle bundle = new Bundle();
            bundle.putString("name",name);
            bundle.putString("question1",ques1);
            bundle.putString("answer1",ans1);
            bundle.putString("answer2", ans2);
            bundle.putString("question2", ques2);
            bundle.putString("question3",ques3);
            bundle.putString("answer3",ans3);
            bundle.putString("answer4", ans4);
            bundle.putString("question4", ques4);
            bundle.putString("question5",ques5);
            bundle.putString("answer5",ans5);
            bundle.putString("answer6", ans6);
            bundle.putString("question6", ques6);
            bundle.putString("question7",ques7);
            bundle.putString("answer7",ans7);
            bundle.putString("question8",ques8);
            bundle.putString("answer8",ans8);
            bundle.putString("answer9", ans9);
            bundle.putString("question9", ques9);
            bundle.putString("answer10", ans10);
            bundle.putString("question10", ques10);
            resultFragment.setArguments(bundle);

            getFragmentManager().beginTransaction().replace(R.id.frameLayout, resultFragment).commit();

        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.mymenu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if(id == R.id.item_reQuiz){
            Intent i = new Intent(MiddleActivity.this,MainActivity.class);
            startActivity(i);

        }
        if(id == R.id.item_info){
            Intent i = new Intent(MiddleActivity.this,WebViewActivity.class);
            startActivity(i);
        }

        return super.onOptionsItemSelected(item);
    }
}
