package com.jp.dao;

import org.springframework.data.repository.CrudRepository;

import com.jp.entity.Employee;

public interface EmployeeDao extends CrudRepository<Employee, Integer>{

}
