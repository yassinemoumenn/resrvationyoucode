package com.reservation.dao;

import com.reservation.model.User;

import java.util.List;

public interface UserDao {
    public  void createUser(User user);
    public User getUserById(Long id);
    public List<User> getAllUsers();
    public void dropUser(Long id);
    public User updateUser(User user);
}
