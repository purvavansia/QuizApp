package com.example.purva.quizapp;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

/**
 * Created by purva on 3/31/18.
 */

public class ResultFragment extends Fragment {

    ListView listView;
    TextView textViewName;
    String resultName;
    //ArrayAdapter<String> arrayAdapter;
    boolean isQ1=false, isQ2=false, isQ3=false, isQ4=false, isQ5=false, isQ6=false,
            isQ7=false, isQ8=false, isQ9=false, isQ10=false,isAttempt1=true,isAttempt2=true,
            isAttempt3=true,isAttempt4=true,isAttempt5=true,isAttempt6=true,isAttempt7=true,
            isAttempt8=true,isAttempt9=true,isAttempt10=true;

    int[] correctAns = new int[10];
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.result_fragment,container,false);


        String question1 = getArguments().getString("question1");
        String answer1 = getArguments().getString("answer1");

        if(answer1.isEmpty()){
            correctAns[0] =R.drawable.na;
            isAttempt1 = false;
            //Toast.makeText(getActivity(),"u dint attempt the ques", Toast.LENGTH_SHORT).show();
        }
        else if(answer1.equals("Initial screen of an application")){
            correctAns[0] = R.drawable.right;
            isQ1 = true;
            //Toast.makeText(getActivity(), "correct", Toast.LENGTH_SHORT).show();

        }
        else{
            correctAns[0] = R.drawable.wrong;
        }


        String question2 = getArguments().getString("question2");
        String answer2 = getArguments().getString("answer2");
        if(answer2.isEmpty()){
            correctAns[1] =R.drawable.na;
            isAttempt1 = false;
            //Toast.makeText(getActivity(),"u dint attempt the ques", Toast.LENGTH_SHORT).show();
        }
        else if(answer2.equals("Many")){
            correctAns[1] = R.drawable.right;
            isQ1 = true;
            //Toast.makeText(getActivity(), "correct", Toast.LENGTH_SHORT).show();

        }
        else{
            correctAns[1] = R.drawable.wrong;
        }

        String question3 = getArguments().getString("question3");
        String answer3 = getArguments().getString("answer3");
        if(answer3.isEmpty()){
            correctAns[2] =R.drawable.na;
            isAttempt1 = false;
            //Toast.makeText(getActivity(),"u dint attempt the ques", Toast.LENGTH_SHORT).show();
        }
        else if(answer3.equals("It performs actions on screen")){
            correctAns[2] = R.drawable.right;
            isQ1 = true;
            //Toast.makeText(getActivity(), "correct", Toast.LENGTH_SHORT).show();

        }
        else{
            correctAns[2] = R.drawable.wrong;
        }

        String question4 = getArguments().getString("question4");
        String answer4 = getArguments().getString("answer4");
        if(answer4.isEmpty()){
            correctAns[3] =R.drawable.na;
            isAttempt1 = false;
            //Toast.makeText(getActivity(),"u dint attempt the ques", Toast.LENGTH_SHORT).show();
        }
        else if(answer4.equals("Used to debug the program")){
            correctAns[3] = R.drawable.right;
            isQ1 = true;
            //Toast.makeText(getActivity(), "correct", Toast.LENGTH_SHORT).show();

        }
        else{
            correctAns[3] = R.drawable.wrong;
        }

        String question5 = getArguments().getString("question5");
        String answer5 = getArguments().getString("answer5");
        if(answer5.isEmpty()){
            correctAns[4] =R.drawable.na;
            isAttempt1 = false;
            //Toast.makeText(getActivity(),"u dint attempt the ques", Toast.LENGTH_SHORT).show();
        }
        else if(answer5.equals("Json Exception")){
            correctAns[4] = R.drawable.right;
            isQ1 = true;
            //Toast.makeText(getActivity(), "correct", Toast.LENGTH_SHORT).show();

        }
        else{
            correctAns[4] = R.drawable.wrong;
        }
        String question6 = getArguments().getString("question6");
        String answer6 = getArguments().getString("answer6");
        if(answer6.isEmpty()){
            correctAns[5] =R.drawable.na;
            isAttempt1 = false;
            //Toast.makeText(getActivity(),"u dint attempt the ques", Toast.LENGTH_SHORT).show();
        }
        else if(answer6.equals("Both of the above")){
            correctAns[5] = R.drawable.right;
            isQ1 = true;
            //Toast.makeText(getActivity(), "correct", Toast.LENGTH_SHORT).show();

        }
        else{
            correctAns[5] = R.drawable.wrong;
        }
        String question7 = getArguments().getString("question7");
        String answer7 = getArguments().getString("answer7");
        if(answer7.isEmpty()){
            correctAns[6] =R.drawable.na;
            isAttempt1 = false;
            //Toast.makeText(getActivity(),"u dint attempt the ques", Toast.LENGTH_SHORT).show();
        }
        else if(answer7.equals("Base class for all classes")){
            correctAns[6] = R.drawable.right;
            isQ1 = true;
            //Toast.makeText(getActivity(), "correct", Toast.LENGTH_SHORT).show();

        }
        else{
            correctAns[6] = R.drawable.wrong;
        }
        String question8 = getArguments().getString("question8");
        String answer8 = getArguments().getString("answer8");
        if(answer8.isEmpty()){
            correctAns[7] =R.drawable.na;
            isAttempt1 = false;
            //Toast.makeText(getActivity(),"u dint attempt the ques", Toast.LENGTH_SHORT).show();
        }
        else if(answer8.equals("Breaks the execution")){
            correctAns[7] = R.drawable.right;
            isQ1 = true;
            //Toast.makeText(getActivity(), "correct", Toast.LENGTH_SHORT).show();

        }
        else{
            correctAns[7] = R.drawable.wrong;
        }
        String question9 = getArguments().getString("question9");
        String answer9 = getArguments().getString("answer9");
        if(answer9.isEmpty()){
            correctAns[8] =R.drawable.na;
            isAttempt1 = false;
            //Toast.makeText(getActivity(),"u dint attempt the ques", Toast.LENGTH_SHORT).show();
        }
        else if(answer9.equals("Java Native Interface")){
            correctAns[8] = R.drawable.right;
            isQ1 = true;
            //Toast.makeText(getActivity(), "correct", Toast.LENGTH_SHORT).show();

        }
        else{
            correctAns[8] = R.drawable.wrong;
        }
        String question10 = getArguments().getString("question10");
        String answer10 = getArguments().getString("answer10");
        if(answer10.isEmpty()){
            correctAns[9] =R.drawable.na;
            isAttempt1 = false;
            //Toast.makeText(getActivity(),"u dint attempt the ques", Toast.LENGTH_SHORT).show();
        }
        else if(answer10.equals("FULL_WAKE_LOCK")){
            correctAns[9] = R.drawable.right;
            isQ1 = true;
            //Toast.makeText(getActivity(), "correct", Toast.LENGTH_SHORT).show();

        }
        else{
            correctAns[9] = R.drawable.wrong;
        }
        resultName = getArguments().getString("name");

        String[] questions = {question1,question2,question3, question4,
                question5, question6, question7, question8, question9, question10};

        listView = v.findViewById(R.id.listView);
        MyAdapter myAdapter = new MyAdapter(correctAns, questions,getActivity());
        listView.setAdapter(myAdapter);

        textViewName = v.findViewById(R.id.textViewResult);
        textViewName.setText("Hi "+resultName+" ur result is as below:");
        return v;
    }


}
