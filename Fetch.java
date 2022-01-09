package com.technoelevate.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Fetch {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Team");
		EntityManager em = emf.createEntityManager();
		Team player = em.find(Team.class, 1);
		//Team player2 = em.getReference(Team.class, 27);//hit db when we use reference
		System.out.println(player);
	//	System.out.println(player2);
	}

}
