package com.example.purva.quizapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by purva on 3/31/18.
 */

public class MyAdapter extends BaseAdapter {

    int[] correctAns;
    String [] questions;
    Context context;
    LayoutInflater layoutInflater;

    public MyAdapter(int[] correctAns, String[] questions, Context context) {


        this.correctAns = correctAns;
        this.questions = questions;
        this.context = context;


        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return questions.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = layoutInflater.inflate(R.layout.item_list_layout,null);
        TextView itemTextView = convertView.findViewById(R.id.textViewListItem);
        ImageView itemImageView = convertView.findViewById(R.id.imageViewListItem);
        itemTextView.setText(questions[position]);
        itemImageView.setImageResource(correctAns[position]);

        return convertView;
    }
}
