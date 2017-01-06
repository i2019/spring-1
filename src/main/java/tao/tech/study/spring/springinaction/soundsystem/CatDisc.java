package tao.tech.study.spring.springinaction.soundsystem;

import org.springframework.stereotype.Component;

/**
 * 具体的光盘实现
 * @author 江涛
 *
 */

/*
 @Component注解。这个注解表明该类会作为组件类，并告知Spring要为这个类创建bean。
 */
@Component("cat")
public class CatDisc implements CompactDisc {

	private String title = " hount ";
	private String artist = " cat king ";
	
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}

	@Override
	public String toString() {
		return "CatDisc [title=" + title + ", artist=" + artist + "]";
	}

	@Override
	public void playTrack(int trackNumber) {
		// TODO Auto-generated method stub
		
	}

}
