package customer;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

	@Before("execution(* customer.CustomerBo.addCustomer(..))")
	public void logBefore(JoinPoint joinPoint) {
		System.out.println("Before");
	}

	@After("execution(* customer.CustomerBo.addCustomer(..))")
	public void logAfter(JoinPoint joinPoint) {

		System.out.println("After");
	}

	@AfterThrowing("execution(* customer.CustomerBo.addCustomer(..))")
	public void afterThrowing(JoinPoint joinPoint) {
		System.out.println("After Exception");
	}
	
	@AfterReturning("execution(* customer.CustomerBo.addCustomer(..))")
	public void afterReturning(JoinPoint joinPoint) {
		System.out.println("After Rreturning");
	}
	
//	@Around("execution(* customer.CustomerBo.addCustomer(..))")
//	public void around(JoinPoint joinPoint) {
//		System.out.println("Arround");
//	}
	

}