package com.socialsoft4u.karan.webview;

import android.widget.CheckBox;

/**
 * Created by DELL on 8/30/2017.
 */

public class Actors {
    private String name;
    private boolean checked = false;
    private String description;
    private String dob;
    private String country;
    private String height;
    private String spouse;
    private String children;
    private String image;
    public Actors() {

    }

    //Getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public boolean getChechbox() {
        return checked;
    }
    public void setCheckbox(String checked) {
        this.name = checked;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getHeight() {
        return height;
    }
    public void setHeight(String height) {
        this.height = height;
    }
    public String getSpouse() {
        return spouse;
    }
    public void setSpouse(String spouse) {
        this.spouse = spouse;
    }
    public String getChildren() {
        return children;
    }
    public void setChildren(String children) {
        this.children = children;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
}