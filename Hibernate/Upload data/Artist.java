// src\main\java\com\artist\DemoHib\

package com.artist.DemoHib;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

//@Entity(name="artist_table") // use table name = 'artist_table'
@Entity
//@Table(name="artist_table")
public class Artist {
	@Id
	private int aid;
//	@Transient
	private String aname;
//	@Column(name="alien_color")
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
}
