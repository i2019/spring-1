package tao.tech.study.spring.springinaction.soundsystem;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
/**
 * 测试统计播放次数
 * @author 江涛
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=TrackCounterConfig.class)
public class TrackCounterTest {
	@Autowired
	private CompactDisc blank;
	@Autowired
	private TrackCounter counter;
	
	@Test
	public void testTrackCounter() {
		blank.playTrack(1);
		blank.playTrack(2);
		blank.playTrack(3);
		blank.playTrack(3);
		blank.playTrack(3);
		blank.playTrack(3);
		blank.playTrack(7);
		blank.playTrack(7);
		
		Map<Integer, Integer> map=counter.getCounts();
		Set<Entry<Integer, Integer>> set=map.entrySet();
		Iterator<Entry<Integer, Integer>> it=set.iterator();
		Entry<Integer, Integer> en;
		while(it.hasNext()){
			en=it.next();
			System.out.println(en.getKey()+"播放次数："+en.getValue());
		}
		
	}
}
