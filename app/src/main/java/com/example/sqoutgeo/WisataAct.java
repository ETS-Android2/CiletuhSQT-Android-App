package com.example.sqoutgeo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.sqoutgeo.adapter.WisataAdapter;
import com.example.sqoutgeo.models.Wisata;

import java.util.ArrayList;

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