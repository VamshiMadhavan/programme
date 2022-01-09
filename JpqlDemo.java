package com.technoelevate.hibernate;

import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.technoelevate.hibernate2.Employee;

public class JpqlDemo{

	public static final Logger LOGGER = Logger.getLogger(Team.class.getName());

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("new");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		String query = "from team";
		Query createQuery = em.createQuery(query);
	//	String query1 = "from Team where id = 1 ";
	//	Query createQuery = em.createQuery(query1);
		//Object singleResult = createQuery.getSingleResult();
		//System.out.println(singleResult);
	    List<Team> resultList = createQuery.getResultList();
		for (Team team : resultList) {
			System.out.println(team);
		}
		transaction.commit();
		LOGGER.info("Fetched every vlaues of table");
		/*String query2 = "select min(salary)from Team  ";
		Query createQuery2 = em.createQuery(query2);
		Object singleResult2 =  createQuery.getSingleResult();
		System.out.println(singleResult2);*/
		
		/*String query3 = "select min(salary)from Team  ";
		Query createQuery3 = em.createQuery(query3);
		Double singleResult3=(Double) createQuery3.getSingleResult();
		System.out.println(singleResult3);
		
		/*EntityTransaction transaction = em.getTransaction();
		String query4 = "update Team set salary=2500 where id =34";
		transaction.begin();
		Query createQuery4 = em.createQuery(query3);
		int update = createQuery4.executeUpdate();
		transaction.commit();*/
		
		/*EntityTransaction transaction = em.getTransaction();
		String query4 = "delete from Team where id = 45";
		transaction.begin();
		Query createQuery4 = em.createQuery(query4);
		int update = createQuery4.executeUpdate();
		transaction.commit();*/
		
		/*EntityTransaction transaction = em.getTransaction();
		String q = "update Team set salary=:sal where id=:i";
		transaction.begin();
		Query createQ = em.createQuery(q);
		createQ.setParameter("sal", 11000.0);
		createQ.setParameter("i", 1);
		int executeUpdate = createQ.executeUpdate();
		transaction.commit();*/
		
		

	}

}
