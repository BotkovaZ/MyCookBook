package com.example.demo.model.user;

import java.time.LocalDate;

public class User {

    private static int lastId;
    private Integer id;
    private String name;
    private String password;
    private LocalDate createdOn;

    public User(String name, String password) {
        this.id = lastId++;
        this.name = name;
        this.password = password;
        this.createdOn = LocalDate.now();
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDate createdOn) {
        this.createdOn = createdOn;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", createdOn=" + createdOn +
                '}';
    }
}
