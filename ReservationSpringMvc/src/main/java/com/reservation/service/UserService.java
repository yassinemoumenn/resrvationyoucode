package com.reservation.service;

import java.util.List;

import com.reservation.model.User;

public interface UserService {
	public List<User>findAll();
    public User findById(Long id);
    public void save(User etudiant) ;
    public void dropUser(Long id) ;
}
