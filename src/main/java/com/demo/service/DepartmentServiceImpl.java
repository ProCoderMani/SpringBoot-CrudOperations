package com.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Department;
import com.demo.repo.DepartmentRepository;

@Service
public class DepartmentServiceImpl  implements DepartmentService{

	@Autowired
	private DepartmentRepository departmentRepository;
	
// post is here ===========================================================	
	
	@Override
	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);
	}

// get is here ======================================================	
	
	@Override
	public List<Department> getDepartment() {
		return departmentRepository.findAll();
	}

	@Override
	public Department getDepartmentById(Long departmentId) {
		return departmentRepository.findById(departmentId).get();
	}
	
// delete is here==================================================
	
	@Override
	public Department deleteDepartment() {
		departmentRepository.deleteAll();
		return null;
	}

	@Override
	public Department deleteDepartmentById(Long departmentId) {
		 departmentRepository.deleteById(departmentId);;
		return null;
	}

// update is here ====================================================
		
	@Override
	public Department updateDepartment(Long departmentId, Department department) {
		Department depb = departmentRepository.findById(departmentId).get();
		if(Objects.nonNull(department.getDepartmentName()) &&  !"".equalsIgnoreCase(department.getDepartmentName()) ) {
			depb.setDepartmentName(department.getDepartmentName());
		}
		
		if(Objects.nonNull(department.getDepartmentAddress()) &&  !"".equalsIgnoreCase(department.getDepartmentAddress()) ) {
			depb.setDepartmentAddress(department.getDepartmentAddress());
		}
		
		if(Objects.nonNull(department.getDepartmentCodeNo()) &&  !"".equalsIgnoreCase(department.getDepartmentCodeNo()) ) {
			depb.setDepartmentCodeNo(department.getDepartmentCodeNo());
		}
		
		return departmentRepository.save(depb);
	}

// again get=======================================================	
	
	@Override
	public Department getDepartmentByName(String name) {
			return departmentRepository.findBydepartmentName(name);
	}

	
	

	

	
}
