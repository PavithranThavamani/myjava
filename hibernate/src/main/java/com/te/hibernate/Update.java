package com.te.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update {

	public static void main(String[] args) {
		Employee employee = new Employee(4, "Rajan", 200000, "backend developer");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("employee");
		EntityManager manager = factory.createEntityManager();
		Employee find = manager.find(Employee.class, 1);
		find.setDesignation("Senior Developer");
		manager.persist(employee);
		manager.persist(find);
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		transaction.commit();
	}
}
