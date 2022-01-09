package com.te.onetone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Girl {
	@Id
	private int id;
	private String name;
	
	@OneToOne
	private Boy boy;

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

	public Boy getB() {
		return boy;
	}

	public void setB(Boy boy) {
		this.boy = boy;
	}

	@Override
	public String toString() {
		return "Girl [id=" + id + ", name=" + name + ", boy=" + boy + "]";
	}
	

}
