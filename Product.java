package com.te.hibernate2;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Product {

	@Id
	int id;
	String name;
	@ManyToOne
	Kart kart;
	
	
	
	
	
	
	
	

}
