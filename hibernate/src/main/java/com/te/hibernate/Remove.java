
package com.te.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Remove {

	public static void main(String[] args) {
		Employee employee = new Employee(2, "Rajan", 20000, "Developer");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("employee");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		Employee merge = manager.merge(employee);
		manager.remove(merge);
		transaction.begin();
		
		transaction.commit();
	}
}
