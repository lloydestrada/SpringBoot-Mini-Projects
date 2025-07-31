package com.lloyd.springboot.thymeleafdemo.model;

import java.util.List;

public class Student {

    private String firstName;
    private String lastName;

    //add field for country selection
    private String country;

    //add field for programming language
    private String favoriteLanguage;

    //add favorite operating systems checkbox
    private List<String> favoriteSystems;


    //no-argue constructor
    public Student(){};

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public List<String> getFavoriteSystems() {
        return favoriteSystems;
    }

    public void setFavoriteSystems(List<String> favoriteSystems) {
        this.favoriteSystems = favoriteSystems;
    }
}
