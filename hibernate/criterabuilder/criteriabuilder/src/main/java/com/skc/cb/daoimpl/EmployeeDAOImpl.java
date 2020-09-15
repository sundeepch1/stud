package com.skc.cb.daoimpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.skc.cb.dao.EmployeeDAO;
import com.skc.cb.model.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Employee> getEmployee() {
		//EntityManagerFactory entityManagerFactory = entityManager.getEntityManagerFactory();
		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		CriteriaQuery<Employee> createQuery = criteriaBuilder.createQuery(Employee.class);
		Root<Employee> from = createQuery.from(Employee.class);
		createQuery.select(from);
		
		TypedQuery<Employee> typedQuery = entityManager.createQuery(createQuery);
		
		List<Employee> employees = typedQuery.getResultList();
	
		return employees;
	}
}
