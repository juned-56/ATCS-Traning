package com.jp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jp.entity.Employee;
import com.jp.service.EmployeeService;

@RestController
@RequestMapping("/employee") //class level url:http://localhost:2020/employee
public class EmployeeController {
	@Autowired
	EmployeeService service;
	
	//post()--insert, get()-->get,put()-->save,delete()--remove
	
	
	@PostMapping("/addEmployee") //method level url: http://localhost:2020/employee/addEmployee
	public Employee addEmployee(@RequestBody Employee emp) {
		return service.addEmployee(emp);
	}
	
	
	@PutMapping("/updateEmployee") //method level url: http://localhost:2020/employee/updateEmployee
	public Employee updateEmployee(@RequestBody Employee emp) { //@RequestBody to convert the json format into java code
		return service.updateEmployee(emp);
	}
	
	@GetMapping("/getEmployee/{eid}") //method level url: http://localhost:2020/employee/getEmployee/eid
	public Optional<Employee> getEmployee(@PathVariable("eid") int empId) {
		return service.getEmployee(empId);
	}
	
	@GetMapping("/getAllEmployee") //method level url: http://localhost:2020/employee/getAllEmployee
	public Iterable<Employee> getAllEmployee() { //@RequestBody to convert the json format into java code
		return service.getAllEmployee();
	}
	
	@DeleteMapping("/deleteEmployee/{eid}") //method level url: http://localhost:2020/employee/deleteEmployee/eid
	public void deleteEmployee(@PathVariable("eid") int empId) {
		 service.deleteEmployee(empId);
	}
}

