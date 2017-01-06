package tao.tech.study.spring.springinaction.soundsystem;
/**
 * 光盘接口
 * @author 江涛
 *
 */
public interface CompactDisc {
	
	/**
	 * 播放方法
	 * CD播放器对一盘CD所能进行的操作。它将CD播放器的任意实现与CD本身的耦合降低到了最小的程度。
	 */
	void play();
	
	void playTrack(int trackNumber);
}
