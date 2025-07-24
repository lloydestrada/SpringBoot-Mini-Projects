package com.lloyd.Mini_Library_System.Entity;

import jakarta.persistence.*;

@Entity
public class Author {

    //primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name ="first_name")
    private String firstName;


    @Column(name = "last_name")
    private String lastName;


    @Column(name = "birthyear")
    private int birthYear;


    public Author(){}

    public Author(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}
