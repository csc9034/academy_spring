package com.mis.dto;

public class LoginDTO {

	private String usid;
	private String uspw;
	private boolean useCookies;

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

	public boolean isUseCookies() {
		return useCookies;
	}

	public void setUseCookies(boolean useCookies) {
		this.useCookies = useCookies;
	}

	@Override
	public String toString() {
		return "LoginDTO [usid=" + usid + ", uspw=" + uspw + ", useCookies=" + useCookies + "]";
	}
	
	

}
