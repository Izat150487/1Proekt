package com.company.dao;

import com.company.model.User;

public class UserDao extends User {
    private User[] users;

    public UserDao() {
    }

    public UserDao(User[] users) {
        this.users = users;
    }


    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "UserDao: " +
                "users: " + users;
    }
 }