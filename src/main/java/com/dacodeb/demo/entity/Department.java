package com.dacodeb.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long DepartmentId ;
	
	@NotBlank(message = "Pls Add Department name")
	private String DepartmentName ;
	private String DepartmentAddress ;
	private String DepartmentCode ;
	
	
	public Long getDepartmentId() {
		return DepartmentId;
	}
	public void setDepartmentId(Long departmentId) {
		DepartmentId = departmentId;
	}
	public String getDepartmentName() {
		return DepartmentName;
	}
	public void setDepartmentName(String departmentName) {
		DepartmentName = departmentName;
	}
	public String getDepartmentAddress() {
		return DepartmentAddress;
	}
	public void setDepartmentAddress(String departmentAddress) {
		DepartmentAddress = departmentAddress;
	}
	public String getDepartmentCode() {
		return DepartmentCode;
	}
	public void setDepartmentCode(String departmentCode) {
		DepartmentCode = departmentCode;
	}
	public Department(Long departmentId, String departmentName, String departmentAddress, String departmentCode) {
		super();
		DepartmentId = departmentId;
		DepartmentName = departmentName;
		DepartmentAddress = departmentAddress;
		DepartmentCode = departmentCode;
	}
	@Override
	public String toString() {
		return "Department [DepartmentName=" + DepartmentName + ", DepartmentAddress=" + DepartmentAddress + "]";
	}
	public Department() {
		super();
	}
	
	

}
