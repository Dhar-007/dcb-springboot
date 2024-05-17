package com.dacodeb.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dacodeb.demo.entity.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Long>{

}
