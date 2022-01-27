package com.example.sqoutgeo;

import com.example.sqoutgeo.models.Feature;

public class Seeder {
    public static Database db;

    public static void run() {
        db = Database.getInstance();

       // db.features.add(new Feature("Wisata A","Wisata Asri","Wisata",));

        db.features.add(new Feature("Pantai Muara Cipanarikan","Lokasi : Kecamatan Ciracap Kabupaten Sukabumi\n" +
                "\n" +
                "Pantai Muara  Cipanarikan memiliki pasir yang putih, sunset yang indah, ","Wisata", R.drawable.pantai_cipanarikan));
        db.features.add(new Feature("Pantai Cimaja","lokasi : desa cimaja, kecamatan cikakak, kabupaten sukabumi, jawa barat\n" +
                "\n" +
                "lokasi ini memiliki pantai dengan pasir putih dan landai, sepi  dan bersih, dini pengujung juga bisa berselancar","Wisata",R.drawable.pantai_cimaja));


        db.features.add(new Feature("Villa Batman By Asnap","Rp 2.350.000/malam\n" +
                        "90 m dari Geopark Ciletuh","Hotel",R.drawable.villa_batman));
        db.features.add(new Feature("Villa Dua Putri","Rp 3.250.000/malam\n" +
                "722 m dari Geopark Ciletuh","Hotel",R.drawable.villa_duaputri));
        db.features.add(new Feature("OYO 921 Hotel Ratu Pantai","Rp 230.551/malam\n" +
                "734 m dari Geopark Ciletuh","Hotel",R.drawable.oyo_921));
        db.features.add(new Feature("Vanada Bugeul","Rp 1.257.663/malam\n" +
                "\n" +
                "771 m dari Geopark Ciletuh\n","Hotel",R.drawable.vanda_bugeul));
        db.features.add(new Feature("AA Bungsu Syariah Balekambang 1","Rp 361.446/malam\n" +
                "790 m dari Geopark Ciletuh","Hotel",R.drawable.aa_bungsu));
        db.features.add(new Feature("Villa Tenjo Gunung","Rp 798.028/malam\n" +
                "802 m dari Geopark Ciletuh","Hotel",R.drawable.villa_tenjogunung));
        db.features.add(new Feature("Balekambang Saung Kerek\n" +
                "by Nendi\n","Rp 5.000.000/malam\n" +
                "\n" +
                "857 m dari Geopark Ciletuh","Hotel",R.drawable.balekambang_saungkerek));
        db.features.add(new Feature("Balekambang Cottage by Nendi","Rp 904.159/malam\n" +
                "\n" +
                "859 m dari Geopark Ciletuh","Hotel",R.drawable.balekambang_cottage));
        db.features.add(new Feature("Balekambang VIP by Nendi","Rp 1.959.011/malam\n" +
                "859 m dari Geopark Ciletuh","Hotel",R.drawable.balekambang_vip));
        db.features.add(new Feature("Homestay Nasrudin Geopark Ciletuh","Rp 602.410\n" +
                "\n" +
                "908 m dari Geopark Ciletuh","Hotel",R.drawable.homestay_nasrudin));






    }
}
