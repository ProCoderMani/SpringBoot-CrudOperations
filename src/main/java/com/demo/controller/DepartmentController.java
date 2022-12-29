package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Department;
import com.demo.service.DepartmentService;
import com.demo.service.DepartmentServiceImpl;

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
// Post is here =================================================================s
	
	@PostMapping("/registerDepartment")
	public Department saveDepartment(@RequestBody Department department) {
		System.out.println(departmentService.saveDepartment(department));
		return departmentService.saveDepartment(department);	
	}
	
// Get is here====================================================	
	
	@GetMapping("/departmentUsers")
	public List<Department> getDepartment() {
		return departmentService.getDepartment();

	}
	
	@GetMapping("/departmentUsers/{id}")
	public Department getDepartmentById(@PathVariable("id") Long departmentId) {
		return departmentService.getDepartmentById(departmentId);
	}

// Delete is here=======================================	
	
	@DeleteMapping("/deleteDepartment")
	public Department deleteDepartment() {
		return departmentService.deleteDepartment();
	}
	
	@DeleteMapping("/deleteDepartment/{id}")
	public Department deleteDepartmentById(@PathVariable("id") Long departmentId) {
		return departmentService.deleteDepartmentById(departmentId);
	}
	
// Update is here ============================================================
	
	@PutMapping("/udpateDepartment/{id}")
	public Department updateDepartment(@PathVariable("id") Long departmentId , @RequestBody Department department ) {
		return departmentService.updateDepartment(departmentId, department);
	}
	
// again on get data ======================================
	
	@GetMapping("/getDepartmentByName/name/{name}")
	public Department getDepartmentByName(@PathVariable("name") String name) {
		return departmentService.getDepartmentByName(name);
	}
	
}
