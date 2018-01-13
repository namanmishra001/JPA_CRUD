/**
 * 
 */
package com.jpa.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jap.utility.Employee;

/**
 * @author Naman
 *
 */
@Service
public interface EmployeeService {

	public List<Employee> findAllEmployee();

	public Employee findEmployeeById(int id);

	public String saveEmployee(Employee employee);

	public int deleteEmployee(int id);

	public void updateEmployee(Employee employee);
}