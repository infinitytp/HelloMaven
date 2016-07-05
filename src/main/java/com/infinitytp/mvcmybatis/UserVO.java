package com.infinitytp.mvcmybatis;

public class UserVO {
	
	private int id;
	private String name;
	private String password;
	
	public UserVO() {};
	
	public UserVO(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	
	public UserVO(String name, String password, int id) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
