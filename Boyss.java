package com.te.onetmany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Boyss {
	@Id
	private int id;
	private String name;
	@ManyToOne
	private Girlss girl;

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

	public Girlss getGirl() {
		return girl;
	}

	public void setGirl(Girlss girl) {
		this.girl = girl;
	}

	@Override
	public String toString() {
		return "Boy [id=" + id + ", name=" + name + ", girl=" + girl + "]";
	}
}
