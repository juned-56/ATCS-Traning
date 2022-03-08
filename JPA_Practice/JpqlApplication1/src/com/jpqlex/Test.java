package com.jpqlex;

//import java.awt.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

//import org.hibernate.mapping.List;

public class Test {
	public static void main(String[] args) {
EntityManagerFactory factory=Persistence.createEntityManagerFactory("juned");
	
	EntityManager entity= factory.createEntityManager();
	
	entity.getTransaction().begin();
	
//insert
	Student st = new Student(9, "juned", 400, "mumbai", "B.Tech");
	Student st1 = new Student(11, "Jhon", 340, "america", "B.Com");
	Student st2 = new Student(12, "Tone", 640, "tiwan", "B.Pharma");
	Student st3 = new Student(13, "Miku", 800, "japan", "B.A");
	Student st4 = new Student(14, "Piku", 940, "delhi", "MBA");
	Student st5 = new Student(15, "Tiku", 200, "lucknow", "BBA");
	entity.persist(st);
	entity.persist(st1);
	entity.persist(st2);
	entity.persist(st3);
	entity.persist(st4);
	entity.persist(st5);
	
	
	
//Fetch
//	TypedQuery<Student> tq = entity.createQuery("select e from Student e", Student.class);
//	List<Student> li = tq.getResultList();
//			
//	for(Student s:li) 
//	{
//		System.out.println(s.getSid());
//		System.out.println(s.getSname());
//		System.out.println(s.getCourse());
//		System.out.println(s.getSmarks());
//		System.out.println(s.getSadd());
//		
//	}

	
//update
//  Query result=entity.createQuery("update Student set smarks = smarks + 50 where smarks > 480"); 
//      result.executeUpdate();
	

//select
//    Query result=entity.createQuery("select MAX(e.smarks) FROM Student e");    
//            int maxmarks = (int) result.getSingleResult();           
//            System.out.println(maxmarks);
        
//delete
//    Query result = entity.createQuery("delete from  Student where smarks > 480");
//    result.executeUpdate();
	entity.getTransaction().commit();
	}	
}
