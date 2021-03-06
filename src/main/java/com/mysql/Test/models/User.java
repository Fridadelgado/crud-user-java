package com.mysql.Test.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private  long Id;
    private  String name ;
    private String email;

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



    public long getId() {

        return Id;
    }

    public void setId(long id) {

        Id = id;
    }




}
