package com.technoelevate.hibernate2;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.technoelevate.hibernate.Team;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("new");
		Employee employee = new Employee();
		EntityManager em = emf.createEntityManager();
		Query createQuery = em.createQuery("select name from employee");
		List<Employee> list = createQuery.getResultList();
		for(Employee e:list) {
			System.out.println(e.getName());
		}
}
}