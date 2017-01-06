package tao.tech.study.spring.springinaction.soundsystem;

import org.springframework.stereotype.Component;


/**
 * 具体的光盘实现
 * @author 江涛
 *
 */

/*
 @Component注解。
 这个注解表明该类会作为组件类，并告知Spring要为这个类创建bean。
 
 bean命名：
1. @Component("sgt")
如果一个接口只有一个实现类，可以不写("sgt")，但是当一个接口有多个实现类的时候，变量名与之对应。
2. @Named("sgt")
另外一种为bean命名的方式，这种方式不使用@Component注解，
 而是使用Java依赖注入规范（Java Dependency Injection）中所提供的@Named注解来为bean设置ID：
javax.inject.Named;
 */
@Component("sgt")
public class SgtPeppers implements CompactDisc {

	private String title = "Sgt. Pepper's Lonely Hearts Club Band";
	private String artist = "The Beatles";
	
	public void play() {
		System.out.print("Playing " + title + " by " + artist);
		
	}

	@Override
	public void playTrack(int trackNumber) {
		// TODO Auto-generated method stub
		
	}

}
