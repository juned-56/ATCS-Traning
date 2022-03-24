package com.jp.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jp.dao.EmployeeDao;
import com.jp.entity.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	EmployeeDao dao;
	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return dao.save(employee);
	}
	@Override
	public void deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		dao.deleteById(empId);
	}
	@Override
	public Iterable<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
	@Override
	public Optional<Employee> getEmployee(int empId) {
		// TODO Auto-generated method stub
		return dao.findById(empId);
	}
	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return dao.save(employee);
	}
	
}
