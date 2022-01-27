package com.example.sqoutgeo;

import com.example.sqoutgeo.models.Feature;

public class Seeder {
    public static Database db;

    public static void run() {
        db = Database.getInstance();

       // db.features.add(new Feature("Wisata A","Wisata Asri","Wisata",));

        db.features.add(new Feature("Pantai Muara Cipanarikan","Lokasi : Kecamatan Ciracap Kabupaten Sukabumi\n" +
                "\n" +
                "Pantai Muara  Cipanarikan memiliki pasir yang putih, sunset yang indah, ","Hotel", R.drawable.pantai_cipanarikan));


    }
}
