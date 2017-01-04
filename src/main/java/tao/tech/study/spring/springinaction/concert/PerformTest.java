package tao.tech.study.spring.springinaction.concert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import tao.tech.study.spring.springinaction.SpringConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=ConcertConfig.class)
public class PerformTest {
	@Autowired
	private Performance performance;
	
	@Test
	public void testPerform() throws Throwable{
		performance.perform();
	}
}
