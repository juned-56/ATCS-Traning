package com.ia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ia.entity.Employee;
import com.ia.service.EmployeeService;

@RestController
@RequestMapping("/employee") //class level url:http://localhost:7070/employee
public class EmployeeController {
	@Autowired
	EmployeeService service;
	
	//post()--insert, get()-->get,put()-->save,delete()--remove
	
	
	@PostMapping("/addEmployee") //method level url: http://localhost:7070/employee/addEmployee
	public Employee addEmployee(@RequestBody Employee emp) {
		return service.addEmployee(emp);
	}
	
	
	@PutMapping("/updateEmployee") //method level url: http://localhost:7070/employee/updateEmployee
	public Employee updateEmployee(@RequestBody Employee emp) { //@RequestBody to convert the json format into java code
		return service.updateEmployee(emp);
	}
	
	@GetMapping("/getEmployee/{eid}") //method level url: http://localhost:7070/employee/getEmployee/eid
	public Employee getEmployee(@PathVariable("eid") int empId) {
		return service.getEmployee(empId);
	}
	
	@GetMapping("/getAllEmployee") //method level url: http://localhost:7070/employee/getAllEmployee
	public List<Employee> getAllEmployee() { //@RequestBody to convert the json format into java code
		return service.getAllEmployee();
	}
	
	@DeleteMapping("/deleteEmployee/{eid}") //method level url: http://localhost:7070/employee/deleteEmployee/eid
	public String deleteEmployee(@PathVariable("eid") int empId) {
		return service.deleteEmployee(empId);
	}
}
