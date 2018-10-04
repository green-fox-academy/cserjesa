package com.gfa.chatapp.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    Long id;
    String username;

    public User() {
        this.id = 1L;
        this.username = username;
    }

    public User(String username) {
        this.id = 1L;
        this.username = username;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
