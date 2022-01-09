package com.te.hibernate2;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Kart {
	
	@Id
	private int kartid;
	@OneToMany(mappedBy = "kart")
	private List<Product> products;
	
	

}
