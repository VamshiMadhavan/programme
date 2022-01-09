package com.te.onetmany;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class Main {

	public static void main(String[] args) {
		Girlss girl = new Girlss();
		Boyss boy = new Boyss();
		Boyss boy2 = new Boyss();
		Boyss boy3 = new Boyss();
		
		boy.setId(1);
		boy.setName("Abi");
		
		boy2.setId(2);
		boy2.setName("salman");
		
		boy3.setId(3);
		boy3.setName("Sharuk");
		
		girl.setId(101);
		girl.setName("Ash");
		
		List<Boyss> list = Arrays.asList(boy,boy2,boy3);
		
		girl.setBoys(list);
		
		boy.setGirl(girl);
		boy2.setGirl(girl);
		boy3.setGirl(girl);
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Mapping");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		
		transaction.begin();
		em.persist(boy);
		em.persist(boy2);
		em.persist(boy3);
		em.persist(girl);
		transaction.commit();
	}

}
