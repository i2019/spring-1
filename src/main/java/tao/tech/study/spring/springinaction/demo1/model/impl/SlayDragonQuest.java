package tao.tech.study.spring.springinaction.demo1.model.impl;

import java.io.PrintStream;

import tao.tech.study.spring.springinaction.demo1.model.Quest;

public class SlayDragonQuest implements Quest {
	private PrintStream stream;
	
	public SlayDragonQuest(PrintStream stream) {
		this.stream = stream;
	}

	public void embark() {
		stream.println("Embarking on quest to slay the dragon!");
	}
}
