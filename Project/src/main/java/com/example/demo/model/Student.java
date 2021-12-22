package com.example.demo.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Document(collection = "student")
public class Student {
	@Id
	private long ID;
	@Column(name="contact",nullable=false)
	private long contact;//contact number
	@Column(name="fname",nullable=false)
	private String fname;//first name
	@Column(name="lname")
	private String lname;//last name
	@Column(name="dob",nullable=false)
	private String dob;
	@Column(name="age")
	private double age;
	@Column(name="college",nullable=false)
	private String college;
	@Column(name="section")
	private char section;
	@Column(name="branch",nullable=false)
	private String branch;
	@Column(name="email",nullable=false)
	private String email;
	public Student() {
		super();

	}
	public Student(long Id, long contact, String fname, String lname, String dob, double age, String college,char section, String branch,String email) {
		super();
		this.ID = Id;
		this.contact=contact;
		this.fname = fname;
		this.lname = lname;
		this.dob = dob;
		this.age = age;
		this.college = college;
		this.section = section;
		this.branch = branch;
		this.email = email;
	}
	public long getId() {
		return ID;
	}
	public void setId(long Id) {
		this.ID = Id;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getfName() {
		return fname;
	}
	public void setfName(String fname) {
		this.fname = fname;
	}
	public String getlName() {
		return lname;
	}
	public void setlName(String lname) {
		this.lname = lname;
	}
	public String getDOB() {
		return dob;
	}
	public void setDOB(String dob) {
		this.dob = dob;
	}
	public double getAge() {
		return age;
	}
	public void setAge(double age) {
		this.age = age;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public char getSection() {
		return section;
	}
	public void setSection(char section) {
		this.section = section;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
