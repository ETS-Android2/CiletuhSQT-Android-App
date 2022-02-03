package com.example.sqoutgeo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ShowingResultAct extends AppCompatActivity {
    TextView mScoreView;
    Button backtohomepage;
    QuizFormAct qf;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showing_result);

        mScoreView = (TextView)findViewById(R.id.score_text);

        backtohomepage = findViewById(R.id.button_homepage);

        backtohomepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backtohomepage = new Intent(ShowingResultAct.this,HomeScreenAct.class);
                startActivity(backtohomepage);
            }
        });

        final MediaPlayer mp = MediaPlayer.create(this, R.raw.applause);



    }

//    private void setScore(){
  //      score = qf.updateScore(int point);

    //}

}