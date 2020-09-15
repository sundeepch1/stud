package com.daoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.UserDao;
import com.entities.User;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {
	
	@Autowired
	SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List<User> list() {
		Criteria c = sessionFactory.getCurrentSession().createCriteria(User.class);
		List<User> users = c.list();
		return users;
	}

	public boolean delete(User user) {
		sessionFactory.getCurrentSession().delete(user);
		return true;
	}

	public boolean saveOrUpdate(User user) {
		sessionFactory.getCurrentSession().saveOrUpdate(user);
		return true;
	}

	public List<User> findByFirstName() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> findByMiddleName() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> findByLastName() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> findByFirstMiddleName() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> findByFirstLastName() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> findByMiddleLastName() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> findByFisrtMiddleLastName() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> findByNameLike() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> findByAge() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> findByAgeBetween() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> findByLessAge() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> findByMoreAge() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> findByBirth() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> findByBirthBetween() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> findByLessBirth() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> findByMoreBirth() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> findByEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> findByEmailLike() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> findByFisrtNameAndAge() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> findByFisrtNameAndBirth() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> findByFisrtNameOrAge() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> findByFisrtNameOrBirth() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> findByFisrtNameAndAgeAndPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> findByUsersPageWise() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> findByMinAge() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> findByMinBirth() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> findByMaxAge() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> findByMaxBirth() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> findByFirstNameInDesc() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> findByFirstNameInAsc() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> findByFisrtMiddleLastNameInDescByFirstName() {
		// TODO Auto-generated method stub
		return null;
	}

}
