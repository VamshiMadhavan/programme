package com.te.hibernate2;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class User {

	public static void main(String[] args) {
		
		Kart kart = new Kart();
		Product product = new Product();
		Product product2 = new Product();
		
		kart.setKartid(1);
		
		product.setId(101);
		product.setName("t-shirt");
		product2.setId(102);
		product2.setName("mixi");
		
		List<Product> list = Arrays.asList(product,product2);
		
		kart.setProducts(list);
		product.setKart(kart);
		product2.setKart(kart);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mapping");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(kart);
		em.persist(product);
		em.persist(product2);
		transaction.commit();
	}

}
