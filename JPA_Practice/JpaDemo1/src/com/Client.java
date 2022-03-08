package com.product;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {
public static void main(String[] args) {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("juned");
	EntityManager entity = factory.createEntityManager();
	entity.getTransaction().begin();
//insert
	Product pr = new Product(110, "CFL", 120, 112400);
	Product pr2 = new Product(111, "LED", 240, 123453);
	Product pr3 = new Product(112, "Wire", 300, 178567);
	Product pr4 = new Product(113, "Sound", 800, 156744);
	entity.persist(pr);
	entity.persist(pr2);
	entity.persist(pr3);
	entity.persist(pr4);
	
	
//fetch
//	Product pr = new Product(110, "CFL", 120, 112400);
//	entity.persist(pr);
//	Product pr1 = entity.find(Product.class, 110);
//	System.out.println(pr1);
	
//update
//	Product pr1 = entity.find(Product.class, 110);
//	System.out.println(pr1);
//	pr1.setPname("Blub");
//	pr1.setPprice(200);
//	pr1.setPincode(12000);
//	entity.merge(pr1);
	
//delete
//	entity.remove(pr2);
	entity.getTransaction().commit();
	}
}
