package com.reservation.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.reservation.dao.UserDao;
import com.reservation.model.User;

@Service
@Component("UserService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	@Qualifier("userDao")
	private UserDao userDao;

	@Transactional

	public List<User> findAll() {
		return userDao.getAllUsers();

	}

	public User findById(Long id) {
		return userDao.getUserById(id);	}

	

	public void save(User user) {
		userDao.createUser(user);
		
	}

	
	public void dropUser(Long id) {
		userDao.dropUser(id);
		
	}}

	
	
