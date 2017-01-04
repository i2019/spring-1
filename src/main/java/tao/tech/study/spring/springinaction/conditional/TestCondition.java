package tao.tech.study.spring.springinaction.conditional;

import java.lang.reflect.Method;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.BeanFactoryUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.BeanFactoryAnnotationUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.expression.BeanFactoryAccessor;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=ConditionalConfig.class)
public class TestCondition {
	@Autowired
	private ConditionalConfig conditionalConfig;

	ApplicationContext applicationContext=new AnnotationConfigApplicationContext(ConditionalConfig.class);
	
	@Test
	public void testCondition(){

		//Method method=BeanUtils.findMethodWithMinimalParameters(conditionalConfig.getClass(), "getConditionalBean");
		//System.out.println(method);
		ConditionalBean conditionalBean=conditionalConfig.getConditionalBean();
	    System.out.println(conditionalBean);
		
	}
}
