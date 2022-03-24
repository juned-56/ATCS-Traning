package com.ia;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ia.entity.Employee;
import com.ia.service.EmployeeService;

@SpringBootTest
class SpringBootApplicationDemo1ApplicationTests {
	@Autowired
	EmployeeService service;
//	@Test
//	void testAddEmployee() {
//		Employee employee = new Employee(115, "juned", 2000, "mumbai");
//		Employee employee1 = new Employee(112, "Jhon", 12000, "delhi");
//		Employee employee2 = new Employee(113, "mone", 5000, "lucknow");
//		Employee employee3 = new Employee(114, "piku", 70000, "hydrabad");
//		Employee emp = service.addEmployee(employee);
//		Employee emp1 = service.addEmployee(employee1);
//		Employee emp2 = service.addEmployee(employee2);
//		Employee emp3 = service.addEmployee(employee3);
//		assertEquals(emp.getEmpName(), "juned");
//		assertEquals(emp1.getEmpName(), "jhon");
//		assertEquals(emp2.getEmpName(), "mone");
//		assertEquals(emp3.getEmpName(), "piku");
//	}
	
//update
//	@Test
//	void testUpdateEmployee() {
//		Employee employee = new Employee(111, "javed", 2000, "mumbai");
//		Employee emp = service.updateEmployee(employee);
//		assertEquals(emp.getEmpName(), "juned");
//	}

	
//Delete
//	@Test
//	void testDeletEmployee() {
//		String emp=service.deleteEmployee(111);
//		assertEquals(emp,"employee deleted");
//	}
	
//Find
//	@Test
//	void testGetEmployee() {
//		Employee emp = service.getEmployee(114);
//		System.out.println(emp);
//		assertEquals(emp,"employee Printed");
//	}
	
//GetAll Deatils
	@Test
	void testGetAllEmployee() {
		List<Employee> l1 = service.getAllEmployee();
		System.out.println("\t Employee Id  \t Employee Name  \t Employee Salary \t Employee Address");
		System.out.println("******************************************************************************************************");
		for (Employee p1 : l1) {
			System.out.println(" \t" + p1.getEmpId() + " \t\t "
					+ p1.getEmpName() + " \t \t \t \t" + p1.getEmpSal()
					+ " \t \t \t \t" + p1.getEmpAdd());}
		System.out.println("******************************************************************************************************");
		assertEquals(l1, "employee Printed");
	}
}
