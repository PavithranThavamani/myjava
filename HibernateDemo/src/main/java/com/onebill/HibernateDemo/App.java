package com.onebill.HibernateDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	Student student = new Student(2, "Mukilan", 100, "React");
//    	EntityManagerFactory factory = Persistence.createEntityManagerFactory("mystudent");
//    	EntityManager manager = factory.createEntityManager();
//    	EntityTransaction transaction = manager.getTransaction();
//    	manager.persist(student);
//    	transaction.begin();
//    	transaction.commit();
    	
    	
    	Student student = new Student(2, "Mukilan", 100, "React");
    	Student student2 = new Student();
    	EntityManagerFactory factory = Persistence.createEntityManagerFactory("mystudent");
    	EntityManager manager = factory.createEntityManager();
    	EntityTransaction transaction = manager.getTransaction();
    	manager.persist(student);
    	transaction.begin();
    	transaction.commit();
    	
    	
        
        
    }
}
