package com.example.sqoutgeo;

import com.example.sqoutgeo.models.Feature;

public class Seeder {
    public static Database db;

    public static void run() {
        db = Database.getInstance();

       // db.features.add(new Feature("Wisata A","Wisata Asri","Wisata",));

        db.features.add(new Feature("Pantai Muara Cipanarikan","Wisata", R.drawable.pantai_cipanarikan));
        db.features.add(new Feature("Pantai Cimaja","Wisata",R.drawable.pantai_cimaja));
        db.features.add(new Feature("Pantai pangumbahan","Wisata",R.drawable.pantai_pangumbahan));
        db.features.add(new Feature("Pantai palangpang","Wisata",R.drawable.pantai_palangpang));
        db.features.add(new Feature("Pantai ujung genteng","Wisata",R.drawable.pantai_ujunggenteng));

        db.features.add(new Feature("Villa Batman By Asnap","Hotel",R.drawable.villa_batman));
        db.features.add(new Feature("Villa Dua Putri","Hotel",R.drawable.villa_duaputri));
        db.features.add(new Feature("OYO 921 Hotel Ratu Pantai","Hotel",R.drawable.oyo_921));
        db.features.add(new Feature("Vanada Bugeul","Hotel",R.drawable.vanda_bugeul));
        db.features.add(new Feature("AA Bungsu Syariah Balekambang 1","Hotel",R.drawable.aa_bungsu));
        db.features.add(new Feature("Villa Tenjo Gunung","Hotel",R.drawable.villa_tenjogunung));
        db.features.add(new Feature("Balekambang Saung Kerek\n" +
                "by Nendi\n","Hotel",R.drawable.balekambang_saungkerek));
        db.features.add(new Feature("Balekambang Cottage by Nendi","Hotel",R.drawable.balekambang_cottage));
        db.features.add(new Feature("Balekambang VIP by Nendi","Hotel",R.drawable.balekambang_vip));
        db.features.add(new Feature("Homestay Nasrudin Geopark Ciletuh","Hotel",R.drawable.homestay_nasrudin));






    }
}
