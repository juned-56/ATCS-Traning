package com.ia.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ia.entity.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{
	@PersistenceContext
	EntityManager entity;
	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		entity.persist(employee);
		return entity.find(Employee.class, employee.getEmpId());
	}
	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
		return entity.merge(employee);
	}
	@Override
	public String deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		Employee emp = entity.find(Employee.class, empId);
		if(emp != null) {
			entity.remove(emp);
			return "Employee deleted successfully";
		}
		else {
			return "employee not found";
		}
	}
	@Override
	public Employee getEmployee(int empId) {
		// TODO Auto-generated method stub
		return entity.find(Employee.class, empId);
	}
	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		TypedQuery<Employee> result = entity.createQuery("select e from Employee e", Employee.class);
		return result.getResultList();
	}
}
