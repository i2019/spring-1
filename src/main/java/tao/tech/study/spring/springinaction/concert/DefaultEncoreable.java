package tao.tech.study.spring.springinaction.concert;

import org.springframework.stereotype.Component;

@Component
public class DefaultEncoreable implements Encoreable {

	@Override
	public void performEncore() {
		System.out.println("+++++++++++++++++++++++++perform encore");
	}

}
