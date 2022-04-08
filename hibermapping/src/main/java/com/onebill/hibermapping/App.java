package com.onebill.hibermapping;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
    	Cart cart = new Cart();
    	
    	Item item = new Item(5, "iPhone", 100000);
    	Item item2 = new Item(6, "Mac", 200000);
    	
    	item.setCart(cart);
    	item2.setCart(cart);
    	
    	cart.setItem(Arrays.asList(item, item2));
    	
    	EntityManagerFactory factory = Persistence.createEntityManagerFactory("cart");
    	EntityManager manager = factory.createEntityManager();
    	manager.persist(cart);
    	EntityTransaction transaction = manager.getTransaction();
    	transaction.begin();
    	transaction.commit();
    	
    }
}
