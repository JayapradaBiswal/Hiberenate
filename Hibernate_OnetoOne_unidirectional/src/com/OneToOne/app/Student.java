package com.OneToOne.app;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student implements Serializable
{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
int rollNo;
String name;
String branch;
public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
public Student() {
	super();
}
@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", name=" + name + ", branch=" + branch + "]";
}


}
