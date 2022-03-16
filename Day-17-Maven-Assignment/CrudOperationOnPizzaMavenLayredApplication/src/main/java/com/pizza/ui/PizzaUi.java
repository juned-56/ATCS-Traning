package com.pizza.ui;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pizza.config.AppConfig;
import com.pizza.model.Pizza;
import com.pizza.service.PizzaService;
import com.pizza.service.PizzaServiceImpl;
public class PizzaUi {
	static Scanner sc = new Scanner(System.in);
	Pizza pz = new Pizza();
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		PizzaService service = context.getBean("ps", PizzaServiceImpl.class);
		while(true) {
			System.out.println("Pizza Crud Application:");
			System.out.println("1.Add Pizza");
			System.out.println("2.Find Pizza");
			System.out.println("3.Update Pizza");
			System.out.println("4.Delete Pizza");
			System.out.println("5.List All Pizza");
			System.out.println("6.Exit");
			System.out.println("Enter your choice:");
			int ch = sc.nextInt();
			switch(ch) {
			case 1:
			System.out.println("Enter Pizza Type: ");
			String ptype = sc.next();
			System.out.println("Enter Pizza Price: ");
			int pprice = sc.nextInt();
			System.out.println("Enter Pizza Deliver Address: ");
			String padd = sc.next();
			Pizza pzz = new Pizza();
			pzz.setpType(ptype);
			pzz.setpPrice(pprice);
			pzz.setpAdd(padd);
			service.addPizza(pzz);
			System.out.println("Pizza details Inserted");
			break;
			case 2:
				System.out.println("Enter Pizza Id to fetch Pizza:");
				int pId = sc.nextInt();
				Pizza findpizza = service.findPizzaById(pId);
				if (findpizza == null) {
					System.out.println("no Pizzas present");
				} else {
					System.out.println("Pizza Id:" +findpizza.getpId());
					System.out.println("Pizza Name:" +findpizza.getpType());
					System.out.println("Pizza Price:" +findpizza.getpPrice());
					System.out.println("Pizza City:" +findpizza.getpAdd());
					}
				break;
			case 3:
				System.out.println("Enter Pizza Id to fetch Pizza:");
				int id = sc.nextInt();
				System.out.println("Enter the name to update:");
				String updpnm = sc.next();
				Pizza updatepnm = service.findPizzaById(id);
				if (updatepnm == null) {
					System.out.println("No Pizza present");
				} else {
					updatepnm.setpType(updpnm);
					service.updatePizza(updatepnm);
					System.out.println("Pizza name Updated");
				}
				break;
			case 4:
				System.out.println("Enter Pizza Id to Delete Pizza:");
				int did = sc.nextInt();
				service.deletePizza(did);
				System.out.println("Pizza deleted successfully");
				break;
			case 5:
				List<Pizza> l1 = service.listPizza();
				System.out.println("\t Pizza Id  \t Pizza Name  \t Pizza Price \t Dileviry Address");
				System.out.println("********************************************");
				for (Pizza p1 : l1) {
					System.out.println(" \t" + p1.getpId() + " \t\t "
							+ p1.getpType() + " \t \t" + p1.getpPrice()
							+ " \t \t" + p1.getpAdd());}
				System.out.println("********************************************");
				break;
			case 6:
				System.out.println("Exit from Pizza Application");
				sc.close();
				System.exit(1);
			default:
				System.out.println("please choose correct option");
				break;
			}
		}
	}
}
