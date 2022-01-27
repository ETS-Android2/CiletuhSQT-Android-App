package com.example.sqoutgeo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.esri.arcgisruntime.mapping.view.MapView;

public class HomeScreenAct extends AppCompatActivity {

    LinearLayout btn_peta;
    LinearLayout btn_ticket_aminities;
    Button btn_to_profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        btn_peta = findViewById(R.id.btn_peta);
        btn_ticket_aminities = findViewById(R.id.btn_ticket_aminities);
        btn_to_profile = findViewById(R.id.btn_to_profile);

        btn_peta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoMapView = new Intent(HomeScreenAct.this,MyMapView.class);
                startActivity(gotoMapView);
            }
        });

        btn_to_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoprofile = new Intent(HomeScreenAct.this,MyProfileAct.class);
                startActivity(gotoprofile);
            }
        });

        btn_ticket_aminities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoaminitiesticket  = new Intent(HomeScreenAct.this,TicketDetailAct.class);
                startActivity(gotoaminitiesticket);
            }
        });
    }

    public void browser1(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse ( "https://arcg.is/0uLLGj" ));
        startActivity ( browserIntent );
    }

    public void penginapan(View view){
        Intent penginapanIntent=new Intent (Intent.ACTION_VIEW,Uri.parse ( "https://arcg.is/ynaaK" ));
        startActivity ( penginapanIntent );
    }

    public void wisata(View view){
        Intent wisataIntent=new Intent (Intent.ACTION_VIEW,Uri.parse ( "https://arcg.is/HyHa5" ));
        startActivity ( wisataIntent );
    }
}