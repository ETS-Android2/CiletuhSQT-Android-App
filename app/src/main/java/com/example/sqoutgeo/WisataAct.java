package com.example.sqoutgeo;

import androidx.appcompat.app.AppCompatActivity;
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


    }
}