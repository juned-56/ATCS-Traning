package SpringCoreAutoWireAtc.com.springcore3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan("SpringCoreAutowireAtc.com.springcore3")
public class Test {
	public static void main(String[] args) {
		ApplicationContext app = new AnnotationConfigApplicationContext(Test.class);
		Student stu = (Student) app.getBean("student");
		stu.setsRn(20);
		stu.setsName("jhon");
		stu.setsMarks(400);
		stu.setsClass(12);
		System.out.println(stu);
		Address addd = (Address) app.getBean("address");
		addd.sethNo(200);
		addd.setCity("jaipur");
		addd.setState("rajasthan");
		System.out.println(addd);
//		Student stu = (Student) app.getBean("student");
//		System.out.println(stu);
//		Student stu1 = (Student) app.getBean("student");
//		System.out.println(stu1);
	}
}
