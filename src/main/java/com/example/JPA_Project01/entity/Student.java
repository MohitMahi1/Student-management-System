package com.example.JPA_Project01.entity;

import jakarta.persistence.*;

//First In enity package create Studenrt class

@Entity //First we link the database with class so use @Entity
@Table(name="students") //It is for database table name and inside what should we take table name
                        //It is not necessary bcz the class name also treated as table name
public class Student {


    @Id //Id for used Primery key
    @GeneratedValue(strategy = GenerationType.IDENTITY) /*It is for what how we value given. But Here the
    strategy of generationType is Identity i.e. It is Auto-increment*/

    //Here All are attributes what we use
    private int id;
    private String name;
    private String email;
    private int phoneNum;

    Student(){

    }

    //Constructor
    public Student(String name, String email, int phoneNum) {
        this.name = name;
        this.email = email;
        this.phoneNum = phoneNum;
    }

    //All attributes are private so we create Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }
}
