package com.dao;

import java.util.List;

import com.entities.User;

public interface UserDao {
	public List<User> list();
	public boolean delete(User user);
	public boolean saveOrUpdate(User user);
	
	public List<User> findByFirstName();
	public List<User> findByMiddleName();
	public List<User> findByLastName();
	public List<User> findByFirstMiddleName();
	public List<User> findByFirstLastName();
	public List<User> findByMiddleLastName();
	public List<User> findByFisrtMiddleLastName();
	public List<User> findByNameLike();
	
	public List<User> findByAge();
	public List<User> findByAgeBetween();
	public List<User> findByLessAge();
	public List<User> findByMoreAge();
	
	public List<User> findByBirth();
	public List<User> findByBirthBetween();
	public List<User> findByLessBirth();
	public List<User> findByMoreBirth();
	
	public List<User> findByEmail();
	public List<User> findByEmailLike();
	
	public List<User> findByFisrtNameAndAge();
	public List<User> findByFisrtNameAndBirth();
	
	public List<User> findByFisrtNameOrAge();
	public List<User> findByFisrtNameOrBirth();
	
	public List<User> findByFisrtNameAndAgeAndPassword();
	
	public List<User> findByUsersPageWise();
	
	public List<User> findByMinAge();
	public List<User> findByMinBirth();
	
	public List<User> findByMaxAge();
	public List<User> findByMaxBirth();
	
	public List<User> findByFirstNameInDesc();
	public List<User> findByFirstNameInAsc();
	public List<User> findByFisrtMiddleLastNameInDescByFirstName();
}
