package com.sapient.employee;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;

@Aspect
@Order(0)
public class ValidateId {
	@Before("execution(* *.*(Integer))")
	public void checkE(JoinPoint joinPoint) throws Exception {
		for(Object x : joinPoint.getArgs()) {
			int y = (Integer) x;
			if( y < 0)
				throw new IllegalArgumentException("Id cannot be negative");
			if(y > 999)
				throw new IllegalArgumentException("Id cannot be of more than three digits");
		}
	}
}




