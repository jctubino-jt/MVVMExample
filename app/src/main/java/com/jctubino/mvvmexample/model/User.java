package com.jctubino.mvvmexample.model;

public class User {

    private String email;
    private String password;
    public String emailHint;
    public String passwordHint;

    public User() {
    }

    public User(String emailHint, String passwordHint) {
        this.emailHint = emailHint;
        this.passwordHint = passwordHint;
    }
}
