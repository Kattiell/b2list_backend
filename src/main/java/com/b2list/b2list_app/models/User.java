package com.b2list.b2list_app.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table; 

@Entity
@Table(name="Users", catalog = "b2list", schema = "dbo")
public class User
{

    @Column(name = "Name")
    public String Name;

    @Column(name = "Username")
    public String Username;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int Id;

    @Column(name = "CPF")
    public String CPF;

    @Column(name = "Email")
    public String Email;
}