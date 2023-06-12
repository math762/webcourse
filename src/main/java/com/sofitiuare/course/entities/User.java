package com.sofitiuare.course.entities;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String password;

    public User() {

    }

    public User(Long id, String name, String email, String phone, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "name "
                + getName()
                + ", "
                + "email "
                + getEmail()
                + ", "
                + "phone "
                + getPhone()
                + ", "
                + "password "
                + "***********";
    }
}