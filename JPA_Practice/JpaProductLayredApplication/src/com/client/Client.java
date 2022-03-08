package com.client;

import com.entity.Product;
import com.service.ProductService;
import com.service.ProductServiceImpl;

public class Client {
	public static void main(String[] args) {
		ProductService service = new ProductServiceImpl();
		
		
//insert the data into table
		Product pr = new Product(10, "CFL", 120, "Mumbai");
		Product pr1 = new Product(11, "Light", 300, "Delhi");
		Product pr2 = new Product(12, "Sound", 1000, "Pune");
		Product pr3 = new Product(13, "LED", 200, "Jaipur");
		Product pr4 = new Product(14, "Desktop", 120000, "Hydrabad");
		service.addProduct(pr);
		service.addProduct(pr1);
		service.addProduct(pr2);
		service.addProduct(pr3);
		service.addProduct(pr4);

		
//fetch the data from table using id	
//		pr1 = service.findProductById(11);
//		System.out.println("ID is:"+pr1.getPid());
//		System.out.println("ID is:"+pr1.getPname());
//		System.out.println("ID is:"+pr1.getPprice());

		

//update the data
//		pr3 = service.findProductById(13);
//		pr3.setPname("Wire");
//		pr3.setPprice(500);
//		pr3.setPadd("Lucknow");
//		service.addProduct(pr3);
		
		
//find the updated data
//		System.out.println("Update name is: "+pr3.getPname());
//		System.out.println("Update name is: "+pr3.getPprice());
//		System.out.println("Update name is: "+pr3.getPadd());

		
//delete the data
//		service.deleteProduct(pr3);
		System.out.println("Successfully Executed!!!!!!!");
	}
}
