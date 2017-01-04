package tao.tech.study.spring.springinaction.conditional;

import org.springframework.stereotype.Component;

/**
 * @Conditional注解，
 * 它可以用到带有@Bean注解的方法上。如果给定的条件计算结果为true，就会创建这个bean，否则的话，这个bean会被忽略。
 * @author 江涛
 *
 */
@Component
public class ConditionalBean {
	public String ConditionMatch(){
		return "match";
	}
}
