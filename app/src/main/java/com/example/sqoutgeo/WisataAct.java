package com.example.sqoutgeo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.sqoutgeo.adapter.WisataAdapter;

public class WisataAct extends AppCompatActivity {

    RecyclerView rv_wisata;
    WisataAdapter adapter;
    Database db;
    LinearLayout btnbackwisata;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata);
        db = Database.getInstance();

        rv_wisata = findViewById(R.id.rv_wisata);
        rv_wisata.setLayoutManager(new GridLayoutManager(this,1));
        adapter = new WisataAdapter(this);
        rv_wisata.setAdapter(adapter);

        btnbackwisata = findViewById(R.id.btn_back_wisata);

        btnbackwisata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backtomenufromwisata = new Intent(WisataAct.this,HomeScreenAct.class);
                startActivity(backtomenufromwisata);
            }
        });



//        public void wisata(View view){
//        Intent wisataIntent=new Intent (Intent.ACTION_VIEW, Uri.parse ( "https://arcg.is/HyHa5" ));
//        startActivity ( wisataIntent );
//    }




    }

    @Override
    protected void onStart() {
        super.onStart();
        adapter.setFeature(db.getFeatures("Wisata"));
        adapter.notifyDataSetChanged();
    }
}