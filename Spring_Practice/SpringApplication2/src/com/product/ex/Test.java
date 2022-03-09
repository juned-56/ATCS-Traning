package com.product.ex;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("springConfig.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Product pr = (Product) factory.getBean("juned");
		System.out.println(pr);
	}
}
