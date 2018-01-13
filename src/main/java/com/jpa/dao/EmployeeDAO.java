/**
 * 
 */
package com.jpa.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jap.utility.Employee;

/**
 * @author Naman
 *
 */
@Repository
public interface EmployeeDAO {

	public List<Employee> findAllEmployee();

	public Employee findEmployeeById(int id);

	@Transactional
	public String saveEmployee(Employee employee);

	@Transactional
	public int deleteEmployee(int id);

	@Transactional
	public void updateEmployee(Employee employee);
}
