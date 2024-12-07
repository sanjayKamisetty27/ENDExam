package com.klef.jfsd.exam1;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;


@Entity
@Table(name = "tablet_table")
public class Tablet  extends Device
{
	private String screensize;
	private int batterlife;
	public String getScreensize() {
		return screensize;
	}
	public void setScreensize(String screensize) {
		this.screensize = screensize;
	}
	public int getBatterlife() {
		return batterlife;
	}
	public void setBatterlife(int batterlife) {
		this.batterlife = batterlife;
	}
}
