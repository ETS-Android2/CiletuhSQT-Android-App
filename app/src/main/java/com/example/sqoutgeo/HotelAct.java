package com.example.sqoutgeo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.sqoutgeo.adapter.WisataAdapter;

public class HotelAct extends AppCompatActivity {

    RecyclerView rv_hotel;
    WisataAdapter adapter;
    Database db;
    LinearLayout btnbackhotel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);
        db = Database.getInstance();

        rv_hotel = findViewById(R.id.rv_hotel);
        rv_hotel.setLayoutManager(new GridLayoutManager(this,1));
        adapter = new WisataAdapter(this);
        rv_hotel.setAdapter(adapter);

        btnbackhotel = findViewById(R.id.btn_back_hotel);

        btnbackhotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backtomenufromhotel  = new Intent(HotelAct.this,HomeScreenAct.class);
                startActivity(backtomenufromhotel);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        adapter.setFeature(db.getFeatures("Hotel"));
        adapter.notifyDataSetChanged();
    }
}