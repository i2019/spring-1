package tao.tech.study.spring.springinaction.conditional;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.stereotype.Component;
@Component
public class BeanConditon implements Condition{

	private String beanName;
	
	public BeanConditon() {
	
	}

	public BeanConditon(String beanName) {
		this.beanName = beanName;
	}

	public String getBeanName() {
		return beanName;
	}



	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

	@Override
	public boolean matches(ConditionContext context,AnnotatedTypeMetadata metadata) {
		BeanFactory beanFactory=context.getBeanFactory();
		return beanFactory.containsBean(beanName);
	}

}
