package com.onebill.manytomany;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {

		User pavi = new User();
//		pavi.setId(1);
		pavi.setMailid("pavi@gmail.com");
		pavi.setName("Pavithran");

		User mukil = new User();
//		mukil.setId(2);
		mukil.setName("Mukilan");
		mukil.setMailid("mukil@gmail.com");

		Apps whatsApp = new Apps();
		whatsApp.setId(1);
		whatsApp.setCategory("Social Media");
		whatsApp.setName("WhatsApp");

		Apps insta = new Apps();
		insta.setId(2);
		insta.setCategory("Social Media");

		insta.setName("Instagram");

		pavi.setApps(Arrays.asList(whatsApp, insta));
		mukil.setApps(Arrays.asList(whatsApp, insta));

		whatsApp.setUser(Arrays.asList(pavi, mukil));
		insta.setUser(Arrays.asList(pavi, mukil));

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("apps");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(pavi);
		manager.persist(mukil);
//		User merge = manager.merge(pavi);
//		manager.persist(merge);
//		User merge2 = manager.merge(mukil);
//		manager.persist(merge2);
		transaction.commit();
	}
}
