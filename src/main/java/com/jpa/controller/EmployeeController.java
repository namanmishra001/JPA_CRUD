package com.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import com.jap.utility.Employee;
import com.jpa.service.EmployeeService;

/**
 * @author Naman
 *
 */
@Controller
public class EmployeeController {
	@Autowired
	private static EmployeeService employeeService;

	public static void main(String[] args) {

		List<Employee> empList = employeeService.findAllEmployee();
		for (Employee employee : empList) {
			System.out.println(
					"Eno: " + employee.getEno() + " Name: " + employee.getName() + " salary: " + employee.getSalary());
		}

		/*Employee employee = new Employee();
		employee.setEno(2);
		employee.setName("Jeetu");
		employee.setSalary(234123d);
		
		Employee employeeById = employeeService.findEmployeeById(1);
		System.out.println(employeeById);

		String employeeData = employeeService.saveEmployee(employee);
		System.out.println(employeeData);

		int deleteEmployee = employeeService.deleteEmployee(1);
		System.out.println(deleteEmployee);

		employeeService.updateEmployee(employee);
*/	}
}
