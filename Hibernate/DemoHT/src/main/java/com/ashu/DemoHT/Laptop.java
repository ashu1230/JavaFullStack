package com.ashu.DemoHT;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Laptop {
	@Id
	private int lid;
	private String lname;
	
//	@ManyToOne
//	private Student student;
	
	private Alien alien;
	
	public int getId() {
		return lid;
	}
	public void setId(int id) {
		this.lid = id;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
//	public Student getStudent() {
//		return student;
//	}
//	public void setStudent(Student student) {
//		this.student = student;
//	}
	@Override
	public String toString() {
		return "Laptop [id=" + lid + ", lname=" + lname + "]";
	}
	
	
	
}
