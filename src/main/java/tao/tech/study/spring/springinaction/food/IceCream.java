package tao.tech.study.spring.springinaction.food;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
@Component
@Primary //标示首选的bean
/*
默认的Qualifier为类名首字母小写，为了避免注入时与某个类耦合，也可以自定义Qualifier,
此时@Qualifier("cold")和@Qualifier("iceCream")都是指这个实现类
如果使用java8的新注解@Repeatable，则可以指定更多的Qualifier
 */
@Qualifier("cold")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class IceCream implements Dessert {

	public IceCream() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "IceCream []";
	}

}
