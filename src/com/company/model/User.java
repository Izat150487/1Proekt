package com.company.model;

import com.company.Gender;
import com.company.YourException;

public class User {
    private String name;
    private int age;
    private int ID;
    private Gender gender;

    public User() {
    }

    public User(String name, int age, int ID, Gender gender) throws YourException {
        this.name = name;
        this.age = age;

        try {
            this.ID = ID;
        } catch (YourException e) {
            System.out.println(e.getMessage());
        }
        this.gender = gender;
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

    public int getId() {
        return ID;
    }

    public void setId(int ID) {
        this.ID = ID;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User: " +
                "name : " + name +
                ", age : " + age +
                ", ID : " + ID + ", " +
                gender;
    }
}
