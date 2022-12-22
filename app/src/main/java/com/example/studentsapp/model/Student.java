package com.example.studentsapp.model;

public class Student {
    private String name;
    private String id;
    private String phone;
    private String address;
    private String avatarUrl;
    private Boolean cb;

    public String getName() {
        return this.name;
    }

    public String getId() {
        return this.id;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getAddress() {
        return this.address;
    }

    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public Boolean getCb() {
        return this.cb;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public void setCb(Boolean cb) {
        this.cb = cb;
    }

    public Student(String name, String id, String phone, String address, String avatarUrl, Boolean cb) {
        this.name = name;
        this.id = id;
        this.phone = phone;
        this.address = address;
        this.avatarUrl = avatarUrl;
        this.cb = cb;
    }
}
