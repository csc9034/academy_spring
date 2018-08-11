package com.mis.domain;

import java.util.Date;

public class CustomerVO {
	
	// 1. 멤버변수 선언부
	private String userid;
	private String name;
	private int birthyear;
	private String address;
	private String phone;
	private String grade;
	private Date regdate;
	private Date moddate;
	
	// 2. 생성사 선언부
	// (1) 기본 생성자 선언
	public CustomerVO() {
		super();
	}
	
	// (2) 파라미터를 가지는 생성자 선언
	public CustomerVO(String userid) {
		this.userid = userid;
	}
	
	public CustomerVO(String userid, String name, int birthyear, String address, String phone, String grade) {
		this(userid);
		this.name = name;
		this.birthyear = birthyear;
		this.address = address;
		this.phone = phone;
		this.grade = grade;
	}
	
	// 3. setter, getter 선언

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthyear() {
		return birthyear;
	}

	public void setBirthyear(int birthyear) {
		this.birthyear = birthyear;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public Date getModdate() {
		return moddate;
	}

	public void setModdate(Date moddate) {
		this.moddate = moddate;
	}
	
	// 4. toString() 오버라이딩
	@Override
	public String toString() {
		return "CustomerVO [userid=" + userid + ", name=" + name + ", birthyear=" + birthyear + ", address=" + address
				+ ", phone=" + phone + ", grade=" + grade + ", regdate=" + regdate + ", moddate=" + moddate + "]";
	}
	
	

}
