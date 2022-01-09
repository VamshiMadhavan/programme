package com.technoelevate.hibernate;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Scanner sc = new Scanner(System.in);
    	   Team player1 = new Team();
           int n = sc.nextInt();
           String name = sc.next();
           double sal = sc.nextDouble();
           String desig=sc.next();
           player1.setId(n);
           player1.setName(name);
           player1.setSalary(sal);
           player1.setDesignation(desig);
           EntityManagerFactory emf= Persistence.createEntityManagerFactory("team1");
           EntityManager em = emf.createEntityManager();
           EntityTransaction transaction = em.getTransaction();
           transaction.begin();
           em.persist(player1);
           transaction.commit();
       
    }
}
