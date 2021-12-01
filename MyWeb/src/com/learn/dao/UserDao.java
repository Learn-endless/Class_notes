package com.learn.dao;

import com.learn.bean.User;

import java.util.List;

public interface UserDao {
    public List<User> findAll();
    public User findUserByUsernameAndPassword(String username, String password);
    public void add(User user);
}
