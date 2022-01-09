package com.te.manytomany;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.onetmany.Boyss;

public class Test {

	public static void main(String[] args) {
		Boys boys1 = new Boys();
		Boys boys2 = new Boys();
		
		Girls girls1 = new Girls();
		Girls girls2 = new Girls();
	
		
		boys1.setId(4);
		boys1.setName("Shashi");
		
		boys2.setId(5);
		boys2.setName("srayesh");
		
		
		girls1.setId(104);
		girls1.setName("Shashi");
		
		girls2.setId(105);
		girls2.setName("srayesh");
		
		
		
		List<Boys> boys = Arrays.asList(boys1,boys2);
		List<Girls> girls = Arrays.asList(girls1,girls2);
	
		
	    boys1.setGirls(girls); 
	    boys2.setGirls(girls);
	    
	    
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Mapping");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
        em.persist(boys1);
        em.persist(boys2);
        em.persist(girls1);
        em.persist(girls2);
        transaction.commit();


	}

}
