package com.niit.hrbackend.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.hrbackend.dao.EmployeeDao;
import com.niit.hrbackend.model.Employee;

@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	
	
	 
	public void saveOrUpdateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.saveOrUpdateEmployee(employee);
	}

	 
	public Employee getEmployeeById(int employeeId) {
		// TODO Auto-generated method stub
		return employeeDao.getEmployeeById(employeeId);
	}

	 
	public ArrayList<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeDao.getAllEmployees();
	}

	 
	public void deleteEmployee(int employeeId) {
		// TODO Auto-generated method stub
		  employeeDao.deleteEmployee(employeeId);
	}

}
