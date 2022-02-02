package com.example.sqoutgeo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class AboutUsAct extends AppCompatActivity {
    LinearLayout btn_back;
    Button aboutus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backtomenu  = new Intent(AboutUsAct.this,HomeScreenAct.class);
                startActivity(backtomenu);
            }
        });

        aboutus = findViewById(R.id.about_app);
        aboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotostorymap = new Intent("android.intent.action.VIEW",
                        Uri.parse("https://storymaps.arcgis.com/stories/a3d6543ad95649a2938f051ca9ea0b8d"));
                startActivity(gotostorymap);
            }
        });
    }
}