package com.infinitytp.mybatispra.domain;

public class Teacher {
	private int id;
	private String name;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Teacher [id=" + id + ", name=" + name + "]";
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
	
	
}
