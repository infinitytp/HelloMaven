package com.infinitytp.mybatispra.domain;

import java.util.List;

public class Classes {
	private int id;
	private String name;
	private Teacher teacher;
	
	List<Student> students;
	
	
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
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
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Classes [id=" + id + ", name=" + name + ", teacher=" + teacher + ", students=" + students + "]";
	}
	
	
}
