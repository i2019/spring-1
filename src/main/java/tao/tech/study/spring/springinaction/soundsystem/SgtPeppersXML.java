package tao.tech.study.spring.springinaction.soundsystem;

/**
 * 具体的光盘实现
 * @author 江涛
 *
 */
public class SgtPeppersXML implements CompactDisc {
	
	private String title = "Sgt. Pepper's Lonely Hearts Club Band";
	private String artist = "The Beatles";
	
	public void play() {
		System.out.print("Playing " + title + " by " + artist);
		
	}

}
