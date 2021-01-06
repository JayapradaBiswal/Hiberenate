package com.OneToMany.App;

import java.io.*;
import java.util.List;

import javax.persistence.*;
@Entity
public class Father implements Serializable 
{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private long id;
private String name;

@OneToMany(mappedBy="father",fetch=FetchType.EAGER)
private List<Children> listOfChids;

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

public List<Children> getListOfChids() {
	return listOfChids;
}

public void setListOfChids(List<Children> listOfChids) {
	this.listOfChids = listOfChids;
}

public Father() {
	super();
}

@Override
public String toString() {
	return "Father [id=" + id + ", name=" + name + "]";
}




}

