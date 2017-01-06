package tao.tech.study.spring.springinaction.concert;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("opera")
public class Opera implements Performance {

	@Override
	public void perform() throws Throwable {

		System.out.println("Beijing opera");

	}

}
