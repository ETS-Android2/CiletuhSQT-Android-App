package com.example.sqoutgeo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class HomeScreenAct extends AppCompatActivity {

    LinearLayout btn_ticket_aminities, btn_wisata, btn_hotel;
    Button btn_to_profile;
    ImageView app_hub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_home_screen );

        Seeder.run ();

        btn_ticket_aminities = findViewById ( R.id.btn_ticket_aminities );
        btn_to_profile = findViewById ( R.id.btn_to_profile );
        btn_wisata = findViewById ( R.id.btn_wisata );
        btn_hotel = findViewById ( R.id.btn_hotel );

        app_hub = findViewById ( R.id.app_hub );

        btn_to_profile.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent gotoprofile = new Intent ( HomeScreenAct.this, MyProfileAct.class );
                startActivity ( gotoprofile );
            }
        } );

        btn_ticket_aminities.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent gotoaminitiesticket = new Intent ( HomeScreenAct.this, TicketDetailAct.class );
                startActivity ( gotoaminitiesticket );
            }
        } );

        btn_wisata.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent gotowisata = new Intent ( HomeScreenAct.this, WisataAct.class );
                startActivity ( gotowisata );
            }
        } );
        btn_hotel.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent gotohotel = new Intent ( HomeScreenAct.this, HotelAct.class );
                startActivity ( gotohotel );
            }
        } );

        app_hub.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                gotoUrl ( "https://geopark-ciletuh-sukabumi-smartcommunity.hub.arcgis.com/" );
            }
        } );


//    public void browser1(View view){
//        Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse ( "https://arcg.is/0uLLGj" ));
//        startActivity ( browserIntent );
//    }

        //public void penginapan(View view){
        //  Intent penginapanIntent=new Intent (Intent.ACTION_VIEW,Uri.parse ( "https://arcg.is/ynaaK" ));
        // startActivity ( penginapanIntent );
        //}

//    public void wisata(View view){
//        Intent wisataIntent=new Intent (Intent.ACTION_VIEW,Uri.parse ( "https://arcg.is/HyHa5" ));
//        startActivity ( wisataIntent );
//    }
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse ( s );
        startActivity ( new Intent ( Intent.ACTION_VIEW, uri ) );
    }
}
