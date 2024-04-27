// src\main\java\com\artist\DemoHib\

package com.artist.DemoHib;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Artist {
	@Id
	private int aid;
	private String aname;
	private String color;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Artist [aid=" + aid + ", aname=" + aname + ", color=" + color + "]";
	}
}
