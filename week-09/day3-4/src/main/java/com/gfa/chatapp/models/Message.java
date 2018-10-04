package com.gfa.chatapp.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.Random;

import static java.time.ZoneOffset.UTC;

@Entity
public class Message {
    @Id
    Long id;
    String text;
    LocalDateTime timestamp;
    String username;


    public Message(Long id, String text, LocalDateTime timestamp, String username) {
        this.id = id;
        this.text = text;
        this.timestamp = timestamp;
        this.username = username;
    }

    public Message() {
    }

    public Message(String username, String text) {
        this.text = text;
        this.username = username;
        this.timestamp = LocalDateTime.now(UTC);
        this.id = randomID();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private Long randomID() {
        Random random = new Random();
        return Long.valueOf(random.nextInt(9000000) + 1000000);
    }
}
