package com.web.board.vo;

public class LoginVO {

	private String id;
	private String passward;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassward() {
		return passward;
	}
	public void setPassward(String passward) {
		this.passward = passward;
	}
	@Override
	public String toString() {
		return "LoginVO [id=" + id + ", passward=" + passward + "]";
	}
	
}
