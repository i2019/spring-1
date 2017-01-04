package tao.tech.study.spring.springinaction.food;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Cake implements Dessert {

	public Cake() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Cake []";
	}

}
