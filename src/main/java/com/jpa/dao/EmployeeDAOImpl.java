package com.jpa.dao;

import java.util.List;

/**
 * @author Naman
 *
 */

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.jap.utility.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	@PersistenceContext
	private EntityManager entityManager;

	public List<Employee> findAllEmployee() {
		TypedQuery<Employee> query = entityManager.createQuery("select e from com.jpa.utility.Employee e",
				Employee.class);
		List<Employee> empList = query.getResultList();
		return empList;
	}

	public Employee findEmployeeById(int id) {
		Employee employee = entityManager.find(Employee.class, id);
		return employee;
	}

	public String saveEmployee(Employee employee) {
		entityManager.persist(employee);
		return "Employee Stored Successfully";
	}

	public int deleteEmployee(int id) {
		Employee employee = entityManager.find(Employee.class, id);
		entityManager.remove(employee);
		return 1;
	}

	public void updateEmployee(Employee employee) {
		Employee findEmployee = entityManager.find(Employee.class, employee.getEno());
		
		if (findEmployee != null) {
			findEmployee.setName(employee.getName());
			findEmployee.setSalary(employee.getSalary());
		}
	}
}