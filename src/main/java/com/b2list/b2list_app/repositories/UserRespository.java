package com.b2list.b2list_app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.b2list.b2list_app.models.User;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

public interface UserRespository extends JpaRepository <User, Id>{
    
}
