package com.ManyToMany.App;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
@Entity
public class Student implements Serializable
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String name;
	private char gender;
	@ManyToMany(mappedBy="students")
	List<Teacher> teachers;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public List<Teacher> getTeachers() {
		return teachers;
	}
	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}
	public Student() {
		super();
	}
	
}
