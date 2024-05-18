package com.dacodeb.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dacodeb.demo.entity.Department;
import com.dacodeb.demo.service.DepartmentInterface;

@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentInterface service ;
	
	@PostMapping("/departments")
	public Department saveDepartment(@RequestBody Department department) {
		
		return service.saveDepartment(department);
	}

}
