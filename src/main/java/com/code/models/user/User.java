package com.code.models.user;

import javax.persistence.*;

@Entity
@Table(name = "usr")
public class User {
    /*fields*/
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
