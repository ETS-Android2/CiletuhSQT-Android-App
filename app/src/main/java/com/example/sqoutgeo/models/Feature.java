package com.example.sqoutgeo.models;

import java.io.Serializable;

public class Feature implements Serializable {
    private String name;
    private String desc;
    private String type;

    public Feature(String name, String desc, String type) {
        this.name = name;
        this.desc = desc;
        this.type = type;
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
