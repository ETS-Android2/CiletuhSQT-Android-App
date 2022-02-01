package com.example.sqoutgeo.models;

import java.io.Serializable;

public class Feature implements Serializable {
    private String name;
    private String type;
    private int image;
    private String desc;

    public Feature(String name, String type, Integer image, String desc) {
        this.name = name;
        this.type = type;
        this.image = image;
        this.desc = desc;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}

