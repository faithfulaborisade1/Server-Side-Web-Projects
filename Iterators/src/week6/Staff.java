package week6;

import java.io.Serializable;

public class Staff implements Serializable {
	
	private int staffID;
	private String staffName;
	private String staffAddress;
	private int staffSalary;
	
	public Staff(int id, String name, String address, int salary) {
		this.staffID = id;
		this.staffName = name;
		this.staffAddress = address;
		this.staffSalary = salary;
	}

	public int getStaffID() {
		return staffID;
	}

	public void setStaffID(int staffID) {
		this.staffID = staffID;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getStaffAddress() {
		return staffAddress;
	}

	public void setStaffAddress(String staffAddress) {
		this.staffAddress = staffAddress;
	}

	public int getStaffSalary() {
		return staffSalary;
	}

	public void setStaffSalary(int staffSalary) {
		this.staffSalary = staffSalary;
	}
	
	

}
