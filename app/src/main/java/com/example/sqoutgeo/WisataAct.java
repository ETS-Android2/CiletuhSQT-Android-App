package com.example.sqoutgeo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.sqoutgeo.adapter.WisataAdapter;

public class WisataAct extends AppCompatActivity {

    RecyclerView rv_wisata;
    WisataAdapter adapter;
    Database db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata);
        db = Database.getInstance();

        rv_wisata = findViewById(R.id.rv_hotel);
        rv_wisata.setLayoutManager(new GridLayoutManager(this,2));
        adapter = new WisataAdapter(this);
        rv_wisata.setAdapter(adapter);


    }

    @Override
    protected void onStart() {
        super.onStart();
        adapter.setFeature(db.getFeatures("Wisata"));
        adapter.notifyDataSetChanged();
    }
}