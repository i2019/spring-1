package tao.tech.study.spring.springinaction.soundsystem;

import org.springframework.stereotype.Component;

/**
 * 具体的光盘实现
 * @author 江涛
 *
 */

/*
 @Component注解。这个注解表明该类会作为组件类，并告知Spring要为这个类创建bean。
 如果一个接口只有一个实现类，可以不写("sgt")，但是当一个接口有多个实现类的时候，变量名与之对应
 */
@Component("mj")
public class MJDisc implements CompactDisc {

	private String title = " 颤栗 ";
	private String artist = " 迈克尔 杰克逊 ";
	
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}

	@Override
	public String toString() {
		return "MJDisc [title=" + title + ", artist=" + artist + "]";
	}

	@Override
	public void playTrack(int trackNumber) {
		// TODO Auto-generated method stub
		
	}

}
