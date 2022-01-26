package com.example.sqoutgeo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.sqoutgeo.adapter.WisataAdapter;

public class HotelAct extends AppCompatActivity {

    RecyclerView rv_hotel;
    WisataAdapter adapter;
    Database db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);
        db = Database.getInstance();

        rv_hotel = findViewById(R.id.rv_hotel);
        rv_hotel.setLayoutManager(new GridLayoutManager(this,2));
        adapter = new WisataAdapter(this);
        rv_hotel.setAdapter(adapter);

    }

    @Override
    protected void onStart() {
        super.onStart();
        adapter.setFeature(db.getFeatures("Hotel"));
        adapter.notifyDataSetChanged();
    }
}