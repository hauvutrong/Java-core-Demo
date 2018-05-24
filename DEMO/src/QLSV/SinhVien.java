package QLSV;

import java.io.Serializable;

public class SinhVien implements Serializable {
private int id;
private String name,address;
private int age;
private double gpa;


public SinhVien() {
	super();
}


public SinhVien(int id, String name, String address, int age, double gpa) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
	this.age = age;
	this.gpa = gpa;
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
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public double getGpa() {
	return gpa;
}
public void setGpa(double gpa) {
	this.gpa = gpa;
}

}
