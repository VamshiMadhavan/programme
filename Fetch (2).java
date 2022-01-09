package com.technoelevate.hibernate2;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Fetch {
	 EntityManager em =null;
	public static void main(String[] args) {
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the id u want=>");
			int id = sc.nextInt();
			if(id==0) {
				break;
			}
			
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("mapping");
			EntityManager em = emf.createEntityManager();	
			Employee employee= em.find(Employee.class, id);
			EntityTransaction t = em.getTransaction();
			System.out.println("--------------------------------");
			t.begin();
			employee.setName("Rajini");
			t.commit();
			
			System.out.println("--------------------------------");
		}
	}

}
