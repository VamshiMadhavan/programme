package com.te.onetone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MyClass {

	public static void main(String[] args) {
		Girl girl = new Girl();
		Boy boy = new Boy();
		
		Girl girl1 = new Girl();
		Boy boy1 = new Boy();
		
		boy.setName("Narendran");
		boy.setId(105);
		girl.setName("Rachita");
		girl.setId(5);
		girl.setB(boy);
		boy.setGirl(girl);
		
	/*	boy1.setName("Virat");
		boy1.setId(103);
		girl1.setName("Anushka sharma");
		girl1.setId(3);
		girl1.setB(boy1);
		boy1.setGirl(girl1);*/
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Mapping");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(boy);
		em.persist(girl);
		transaction.commit();
		

	}

}
