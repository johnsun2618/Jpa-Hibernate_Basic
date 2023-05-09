package com.example.jpabasics.Entity;


import jakarta.persistence.*;

@Entity

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    @Column(name="user_name") //if you want change the name from database
    private String name;

    private int age;

    private String mobileNo;


    @OneToOne(mappedBy = "user")
    private Card card;

    public User(){

    }

    public User(int userId, String name, int age, String mobileNo) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.mobileNo = mobileNo;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

}
