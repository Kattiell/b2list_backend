package com.b2list.b2list_app.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table; 

@Entity
@Table(name="Users")
public class User{

    public String Nome;
    public String UserName;
    public int Id;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public String CPF;
    public String Email;
}