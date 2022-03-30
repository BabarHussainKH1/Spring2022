package aspect;

import org.aspectj.apache.bcel.classfile.Method;
import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvisor implements MethodBeforeAdvice {
	
	@Override
	public void before(java.lang.reflect.Method arg0, Object[] arg1, Object arg2) throws Throwable {
		System.out.println("additional concern before actual logic");

	}
}
