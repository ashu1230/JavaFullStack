package com.ashu.DemoHT;

import java.util.ArrayList;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;



public class App 
{
    public static void main( String[] args )
    {
//    	Laptop laptop = new Laptop();
//    	laptop.setId(101);
//    	laptop.setLname("MacBook Pro");
//    	
//    	AlienName an = new AlienName();
//    	an.setFname("Ashutosh");
//    	an.setSname("Maurya");
//    	an.setMname("Kumar");
    	
//        Alien ashu = new Alien();
//        ashu.setAid(3069);
//        ashu.setAname(an);
//        ashu.setColor("kingdom");
        
//    	Student s = new Student();
//    	s.setMarks(90);
//    	s.setName("Ashutosh Maurya");
//    	s.setRollno(100069);
////    	s.setLaptop(laptop);
//    	s.getLaptop().add(laptop);   //for one to many
    	
//      i want persiste this data..
//        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
//    	Configuration con = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
    	Configuration con = new Configuration().configure().addAnnotatedClass(Laptop.class).addAnnotatedClass(Alien.class);
        ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
        SessionFactory sf = con.buildSessionFactory(reg);
        Session session = sf.openSession();      
        Transaction tx = session.beginTransaction();
        
        Alien a1 = session.get(Alien.class, 1);
        
        System.out.println(a1.getAname());
        
        ArrayList<Laptop> laps = a1.getLaps();
        for(Laptop l : laps) {
        	System.out.println(l);
        }
        
//        session.beginTransaction();
//        session.save(laptop);
//        session.save(s);
//        
        
//        session.save(ashu);
//        ashu = (Alien) session.get(Alien.class, 2069);
      
        //save the value into database..
//        tx.commit();
        tx.commit();
        
//        System.out.println(ashu);
        
    }
}
