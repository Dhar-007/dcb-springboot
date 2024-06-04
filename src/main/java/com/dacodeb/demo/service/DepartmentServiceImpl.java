package com.dacodeb.demo.service;

import java.util.List;
import java.util.Optional;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dacodeb.demo.entity.Department;
import com.dacodeb.demo.repository.DepartmentRepo;

import jakarta.transaction.Transactional;


@Service
public class DepartmentServiceImpl implements DepartmentInterface {

	@Autowired
	private DepartmentRepo repo ;
	
	@Override
	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		return repo.save(department) ;
		
	}

	@Override
	public List<Department> fetchDepartmentList() {
		// TODO Auto-generated method stub
		
		return repo.findAll();
	
	}

	@Override
	public Department getDepartmentByID(Long departmentId) {
		// TODO Auto-generated method stub
        //Optional<Department> dept = Optional.ofNullable(repo.getReferenceById(departmentId));
		//System.out.println(dept.get());
        //Department de = dept.get();
        //Hibernate.initialize(de); 
		//return de;
		Department department = repo.findById(departmentId).orElseThrow(() -> new RuntimeException("User not found!!"));
        //Hibernate.initialize(department);  // Initialize the proxy
        return department;
	}
	

}
