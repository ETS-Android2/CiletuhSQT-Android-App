package com.example.sqoutgeo;

import com.example.sqoutgeo.models.Feature;

public class Seeder {
    public static Database db;

    public static void run() {
        db = Database.getInstance();

       // db.features.add(new Feature("Wisata A","Wisata Asri","Wisata",));

        db.features.add(new Feature("Pantai Muara Cipanarikan","Wisata", R.drawable.pantai_cipanarikan, "Lokasi : Kecamatan Ciracap Kabupaten Sukabumi\n" +
                "\n" +
                "Pantai Muara  Cipanarikan memiliki pasir yang putih, sunset yang indah, "));
        db.features.add(new Feature("Pantai Cimaja","Wisata",R.drawable.pantai_cimaja,"lokasi : desa cimaja, kecamatan cikakak, kabupaten sukabumi, jawa barat\n" +
                "\n" +
                "lokasi ini memiliki pantai dengan pasir putih dan landai, sepi  dan bersih, dini pengujung juga bisa berselancar"));
        db.features.add(new Feature("Pantai pangumbahan","Wisata",R.drawable.pantai_pangumbahan,"Lokasi : gunung batu, ciracap, sukabumi, jawa barat\n" +
                "Lokasi ini memiliki pasir silika terdapat banyak penyu hijau tempat surfing, pantai yang masih asri, pemandangan palung indah"));
        db.features.add(new Feature("Pantai palangpang","Wisata",R.drawable.pantai_palangpang,"Lokasi : desa ciwaru, kec ciemas, sukabumi, jawa barat\n" +
                "\n" +
                "Lokasi ini memiliki bersih, pengujung bisa menikmati sunset yang indah"));
        db.features.add(new Feature("Pantai ujung genteng","Wisata",R.drawable.pantai_ujunggenteng,"Lokasi : di desa ujung genteng, kecamatan ciracap, kabupaten sikabumi, jawa barat.\n" +
                "\n" +
                "Lokasi ini cocok untuk menyepi dengan kawasan yang bersih pengunjung bisa menikmati sunrise dan sunset yang inidah pada sore dan paginya dan adanya pengkaran penyu"));

        db.features.add(new Feature("Villa Batman By Asnap","Hotel",R.drawable.villa_batman,"Rp 2.350.000/malam\n" +
                "90 m dari Geopark Ciletuh"));
        db.features.add(new Feature("Villa Dua Putri","Hotel",R.drawable.villa_duaputri,"Rp 3.250.000/malam\n" +
                "722 m dari Geopark Ciletuh"));
        db.features.add(new Feature("OYO 921 Hotel Ratu Pantai","Hotel",R.drawable.oyo_921,"Rp 230.551/malam\n" +
                "734 m dari Geopark Ciletuh"));
        db.features.add(new Feature("Vanada Bugeul","Hotel",R.drawable.vanda_bugeul,"Rp 1.257.663/malam\n" +
                "\n" +
                "771 m dari Geopark Ciletuh"));
        db.features.add(new Feature("AA Bungsu Syariah Balekambang 1","Hotel",R.drawable.aa_bungsu,"Rp 361.446/malam\n" +
                "790 m dari Geopark Ciletuh"));
        db.features.add(new Feature("Villa Tenjo Gunung","Hotel",R.drawable.villa_tenjogunung,"Rp 798.028/malam\n" +
                "802 m dari Geopark Ciletuh"));
        db.features.add(new Feature("Balekambang Saung Kerek\n" +
                "by Nendi\n","Hotel",R.drawable.balekambang_saungkerek,"Rp 5.000.000/malam\n" +
                "\n" +
                "857 m dari Geopark Ciletuh"));
        db.features.add(new Feature("Balekambang Cottage by Nendi","Hotel",R.drawable.balekambang_cottage,"Rp 904.159/malam\n" +
                "\n" +
                "859 m dari Geopark Ciletuh"));
        db.features.add(new Feature("Balekambang VIP by Nendi","Hotel",R.drawable.balekambang_vip,"Rp 1.959.011/malam\n" +
                "859 m dari Geopark Ciletuh"));
        db.features.add(new Feature("Homestay Nasrudin Geopark Ciletuh","Hotel",R.drawable.homestay_nasrudin,"Rp 602.410\n" +
                "\n" +
                "908 m dari Geopark Ciletuh"));






    }
}
