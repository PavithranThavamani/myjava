package com.onebill.hibernatemapping;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class App 
{
    public static void main( String[] args )
    {
        Cart myCart = new Cart();
        
        
        Item item = new Item(100, "Phone", "iPhone", 100000, 1, 5);
        Item item2 = new Item(200, "Laptop", "Dell Alienware", 300000, 1, 5);
        item.setCart(myCart);
        item2.setCart(myCart);
        myCart.setItem(Arrays.asList(item, item2));
        
       EntityManagerFactory factory = Persistence.createEntityManagerFactory("cart");
       EntityManager manager = factory.createEntityManager();
       manager.persist(myCart);
       EntityTransaction transaction = manager.getTransaction();
       transaction.begin();
       transaction.commit();
    }
}
