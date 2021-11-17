package com.example.sqoutgeo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class HomeScreenAct extends AppCompatActivity {

    LinearLayout btn_ticket_aminities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        btn_ticket_aminities = findViewById(R.id.btn_ticket_aminities);

        btn_ticket_aminities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoaminitiesticket  = new Intent(HomeScreenAct.this,TicketDetailAct.class);
                startActivity(gotoaminitiesticket);
            }
        });
    }
}