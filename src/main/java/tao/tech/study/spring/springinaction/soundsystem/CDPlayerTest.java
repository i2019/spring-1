package tao.tech.study.spring.springinaction.soundsystem;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
//建议尽可能使用自动化配置，以避免显式配置所带来的维护成本。但是，如果你确实需要显式配置Spring的话，应该优先选择基于Java的配置，它比基于XML的配置更加强大、类型安全并且易于重构。在本书中的例子中，当决定如何装配组件时，我都会遵循这样的指导意见。
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)//使用Spring的SpringJUnit4ClassRunner，以便在测试开始的时候自动创建Spring的应用上下文
@ContextConfiguration(classes=CDPlayerConfig.class)//注解@ContextConfiguration会告诉它需要在CDPlayerConfig中加载配置
public class CDPlayerTest {
	
	/*
	@Rule
	public final StandardOutputStreamLog log =
	new StandardOutputStreamLog();
	*/
	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
	/*
	变量名与@Component的命名相同，
	@Autowired注解不仅能够用在构造器上，还能用在属性的Setter方法上,以及类的任何方法上。
	 */
	@Autowired
	private CompactDisc sgt;
	
	/*
	 * @Autowired注解用在属性的Setter方法上
	 */
	private CompactDisc mj;
	public CompactDisc getMj() {
		return mj;
	}
	@Autowired
	public void setMj(CompactDisc mj) {
		this.mj = mj;
	}

	/*
	 * @Autowired注解用在类的普通方法上
	 */
	private CompactDisc cat;
	@Autowired(required=false)
	public void getCdDetail(CompactDisc cat){
		this.cat=cat; 
	}
	
	//@Test
	public void testPlay(){
		assertNotNull(mj);
		mj.play();
		sgt.play();
		cat.play();
	}
	
	//@Test
	public void testSgt(){
		sgt.play();
		/*
		 在测试代码中使用System.out.println()是稍微有点棘手的事情。
		 因此，该样例中使用了StandardOutputStreamLog，这是来源于System Rules库（http://stefanbirkner.github.io/system-rules/index.html）的一个JUnit规则，该规则能够基于控制台的输出编写断言。
		 在这里，我们断言SgtPeppers.play()方法的输出被发送到了控制台上。
		 */
		//log.getLog() 方法过时
		assertEquals(
				"Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles",
				systemOutRule.getLog());
		
	}
	
	@Test
	public void testCdPlayer(){
		CDPlayer player=new CDPlayer();
		CompactDisc sgtPeppers = player.sgtPeppers();
		sgtPeppers.play();
	}
	

	
}
