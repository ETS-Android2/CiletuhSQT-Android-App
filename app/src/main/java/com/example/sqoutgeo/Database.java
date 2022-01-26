package com.example.sqoutgeo;

import com.example.sqoutgeo.models.Feature;

import java.util.ArrayList;

public class Database {

    public static ArrayList<Feature> features;
    public static Database instance;

    public ArrayList<Feature> getFeatures(String query){
        ArrayList<Feature> result = new ArrayList<>();

        for (Feature i: features) {
            if(i.getType().equals(query)) result.add(i);
        }

        return result;
    }

    public Feature getFeature(String query){
        for (Feature i: features) {
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
        features = new ArrayList<>();
    }
}

