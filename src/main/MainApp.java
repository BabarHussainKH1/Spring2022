package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import emp.Employee;

public class MainApp {
	public static void main(String[] args) {
		System.out.println("Main Running...");
//		Resource resource = new ClassPathResource("application.xml");
//		BeanFactory factory = new XmlBeanFactory(resource);
//		DeveloperDTO obj = (DeveloperDTO) factory.getBean("dev1");

//		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
//		DeveloperDTO obj = (DeveloperDTO) context.getBean("dev1");
//
//		System.out.println(obj);

		ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");

		EmployeeDao dao = (EmployeeDao) ctx.getBean("edao");
//		int status = dao.saveEmployee(new Employee(102, "Amit", 35000));
//		System.out.println(status);
		
		dao.g

	}
}
