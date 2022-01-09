package com.te.onetmany;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Girlss {
	@Id
	private int id;
	private String name;
	
	@OneToMany(mappedBy = "girl")
	private List<Boyss> boys;

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

	public List<Boyss> getBoys() {
		return boys;
	}

	public void setBoys(List<Boyss> boys) {
		this.boys = boys;
	}

	@Override
	public String toString() {
		return "Girlss [id=" + id + ", name=" + name + ", boys=" + boys + "]";
	}
}
