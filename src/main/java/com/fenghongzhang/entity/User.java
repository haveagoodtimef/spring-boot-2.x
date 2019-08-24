package com.fenghongzhang.entity;

public class User {
	
	private Integer u_id;
	private String u_name;
	public User() {
		super();
	}
	public User(Integer u_id, String u_name) {
		super();
		this.u_id = u_id;
		this.u_name = u_name;
	}
	public Integer getU_id() {
		return u_id;
	}
	public void setU_id(Integer u_id) {
		this.u_id = u_id;
	}
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	
	@Override
	public String toString() {
		return "User [u_id=" + u_id + ", u_name=" + u_name + "]";
	}
	
	
	
	
	

}
