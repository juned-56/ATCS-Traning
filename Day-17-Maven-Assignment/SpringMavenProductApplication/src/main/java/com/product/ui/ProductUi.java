package com.product.ui;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Service;

import com.product.config.AppConfig;
import com.product.model.Product;
import com.product.service.ProductService;
import com.product.service.ProductServiceImpl;

public class ProductUi {
	static Scanner sc = new Scanner(System.in);
	Product pro = new Product();
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		ProductService service = context.getBean("ps",ProductServiceImpl.class);
		while (true) {
			System.out.println("\n\n\n\n\nProduct Crud Operation:");
			System.out.println("1.Create Product");
			System.out.println("2.Find Product");
			System.out.println("3.Update Product");
			System.out.println("4.Delete Product");
			System.out.println("5.List All Products");
			System.out.println("6.Exit");
			System.out.println("Enter your choice:");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter Product Name: ");
				String pname = sc.next();
				System.out.println("Enter Product Price: ");
				int pprice = sc.nextInt();
				System.out.println("Enter Product Deliver Address: ");
				String pdadd = sc.next();
				
				Product pro = new Product();
				pro.setpName(pname);
				pro.setpPrice(pprice);
				pro.setpAddress(pdadd);
				service.addProduct(pro);
				System.out.println("Product Inserted");
				break;
			case 2:
				System.out.println("Enter Product Id to fetch Product:");
				int pId = sc.nextInt();
				Product findpro = service.findProductById(pId);
				if (findpro == null) {
					System.out.println("no Products present");
				} else {
					System.out.println("Product Id:" + findpro.getpId());
					System.out.println("Product Name:" + findpro.getpName());
					System.out.println("Product Price:" + findpro.getpPrice());
					System.out.println("Product City:" + findpro.getpAddress());
					}
				break;
			case 3:
				System.out.println("Enter Product Id to fetch Product:");
				int id = sc.nextInt();
				System.out.println("Enter the name to update:");
				String updpnm = sc.next();
				Product updatepnm = service.findProductById(id);
				if (updatepnm == null) {
					System.out.println("No Product present");
				} else {
					updatepnm.setpName(updpnm);
					service.updateProduct(updatepnm);
					System.out.println("Product name Updated");
				}
				break;
			case 4:
				System.out.println("Enter Product Id to Delete Product:");
				int did = sc.nextInt();
				service.deleteProduct(did);
				System.out.println("Product deleted successfully");
				break;
			case 5:
				List<Product> l1 = service.listProduct();
				System.out.println("\t Product Id  \t Product Name  \t Product Price \t Dileviry Address");
				System.out.println("********************************************");
				for (Product p1 : l1) {
					System.out.println(" \t" + p1.getpId() + " \t\t "
							+ p1.getpName() + " \t \t" + p1.getpPrice()
							+ " \t \t" + p1.getpAddress());}
				System.out.println("********************************************");
				break;
			case 6:
				System.out.println("Exit from Product Application");
				sc.close();
				System.exit(1);
			default:
				System.out.println("please choose correct option");
				break;
			}
		}
	}
}
