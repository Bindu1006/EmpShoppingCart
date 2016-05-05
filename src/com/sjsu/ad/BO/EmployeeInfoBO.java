package com.sjsu.ad.BO;

public class EmployeeInfoBO {
	
	private String empName;
	
	private String empEmail;
	
	private String empDisplayName;

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getEmpDisplayName() {
		return empDisplayName;
	}

	public void setEmpDisplayName(String empDisplayName) {
		this.empDisplayName = empDisplayName;
	}

	@Override
	public String toString() {
		return "EmployeeInfoBO [empName=" + empName + ", empEmail=" + empEmail
				+ ", empDisplayName=" + empDisplayName + "]";
	}
	
	

}
