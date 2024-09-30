package com.example.thuexe.Utils;

public class User {
    String name;
    String id;
    String avatar;

    public User(String name, String id, String avatar) {
        this.name = name;
        this.id = id;
        this.avatar = avatar;
    }

    public User(int id, String name, String avatar) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}