package com.te.hibernate;

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
//        Employee employee = new Employee(2, "Rajan", 20000, "Developer");
//        EntityManagerFactory factory = Persistence.createEntityManagerFactory("pavi");
//        EntityManager manager = factory.createEntityManager();
//        EntityTransaction transaction = manager.getTransaction();
//        manager.persist(employee);
//        transaction.begin();
//        transaction.commit();
//        Employee employee = new Employee(2, "Rajan", 20000, "Developer");
        Employee employee2 = new Employee();
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("pavi");
        EntityManager manager = factory.createEntityManager();
        Employee find = manager.find(Employee.class, 2);
        System.out.println(find);
//        EntityTransaction transaction = manager.getTransaction();
//        transaction.begin();
//        transaction.commit();
        
        
    }

	

	
}
