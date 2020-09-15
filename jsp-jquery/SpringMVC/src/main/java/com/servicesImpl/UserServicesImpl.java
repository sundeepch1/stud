package com.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDao;
import com.entities.User;
import com.services.UserServices;

@Service
public class UserServicesImpl implements UserServices{
	
	@Autowired
	UserDao userDao;
	
	public List<User> list() {
		return userDao.list();
	}

	public boolean delete(User users) {
		return userDao.delete(users);
	}

	public boolean saveOrUpdate(User users) {
		return userDao.saveOrUpdate(users);
	}

}
