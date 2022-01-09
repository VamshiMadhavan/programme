package com.te.manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;



@Entity
public class Boys {
	@Id
	private int id;
	private String name;
	
	@ManyToMany
	private List<Girls> girls;

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

	public List<Girls> getGirls() {
		return girls;
	}

	public void setGirls(List<Girls> girls) {
		this.girls = girls;
	}

	@Override
	public String toString() {
		return "Boys [id=" + id + ", name=" + name + ", girls=" + girls + "]";
	}

	
}
