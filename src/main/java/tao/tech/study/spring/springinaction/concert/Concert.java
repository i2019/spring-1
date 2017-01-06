package tao.tech.study.spring.springinaction.concert;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("concert")
public class Concert implements Performance {

	@Override
	public void perform() throws Throwable {

			System.out.println("great concert ");
			//throw new Throwable("Throwable");

	}

}
