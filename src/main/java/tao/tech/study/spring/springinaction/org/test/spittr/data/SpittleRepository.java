package tao.tech.study.spring.springinaction.org.test.spittr.data;

import java.util.List;

public interface SpittleRepository {
	//其中max参数代表所返回的Spittle中，Spittle ID属性的最大值，而count参数表明要返回多少个Spittle对象。
	List<Spittle> findSpittles(long max,int count);
}
