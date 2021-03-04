package com.example.quizapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.quizapp.QuestionsActivity;
import com.example.quizapp.R;

public class CategoriesActivity extends Activity implements View.OnClickListener {

    Button bt1, bt2, bt3;
    Context ctx = CategoriesActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        bt1 = (Button) findViewById(R.id.bt1);
        bt2 = (Button) findViewById(R.id.bt2);
        bt3 = (Button) findViewById(R.id.bt3);


        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.bt1:
                Toast.makeText(ctx, "Start your Quiz", Toast.LENGTH_SHORT).show();

                startActivity(new Intent(this, QuestionsActivity.class));

                break;

            case R.id.bt2:
                Toast.makeText(ctx, "Start your Quiz", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this, JavaQuizActivity.class));

                break;

            case R.id.bt3:
                Toast.makeText(ctx, "Start your Quiz", Toast.LENGTH_SHORT).show();

                startActivity(new Intent(this, ITActivity.class));
                break;


        }


    }
}





















//startActivity(new Intent(this, StaticListExample.class));
//startActivity(new Intent(this, ArrayListExample.class));
//    startActivity(new Intent(this, CustomListViewExample.class));
