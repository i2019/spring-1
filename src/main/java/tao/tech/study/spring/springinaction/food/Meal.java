package tao.tech.study.spring.springinaction.food;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import tao.tech.study.spring.springinaction.SpringConfig;
/*

处理自动装配的歧义性
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=SpringConfig.class)
public class Meal {
	
	/*
	Dessert是一个接口，并且有三个类实现了这个接口，分别为Cake、Cookies和IceCream
	
	1.@Primary可标示首选的bean
	
	2.如果有多个实现类有@Primary，就要用到@Qualifier注解。
	@Qualifier注解是使用限定符的主要方式，
	它可以与@Autowired和@Inject协同使用，在注入的时候指定想要注入进去的是哪个bean。
	 */
	@Autowired
	@Qualifier("cold")
	private Dessert dessert;
	
	@Test
	public void eat(){
		System.out.println(dessert.toString());
	}

	public Dessert getDessert() {
		return dessert;
	}

	public void setDessert(Dessert dessert) {
		this.dessert = dessert;
	}
	
}
