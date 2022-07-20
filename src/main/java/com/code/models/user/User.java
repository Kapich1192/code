package com.code.models.user;

public class User {
    /*fields*/
    private Long id;

    private String name;
    private String lastname;
    private String login;
    private String password;
    private String tel;
    private String email;
    /*constructors*/
    public User() {}

    /*getters*/
    public String getName(){return name;}
    public String getLastname(){return lastname;}
    public String getLogin(){return login;}
    public String getPassword(){return password;}
    /*setters*/
}
