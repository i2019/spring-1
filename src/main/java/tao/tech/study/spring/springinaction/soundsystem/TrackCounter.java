package tao.tech.study.spring.springinaction.soundsystem;

import java.util.HashMap;
import java.util.Map;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
/*
切面 
记录不同轨道（Track）的播放次数
 */
@Aspect
public class TrackCounter {

	//计数器 记录磁道的播放次数
	private Map<Integer, Integer> counts = new HashMap<Integer, Integer>();	
	
	/*
	@Pointcut("execution(* tao.tech.study.spring.springinaction.soundsystem.CompactDisc.playTrack(int))"
	+"&& args(trackNumber)")
	public void trackPlayed(int trackNumber) {}
	*/
	
	/*
	 * 记录某个track的播放次数
	 */
	//@Before("trackPlayed(trackNumber)")
	@Before("execution(* tao.tech.study.spring.springinaction.soundsystem.CompactDisc.playTrack(int))"
			+"&& args(trackNumber)")
	public void countTrack(int trackNumber) {
		int currentCount = getPlayCount(trackNumber);
		counts.put(trackNumber, currentCount + 1);
	}		
	
	/**
	 * 获取某track的播放次数
	 * @param trackNumber
	 * @return
	 */
	public int getPlayCount(int trackNumber) {
		return counts.containsKey(trackNumber)? counts.get(trackNumber) : 0;
	}

	public Map<Integer, Integer> getCounts() {
		return counts;
	}

	public void setCounts(Map<Integer, Integer> counts) {
		this.counts = counts;
	}
	
}
