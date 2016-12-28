package tao.tech.study.spring.springinaction.demo1.model;

import java.io.PrintStream;
/**
 * 吟游诗人，负责记录骑士的英勇事迹
 * @author 江涛
 *
 */
public class Minstrel {
	private PrintStream stream;

	public Minstrel(PrintStream stream) {
		this.stream = stream;
	}
	
	/*
	 * 探险之前调用
	 */
	public void singBeforeQuest() {
		stream.println("Fa la la, the knight is so brave!");
	}
	/**
	 * 探险之后调用
	 */
	public void singAfterQuest() {
		stream.println("Tee hee hee, the brave knight "
				+ "did embark on a quest!");
	}
}
