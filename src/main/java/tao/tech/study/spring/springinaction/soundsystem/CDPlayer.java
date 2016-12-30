package tao.tech.study.spring.springinaction.soundsystem;

import org.springframework.context.annotation.Bean;

public class CDPlayer {
	/*
	要在JavaConfig中声明bean，
	我们需要编写一个方法，这个方法会创建所需类型的实例，然后给这个方法添加@Bean注解。
	
	@Bean注解会告诉Spring这个方法将会返回一个对象，该对象要注册为Spring应用上下文中的bean。
	方法体中包含了最终产生bean实例的逻辑。
	 */
	@Bean
	public CompactDisc sgtPeppersCD() {
		return new SgtPeppers();
	}

	/*
	默认情况下，bean的ID与带有@Bean注解的方法名是一样的。
	如果你想为其设置成一个不同的名字的话，那么可以重命名该方法，也可以通过name属性指定一个不同的名字。
	 */
	@Bean(name = "lonelyHearts")
	public CompactDisc sgtPeppers() {
		return new SgtPeppers();
	}

	@Bean
	public CompactDisc randomCD() {
		int choice = (int) Math.floor(Math.random() * 4);
		if (choice == 0) {
			return new SgtPeppers();
		} else if (choice == 1) {
			return new MJDisc();
		} else if (choice == 2) {
			return new CatDisc();
		} else {
			return new MJDisc();
		}
	}

}
