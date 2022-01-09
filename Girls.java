package com.te.manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import com.te.onetmany.Boyss;

@Entity
public class Girls {
	@Id
	private int id;
	private String name;
	
	@ManyToMany
	private List<Boys> boys;

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

	public List<Boys> getBoys() {
		return boys;
	}

	public void setBoys(List<Boys> boys) {
		this.boys = boys;
	}

	@Override
	public String toString() {
		return "Girls [id=" + id + ", name=" + name + ", boys=" + boys + "]";
	}

	

}
