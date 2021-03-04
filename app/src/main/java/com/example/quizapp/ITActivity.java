package com.example.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ITActivity extends AppCompatActivity {
    TextView tv;
    Button submitbutton, quitbutton;
    RadioGroup radio_g;
    RadioButton rb1,rb2,rb3,rb4;

    String questions[] = {

            "1. Full form of OS is?",
            "2. The ribbon is used in ?",
            "3. Joystick is used to ?",
            "4. What type of memory is volatile ?",
            "5. Main memory is also known as ?",
            "6. What does SSL stands for ?    ",
            "7. What is MAC?",
            "8. DTP computer abbreviation usually means ?",
            "9. What does PPTP stand for ?",
            "10. When does method overloading is determined?"
    };
    String answers[] = {"Operating system","Dot Matrix printer","Both a and b","RAM","Primery memory","Secure socket layer","Media Access Control   ","Data Type Programming","Point to Point Tunneling Protocol","At compile time"};
    String opt[] = {
            "Order of significance", "Operating system", "Open software" , "Optical Sensor",
            "Laser", "Printer Plotter","Ink-jet printer", "Dot Matrix printer",
            "Move cursor on the screen  "," Computer games", "Both a and b","None of these",
            "Cache", "Hard Drive","RAM","ROM",
            "Auxiliary memory","Primery memory","Primery memory","None of above",
            " System socket layer", "Secure system login", "Secure socket layer", "Secure system login",
            "A computer made by Apple", "Memory address corruption","Mediocre Apple Computer", "Media Access Control",
            "DeskTop Publishing", "Data Type Programming", "Digital Transmission Protocol", "None Of above",
            "Point to Point Transmission Protocol", "Point to Point Transfer Protocol", "Point to Point Tunneling Protocol", "Point to Point Traffic Protocol",
            "At run time","At compile time", " At coding time", "At execution time"
    };
    int flag=0;
    public static int marks=0,correct=0,wrong=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        final TextView score = (TextView)findViewById(R.id.textView4);
        TextView textView=(TextView)findViewById(R.id.DispName);
        Intent intent = getIntent();


        submitbutton=(Button)findViewById(R.id.button3);
        quitbutton=(Button)findViewById(R.id.buttonquit);
        tv=(TextView) findViewById(R.id.tvque);

        radio_g=(RadioGroup)findViewById(R.id.answersgrp);
        rb1=(RadioButton)findViewById(R.id.radioButton);
        rb2=(RadioButton)findViewById(R.id.radioButton2);
        rb3=(RadioButton)findViewById(R.id.radioButton3);
        rb4=(RadioButton)findViewById(R.id.radioButton4);
        tv.setText(questions[flag]);
        rb1.setText(opt[0]);
        rb2.setText(opt[1]);
        rb3.setText(opt[2]);
        rb4.setText(opt[3]);
        submitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //int color = mBackgroundColor.getColor();
                //mLayout.setBackgroundColor(color);

                if(radio_g.getCheckedRadioButtonId()==-1)
                {
                    Toast.makeText(getApplicationContext(), "Please select one choice", Toast.LENGTH_SHORT).show();
                    return;
                }
                RadioButton uans = (RadioButton) findViewById(radio_g.getCheckedRadioButtonId());
                String ansText = uans.getText().toString();
//                Toast.makeText(getApplicationContext(), ansText, Toast.LENGTH_SHORT).show();
                if(ansText.equals(answers[flag])) {
                    correct++;
                    Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();
                }
                else {
                    wrong++;
                    Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
                }

                flag++;

                if (score != null)
                    score.setText(""+correct);

                if(flag<questions.length)
                {
                    tv.setText(questions[flag]);
                    rb1.setText(opt[flag*4]);
                    rb2.setText(opt[flag*4 +1]);
                    rb3.setText(opt[flag*4 +2]);
                    rb4.setText(opt[flag*4 +3]);
                }
                else
                {
                    marks=correct;
                    Intent in = new Intent(getApplicationContext(),ITResultActivity.class);
                    startActivity(in);
                }
                radio_g.clearCheck();
            }
        });

        quitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),ITResultActivity.class);
                startActivity(intent);
            }
        });
    }

}