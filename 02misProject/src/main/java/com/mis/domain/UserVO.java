package com.mis.domain;

public class UserVO {
	private String usid;
	private String uspw;
	private String uname;
	private int upoint;

	public String getUsid() {
		return usid;
	}

	public void setUsid(String usid) {
		this.usid = usid;
	}

	public String getUspw() {
		return uspw;
	}

	public void setUspw(String uspw) {
		this.uspw = uspw;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public int getUpoint() {
		return upoint;
	}

	public void setUpoint(int upoint) {
		this.upoint = upoint;
	}

	@Override
	public String toString() {
		return "UserVO [usid=" + usid + ", uspw=" + uspw + ", uname=" + uname + ", upoint=" + upoint + "]";
	}
	
	
}
