package tao.tech.study.spring.springinaction.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class MyCondition implements Condition{

	@Override
	public boolean matches(ConditionContext context,AnnotatedTypeMetadata metadata) {
		//System.out.println(context.getEnvironment().getProperty("os.name"));
		return context.getEnvironment().getProperty("os.name").contains("Windows");
	}

}
