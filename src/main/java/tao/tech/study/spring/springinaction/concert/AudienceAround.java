package tao.tech.study.spring.springinaction.concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/*
 * 环绕通知
 */
@Aspect
public class AudienceAround {
	
	@Around("execution(** tao.tech.study.spring.springinaction.concert.Performance.perform(..))")
	public void watchPerformance(ProceedingJoinPoint joinPoint){
	
		try {
			System.out.println("before");
			joinPoint.proceed();
			System.out.println("after");
		} catch (Throwable e) {
			System.out.println("throw");
			e.printStackTrace();
		}
	}
}
