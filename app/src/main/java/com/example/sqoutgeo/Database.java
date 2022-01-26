package com.example.sqoutgeo;

import com.example.sqoutgeo.models.Feature;

import java.util.ArrayList;

public class Database {

    public static ArrayList<Feature> Features;
    public static Database instance;

    public ArrayList<Feature> getFeatures(String query){
        ArrayList<Feature> result = new ArrayList<>();

        for (Feature i: Features) {
            if(i.getType().equals(query)) result.add(i);
        }

        return result;
    }

    public Feature getFeature(String query){
        for (Feature i: Features) {
            if(i.getName().equals(query)) return i;
        }

        return null;
    }

    public static Database getInstance(){
        if(instance == null){
            instance = new Database();
        }
        return instance;
    }

    private Database() {
        Features = new ArrayList<>();
    }
}

