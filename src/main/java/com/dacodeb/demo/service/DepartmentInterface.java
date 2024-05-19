package com.dacodeb.demo.service;

import java.util.List;

//import com.dacodeb.demo.controller.List;
import com.dacodeb.demo.entity.Department;

public interface DepartmentInterface {

	public Department saveDepartment(Department department);

	public List<Department> fetchDepartmentList();
	
}
