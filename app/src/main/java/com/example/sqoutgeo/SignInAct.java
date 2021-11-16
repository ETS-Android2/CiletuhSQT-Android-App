package com.example.sqoutgeo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignInAct extends AppCompatActivity {

    TextView btn_new_acccount;
    Button btn_sign_in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_sign_in );

        btn_new_acccount=findViewById(R.id.btn_new_account);
        btn_sign_in=findViewById(R.id.btn_sign_in);

        btn_new_acccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoregisterone = new Intent (SignInAct.this,RegisterOneAct.class);
                startActivity ( gotoregisterone );
            }
        });

        btn_sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotohome = new Intent (SignInAct.this,HomeScreenAct.class);
                startActivity ( gotohome );
            }
        });
    }
}