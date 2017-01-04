package tao.tech.study.spring.springinaction.food;

import org.springframework.stereotype.Component;

@Component
public class Cookies implements Dessert {

	public Cookies() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Cookies []";
	}

}
