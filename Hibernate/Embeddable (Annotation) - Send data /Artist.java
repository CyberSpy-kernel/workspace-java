// src\main\java\com\artist\DemoHib\

package com.artist.DemoHib;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="users2")
public class Artist {
	@Id
	private int aid;
	public ArtistName getAname() {
		return aname;
	}
	public void setAname(ArtistName aname) {
		this.aname = aname;
	}
	private ArtistName aname;
	private String color;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
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
