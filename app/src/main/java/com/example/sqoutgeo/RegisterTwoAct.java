package com.example.sqoutgeo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class RegisterTwoAct extends AppCompatActivity {

    LinearLayout btn_back;
    Button btn_continue, btn_add_photo;
    ImageView pic_photo_register_user;

    Uri photo_location;
    Integer photo_max = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_two);


        btn_continue = findViewById(R.id.btn_continue);
        btn_back=findViewById(R.id.btn_back);
        btn_add_photo = findViewById(R.id.btn_add_photo);
        pic_photo_register_user = findViewById(R.id.pic_photo_register_user);


        btn_add_photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              findPhoto();
            }
        });

        btn_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotosuccess = new Intent(RegisterTwoAct.this,SuccessRegisterAct.class);
                startActivity(gotosuccess);

            }
        });

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backtoprev  = new Intent(RegisterTwoAct.this,RegisterOneAct.class);
                startActivity(backtoprev);
            }
        });
    }

    public void  findPhoto() {
        Intent pic = new Intent();
        pic.setType("image/*");
        pic.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(pic, photo_max);
    }



}