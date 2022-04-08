package com.te.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		
		Laptop laptop = new Laptop(107, "Dell Alienware", "Dell Battery", "2TB");
		Trainee trainee = new Trainee( "Me", "Developer", 50000, laptop);
		laptop.setTrainee(trainee);
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("trainee");
		EntityManager manager = factory.createEntityManager();
//		manager.persist(laptop);
		manager.persist(trainee);
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		transaction.commit();
		
		
	}
}
