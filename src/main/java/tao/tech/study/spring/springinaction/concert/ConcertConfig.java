package tao.tech.study.spring.springinaction.concert;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import tao.tech.study.spring.springinaction.concert.Audience;

@Configuration
@EnableAspectJAutoProxy//在配置类的类级别上通过使用EnableAspectJ-AutoProxy注解启用自动代理功能。
@ComponentScan
public class ConcertConfig {
	
	@Bean
	public AudienceAround audienceAround(){
		return new AudienceAround();
	}

	@Bean
	public Audience audience(){
		return new Audience();
	}
	
	@Bean
	public EncoreableIntroducer encoreableIntroducer(){
		return new EncoreableIntroducer();
	}
	
}

