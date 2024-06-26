package com.dacodeb.demo.service;

import java.util.List;
import java.util.Optional;

//import com.dacodeb.demo.controller.List;
import com.dacodeb.demo.entity.Department;
import com.dacodeb.demo.error.DepartmentNotFoundException;

public interface DepartmentInterface {

	public Department saveDepartment(Department department);

	public List<Department> fetchDepartmentList();

	public Department  getDepartmentByID(Long departmentId) throws DepartmentNotFoundException;
	
}
