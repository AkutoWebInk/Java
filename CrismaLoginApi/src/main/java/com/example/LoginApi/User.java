package com.example.LoginApi;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id;
    private String name;
    private String username;
    private String password;
    private Integer accessLevel;
    private String userProfilePic;

    //empty constructor
    public User(){}
     
    //constructor
    public User (String name, String username, String password, Integer accessLevel, String userProfilePic){
    this.name = name;
    this.username = username;
    this.password = password;
    this.accessLevel = accessLevel;
    this.userProfilePic = userProfilePic;
    }
    
    //getters
    public Long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    public Integer getAccessLevel(){
        return accessLevel;
    }
    public String getUserpfp(){
        return userProfilePic;
    }

    //setters
    public void setId(Long id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public void setAccessLevel(Integer accessLevel){
        this.accessLevel=accessLevel;
    }
    public void setUserpfp(String userProfilePic){
        this.userProfilePic = userProfilePic;
    }


}
