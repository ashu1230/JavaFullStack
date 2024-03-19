package com.ashu.JpaDemo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
    	
    	Alien a = new Alien();
    	a.setAid(120);
    	a.setAname("Ashutosh Maurya");
    	a.setTech("Full Stack");
    	
    	
        // Specify the persistence unit name
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence-unit-name");
    	EntityManager em = emf.createEntityManager();
//    	Alien a = em.find(Alien.class, 4);
    	
    	
    	em.getTransaction().begin();
    	em.persist(a);
    	em.getTransaction().commit();
    	System.out.println(a);
    }
}
