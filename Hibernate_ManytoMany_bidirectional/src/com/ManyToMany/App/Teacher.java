package com.ManyToMany.App;
import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
@Entity
public class Teacher implements Serializable
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String name;
	private String teachesSubject;
	@ManyToMany
	List<Student> students;
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
	public String getTeachesSubject() {
		return teachesSubject;
	}
	public void setTeachesSubject(String teachesSubject) {
		this.teachesSubject = teachesSubject;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public Teacher() {
		super();
	}
	
}
