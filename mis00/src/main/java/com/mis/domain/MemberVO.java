package com.mis.domain;

import java.util.Date;

public class MemberVO {
	
	// 1. ��� ���� �����
	private String userid;
	private String userpw;
	private String username;
	private String email;
	private Date regdate;
	private Date updatedate;
	
	// 2. ������ �����
	// (1) �⺻������ ����
	public MemberVO() {
		super();
	}
	
	// (2) �Ķ���͸� ������ ������ ����
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
	
	// 3. setter, getter �޼ҵ� ����
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

	// 4. toString() �������̵�
	@Override
	public String toString() {
		return "MemberVO [userid=" + userid + ", userpw=" + userpw + ", username=" + username + ", email=" + email
				+ ", regdate=" + regdate + ", updatedate=" + updatedate + "]";
	}
	
	
	
}
