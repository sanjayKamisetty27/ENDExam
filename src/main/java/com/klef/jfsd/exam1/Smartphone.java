package com.klef.jfsd.exam1;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Table(name = "smart_table")
public class Smartphone extends Device
{
	private String os;
	private int camerares;
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public int getCamerares() {
		return camerares;
	}
	public void setCamerares(int camerares) {
		this.camerares = camerares;
	}
}
