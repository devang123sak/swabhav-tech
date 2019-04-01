package com.techlab.model;

public class Department {

	private String deptNo;
	private String dName;
	private String loc;

	public Department(String deptNo, String dName, String loc) {
		this.deptNo = deptNo;
		this.dName = dName;
		this.loc = loc;
	}

	public String getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

}