package tao.tech.study.spring.springinaction.org.test.spittr.data;

import tao.tech.study.spring.springinaction.org.test.spittr.model.Spitter;

public interface SpitterRepository {

	  Spitter save(Spitter spitter);
	  
	  Spitter findByUsername(String username);

}
