package com.example.sqoutgeo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        //set timer 1 detik (1000 mils = 1 second)
        Handler handler = new Handler ();
        handler.postDelayed ( new Runnable () {
            @Override
            public void run() {
                //merubah ACtivity ke activity lain (Intent)
                Intent gogetstarted = new Intent (MainActivity.this,GetStartedAct.class);
                startActivity ( gogetstarted );
                finish ();
            }
        }, 1000);
    }
}