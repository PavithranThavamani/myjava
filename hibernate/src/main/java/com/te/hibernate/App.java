package com.te.hibernate;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
//        Employee employee = new Employee(2, "Rajan", 20000, "Developer");
//        EntityManagerFactory factory = Persistence.createEntityManagerFactory("pavi");
//        EntityManager manager = factory.createEntityManager();
//        EntityTransaction transaction = manager.getTransaction();
//        manager.persist(employee);
//        transaction.begin();
//        transaction.commit();
//        Employee employee = new Employee(2, "Rajan", 20000, "Developer");
//        Employee employee2 = new Employee();
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("employee");
        EntityManager manager = factory.createEntityManager();
//        Employee find = manager.find(Employee.class, 2);
//        System.out.println(find);
//        EntityTransaction transaction = manager.getTransaction();
//        transaction.begin();
//        transaction.commit();
        Query query = manager.createQuery("select max(salary) from Employee");
        Object singleResult = query.getSingleResult();
//        List<Employee> list = query.getResultList();
//        for (Employee employee : list) {
//			System.out.println(employee);
//		}
        System.out.println(query.getSingleResult());
        System.out.println(singleResult);
        
        Query query1 = manager.createQuery("select count(*) from Employee");
        System.out.println(query1.getSingleResult());

        System.out.println("Enter id");
        int id = sc.nextInt();
        
        Query query2 = manager.createQuery("select name from Employee where id =:id");
        query2.setParameter("id", id);
        Object singleResult2 = query2.getSingleResult();
        System.out.println(query2.getSingleResult());
        
        
        
    }

	

	
}
