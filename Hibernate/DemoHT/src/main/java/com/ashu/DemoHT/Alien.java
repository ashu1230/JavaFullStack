package com.ashu.DemoHT;

import java.util.ArrayList;

import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

//import javax.persistence.Entity;
//import javax.persistence.Id;

@Entity
public class Alien {
	@Id
	private int aid;
	private AlienName aname;
	
	@OneToMany(mappedBy = "alien")
	private ArrayList<Laptop> laps = new ArrayList<Laptop>(); 
	
	
	public ArrayList<Laptop> getLaps() {
		return laps;
	}
	public void setLaps(ArrayList<Laptop> laps) {
		this.laps = laps;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	  
	public AlienName getAname() {
		return aname;
	}
	public void setAname(AlienName aname) {
		this.aname = aname;
	}
//	public String getColor() {
//		return color;
//	}
//	public void setColor(String color) {
//		this.color = color;
//	}
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + "]";
	}
	
	
}
