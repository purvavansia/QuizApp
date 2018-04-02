package com.example.purva.quizapp;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

/**
 * Created by purva on 3/30/18.
 */

public class Question5Fragment extends Fragment {

    private TextView ques5;
    private RadioGroup radioGroup;
    private String quesData;
    private RadioButton rdAns1, rdAns2, rdAns3, rdAns4;
    private String answer;
    private Button next;
    private int n;
    PassDataInterface passDataInterface;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

       View v = inflater.inflate(R.layout.question5_fragment,container,false);

        ques5 = v.findViewById(R.id.textViewQues5);
        next = v.findViewById(R.id.ButtonNext5);
        quesData = ques5.getText().toString();
        n = R.id.ButtonNext5;
        radioGroup = v.findViewById(R.id.radioGroup5);
        rdAns1 = v.findViewById(R.id.radioAnswer1Q5);
        rdAns2 = v.findViewById(R.id.radioAnswer2Q5);
        rdAns3 = v.findViewById(R.id.radioAnswer3Q5);
        rdAns4 = v.findViewById(R.id.radioAnswer4Q5);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(radioGroup.getCheckedRadioButtonId()==-1){
                    answer ="";
                }
                else {
                    RadioButton checkedRadioButton = (RadioButton) radioGroup.findViewById(radioGroup.getCheckedRadioButtonId());
                    answer = checkedRadioButton.getText().toString();
                }
                passDataInterface.passData(quesData, answer, n);
            }
        });
       return v;
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        passDataInterface = (PassDataInterface) getActivity();
    }
}
