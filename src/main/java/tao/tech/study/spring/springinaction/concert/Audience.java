package tao.tech.study.spring.springinaction.concert;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
/*
除了注解和没有实际操作的performance()方法，
Audience类依然是一个POJO。
我们能够像使用其他的Java类那样调用它的方法，
它的方法也能够独立地进行单元测试，这与其他的Java类并没有什么区别。
Audience只是一个Java类，只不过它通过注解表明会作为切面使用而已。
 */
@Aspect
public class Audience {
	
	/*
	 @Pointcut注解能够在一个@AspectJ切面内定义可重用的切点。
	 其实该方法本身只是一个标识，供@Pointcut注解依附。
	 */
	/*
	@Pointcut("execution(** tao.tech.study.spring.springinaction.concert.Performance.perform(..))")
	public void performance() {}
	*/
	
	/*
	在演出之前，观众要就坐（takeSeats()）并将手机调至静音状态
	 */
	@Before("execution(** tao.tech.study.spring.springinaction.concert.Performance.perform(..))")
	//@Before("performance()")
	public void silenceCellPhones() {
		System.out.println("Silencing cell phones ");
	}
	
	@Before("execution(** tao.tech.study.spring.springinaction.concert.Performance.perform(..))")
	//@Before("performance()")
	public void takeSeats() {
		System.out.println("Taking seats");
	}
	
	/*
	如果演出很精彩的话，观众应该会鼓掌喝彩（applause()）。
	不过，如果演出没有达到观众预期的话，观众会要求退款（demandRefund()）。
	 */
	@AfterReturning("execution(** tao.tech.study.spring.springinaction.concert.Performance.perform(..))")
	//@AfterReturning("performance()")
	public void applause() {
		System.out.println("CLAP CLAP CLAP!!!");
	}
	
	@AfterThrowing("execution(** tao.tech.study.spring.springinaction.concert.Performance.perform(..))")
	//@AfterThrowing("performance()")
	public void demandRefund() {
		System.out.println("Demanding a refund");
	}
}
