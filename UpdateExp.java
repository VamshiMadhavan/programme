package com.technoelevate.hibernate;

import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateExp {
	
	public static final Logger LOGGER = Logger.getLogger(Team.class.getName());

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Team");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		Team hp = em.find(Team.class, 9);
		//System.out.println(hp);
		if(hp!=null) {
			hp.setDesignation("Batsman");
			transaction.begin();
			transaction.commit();
			LOGGER.info ("updted");
		
		}

	}

}
