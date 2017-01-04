package tao.tech.study.spring.springinaction.conditional;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ApplicationContextEvent;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackageClasses={ConditionalConfig.class})
@Component
public class ConditionalConfig{
	
	@Bean
	@Conditional(MyCondition.class)
	public ConditionalBean getConditionalBean(){
		return new ConditionalBean();
	}
	
}
