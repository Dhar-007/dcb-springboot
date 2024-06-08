package com.dacodeb.demo.controller;

import java.util.List;

//import org.hibernate.boot.jaxb.JaxbLogger_.logger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dacodeb.demo.entity.Department;
import com.dacodeb.demo.error.DepartmentNotFoundException;
import com.dacodeb.demo.service.DepartmentInterface;

import jakarta.validation.Valid;

@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentInterface service ;
	
	private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class); 
	
	@PostMapping("/departments")
	public Department saveDepartment(@Valid @RequestBody Department department) {
		
		return service.saveDepartment(department);
	}
	
	@GetMapping("/departments")
	public List<Department> fetchDepartmentList() {
		LOGGER.info("into fetch department List");
		return service.fetchDepartmentList();
	}
	
	@GetMapping("/departments/{id}")
	public Department getDepartmentByID(@PathVariable("id") Long departmentId) throws DepartmentNotFoundException {
		return service.getDepartmentByID(departmentId);
	}

}
