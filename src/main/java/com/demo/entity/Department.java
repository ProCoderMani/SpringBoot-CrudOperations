package com.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long departmentId;
	
	private String departmentName;
	private String departmentAddress;
	private String departmentCodeNo;
	public long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(long departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentAddress() {
		return departmentAddress;
	}
	public void setDepartmentAddress(String departmentAddress) {
		this.departmentAddress = departmentAddress;
	}
	public String getDepartmentCodeNo() {
		return departmentCodeNo;
	}
	public void setDepartmentCodeNo(String departmentCodeNo) {
		this.departmentCodeNo = departmentCodeNo;
	}
	public Department(long departmentId, String departmentName, String departmentAddress, String departmentCodeNo) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.departmentAddress = departmentAddress;
		this.departmentCodeNo = departmentCodeNo;
	}
	public Department() {
		super();
	}
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName
				+ ", departmentAddress=" + departmentAddress + ", departmentCodeNo=" + departmentCodeNo + "]";
	}
	
	
	
}
