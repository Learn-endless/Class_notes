package com.learn.service;

import com.learn.bean.User;
import com.learn.dao.UserDao;
import com.learn.dao.UserDaoImpl;

import java.util.List;

public class UserServiceImpl implements UserService{
    private UserDao dao = new UserDaoImpl();

    @Override
    public List<User> findAll() {
        //调用Dao完成查询
        return dao.findAll();
    }

    @Override
    public User login(User user) {
        return dao.findUserByUsernameAndPassword(user.getUsername(),user.getPassword());
    }

    @Override
    public void addUser(User user) {
        dao.add(user);
    }
}
