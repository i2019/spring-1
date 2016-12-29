package tao.tech.study.spring.springinaction.demo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import tao.tech.study.spring.springinaction.demo1.dao.EmployeeDao;
import tao.tech.study.spring.springinaction.demo1.model.Employee;
import tao.tech.study.spring.springinaction.demo1.model.Knight;

public class KnightMain {
	public static void main(String[] args) throws Exception {

		/*基于XML的DI*/
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:config/spring/knight.xml");
		
		/*
		Knight knight = context.getBean(Knight.class);
		knight.embarkOnQuest();
		*/
		EmployeeDao employeeDao=(EmployeeDao) context.getBean("employeeDao");
		System.out.println(employeeDao.getEmployeeById(new Long("0")));		
		
		context.close();
		
	}
}
