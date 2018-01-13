package com.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.jap.utility.Employee;
import com.jpa.dao.EmployeeDAO;

/**
 * @author Naman
 *
 */

public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;
	
	public List<Employee> findAllEmployee() {
		return employeeDAO.findAllEmployee() ;
	}

	public Employee findEmployeeById(int id) {
		return employeeDAO.findEmployeeById(id);
	}

	public String saveEmployee(Employee employee) {
		return employeeDAO.saveEmployee(employee);
	}

	public int deleteEmployee(int id) {
		return employeeDAO.deleteEmployee(id);
	}

	public void updateEmployee(Employee employee) {
		
	}

	
}
