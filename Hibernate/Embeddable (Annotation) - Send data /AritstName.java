// src\main\java\com\artist\DemoHib\

package com.artist.DemoHib;

import jakarta.persistence.Embeddable;

@Embeddable
public class ArtistName {
	private String fname;
	private String mname;
	private String lname;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "ArtistName [fname=" + fname + ", mname=" + mname + ", lname=" + lname + "]";
	}
}
