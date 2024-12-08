package com.example.student;

import java.time.LocalDate;

public class Student {

    private Long id;
    private String name;
    private String email;
    private LocalDate dateOfBirth;
    private Integer age;

    //Constructors:
    public Student() {
    }
    
    public Student( Long id, 
                    String name,
                    String email,
                    LocalDate dateOfBirth,
                    Integer age){
                        this.id = id; 
                        this.name = name;
                        this.email = email;
                        this.dateOfBirth = dateOfBirth;
                        this.age = age;
    }
    public Student( String name,
                    String email,
                    LocalDate dateOfBirth,
                    Integer age){
                        this.name = name;
                        this.email = email;
                        this.dateOfBirth = dateOfBirth;
                        this.age = age;
    }

    //Getters and seters:
    public void setId(Long id){
        this.id=id;
    }
    public Long getId(){
        return id;
    }
    
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return email;
    }
    
    public void setDob(LocalDate dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    public LocalDate getDob(){
        return dateOfBirth;
    }

    public void setAge(Integer age){
        this.age=age;
    }
    public Integer getAge(){
        return age;
    }
    





}


