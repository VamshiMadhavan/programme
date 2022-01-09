package com.technoelevate.hibernate2;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App {
	

	public static void main(String[] args) {
		while(true) {
			Employee employee = new Employee();
			Scanner sc = new Scanner(System.in);
			System.out.println("enter name=>");
			String name = sc.next();
			if(name.equalsIgnoreCase("null")) {
				break;
			}
			System.out.println("enter age=>");
			int age = sc.nextInt();
			System.out.println("enter salary=>");
			double sal = sc.nextDouble();
			employee.setName(name);
			employee.setAge(age);
			employee.setSalary(sal);
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("mapping");
			EntityManager em = emf.createEntityManager();
			EntityTransaction transaction = em.getTransaction();
			transaction.begin();
			em.persist(employee);
			transaction.commit();
			em.close();
			emf.close();
		}
}
}