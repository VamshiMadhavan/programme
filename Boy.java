package com.te.onetone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Boy {
	@Id
	private int id;
	private String name;
	
	@OneToOne
	private Girl girl;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Girl getGirl() {
		return girl;
	}

	public void setGirl(Girl girl) {
		this.girl = girl;
	}

	@Override
	public String toString() {
		return "Boy [id=" + id + ", name=" + name + ", girl=" + girl + "]";
	}
	
	
	
	

}
