package com.OneToMany.App;

import java.io.*;

import javax.persistence.*;
@Entity
public class Children implements Serializable 
{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private long id;
private String name;
private char gender;

@ManyToOne
private Father father;

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

public Father getFather() {
	return father;
}

public void setFather(Father father) {
	this.father = father;
}


public Children() {
	super();
}

@Override
public String toString() {
	return "Children [id=" + id + ", name=" + name + ", gender=" + gender + "]";
}


}
