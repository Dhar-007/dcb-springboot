package com.dacodeb.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dacodeb.demo.entity.Department;
import com.dacodeb.demo.repository.DepartmentRepo;

@Service
public class DepartmentServiceImpl implements DepartmentInterface {

	@Autowired
	private DepartmentRepo repo ;
	
	@Override
	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		return repo.save(department) ;
		
	}
	

}
