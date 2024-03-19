package com.ashu.DemoHT;

import jakarta.persistence.Embeddable;

@Embeddable 
public class AlienName {
	private String fname;
	private String sname;
	private String mname;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	@Override
	public String toString() {
		return "AlienName [fname=" + fname + ", sname=" + sname + ", mname=" + mname + "]";
	}
	
	
}
