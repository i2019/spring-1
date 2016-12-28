package tao.tech.study.spring.springinaction.demo1.model.impl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import tao.tech.study.spring.springinaction.demo1.model.Knight;
import tao.tech.study.spring.springinaction.demo1.model.Quest;

@Configuration
public class KnightConfig {
	
	@Bean
	public Knight knight(){
		return new BraveKnight(quest());
	}
	
	@Bean
	public Quest quest(){
		return new SlayDragonQuest(System.out);
	}
}
