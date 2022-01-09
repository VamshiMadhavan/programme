package com.technoelevate.hibernate;

import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Remove {
	
	public static final Logger LOGGER = Logger.getLogger(Team.class.getName());
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Team");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		Team benstoke = em.find(Team.class, 2);
		transaction.begin();
		em.remove(benstoke);
		transaction.commit();
		LOGGER.info("Removed");
		

	}

}
