package com.example.sqoutgeo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class StartQuiz extends AppCompatActivity {

    LinearLayout btnbackfromquiz;
    Button startquiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_quiz);

        btnbackfromquiz = findViewById(R.id.btn_back_fromquiz);
        btnbackfromquiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backtomenu2  = new Intent(StartQuiz.this,HomeScreenAct.class);
                startActivity(backtomenu2);

            }
        });

        startquiz = findViewById(R.id.start_quiz);
        startquiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startquizgo = new Intent(StartQuiz.this,QuizFormAct.class);
                startActivity(startquizgo);
            }
        });
    }
}