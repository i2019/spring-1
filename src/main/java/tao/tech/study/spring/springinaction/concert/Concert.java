package tao.tech.study.spring.springinaction.concert;

import org.springframework.stereotype.Component;

@Component
public class Concert implements Performance {

	@Override
	public void perform() throws Throwable {

			System.out.println("great concert ");
			throw new Throwable("Throwable");

	}

}
