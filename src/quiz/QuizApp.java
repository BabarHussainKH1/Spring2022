package quiz;

import java.util.Map;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dto.Quiz;

@Configuration
@EnableAspectJAutoProxy
public class QuizApp {
	static int correct = 0;

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
//
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		Quiz obj = (Quiz) context.getBean("quiz1");

		System.out.println(obj.getQuestions());
		System.out.println(obj.getAnswers());

		Map anserAnswers = obj.getAnswers();
		obj.getQuestions().forEach((q) -> {

			System.out.println(q.getId() + ": " + q.getTitle());
			System.out.println("\t A." + q.getOptions().get(0));
			System.out.println("\t B." + q.getOptions().get(1));
			System.out.println("\t C." + q.getOptions().get(2));

			System.out.print("Answer:");
			String answer = inp.nextLine();

			if (anserAnswers.get(q.getId()).equals(answer)) {
				correct++;
			}
		});
		System.out.println("Correct:" + correct);
		System.out.println("End");

//		A a = (A) context.getBean("proxy");
//		a.m();

//		 EmployeeManager manager = context.getBean(EmployeeManager.class);
//		  
//	        manager.getEmployeeById(1);

//		CustomerBo customer = (CustomerBo) context.getBean("customerBo");
//		customer.addCustomer();
	}

}
