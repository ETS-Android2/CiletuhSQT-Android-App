package com.example.sqoutgeo;

import com.example.sqoutgeo.models.Feature;

public class Seeder {
    public static Database db;

    public static void run() {
        db = Database.getInstance();

        db.features.add(new Feature("Wisata A","Wisata Asri","Wisata"));

        db.features.add(new Feature("Hotel A","Wisata Asri","Hotel"));


    }
}
