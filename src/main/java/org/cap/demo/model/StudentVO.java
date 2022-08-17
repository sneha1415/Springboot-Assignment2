package org.cap.demo.model;

import java.time.LocalDate;

import org.springframework.lang.NonNull;





public class StudentVO 

{
	

	private int studentId;
	
	private String firstName;
	
	private String lastName;
	
	private String mobileNo;
	
	
	public StudentVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	
	public StudentVO(int studentId, String firstName, String lastName, String mobileNo) {
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNo = mobileNo;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName + ", mobileNo="
				+ mobileNo +"]";
	}
			
	
	
	
}
