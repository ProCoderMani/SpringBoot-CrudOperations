package com.demo.service;

import java.util.List;

import com.demo.entity.Department;

public interface DepartmentService {

	public Department saveDepartment(Department department);

	public List<Department> getDepartment();

	public Department getDepartmentById(Long departmentId);

	public Department deleteDepartmentById(Long departmentId);

	public Department deleteDepartment();

	public Department updateDepartment(Long departmentId, Department department);

	public Department getDepartmentByName(String name);


}
