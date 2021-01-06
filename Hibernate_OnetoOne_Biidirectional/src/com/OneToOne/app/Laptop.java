package com.OneToOne.app;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Laptop implements Serializable
{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
int id;
String brand;
String model;
@OneToOne
 private Student student;

public Student getStudent() {
	return student;
}
public void setStudent(Student student) {
	this.student = student;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public Laptop() {
	super();
}
@Override
public String toString() {
	return "Laptop [id=" + id + ", brand=" + brand + ", model=" + model + "]";
}


}
