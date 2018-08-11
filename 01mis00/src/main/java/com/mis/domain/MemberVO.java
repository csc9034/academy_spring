package com.mis.domain;

import java.util.Date;

public class MemberVO {
	
	// 1. 멤버 변수 선언부
	private String userid;
	private String userpw;
	private String username;
	private String email;
	private Date regdate;
	private Date updatedate;
	
	// 2. 생성사 선언부
	// (1) 기본생성자 선언
	public MemberVO() {
		super();
	}
	
	// (2) 파라미터를 가지는 생성사 선언
	public MemberVO(String userid) {
		this.userid = userid;
	}
	
	public MemberVO(String userid, String userpw) {
		this(userid);
		this.userpw = userpw;
	}

	public MemberVO(String userid, String userpw, String username) {
		this(userid, userpw);
		this.username = username;
	}
	public MemberVO(String userid, String userpw, String username, String email) {
		this(userid, userpw, username);
		this.email = email;
	}
	
	// 3. setter, getter 메소드 생성
	public String getUserid() {
		return userid;
	}
	
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	public String getUserpw() {
		return userpw;
	}

	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Date getRegdate() {
		return regdate;
	}
	
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public Date getUpdatedate() {
		return updatedate;
	}

	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}

	// 4. toString() 오버라이딩
	@Override
	public String toString() {
		return "MemberVO [userid=" + userid + ", userpw=" + userpw + ", username=" + username + ", email=" + email
				+ ", regdate=" + regdate + ", updatedate=" + updatedate + "]";
	}
	
	
	
}
