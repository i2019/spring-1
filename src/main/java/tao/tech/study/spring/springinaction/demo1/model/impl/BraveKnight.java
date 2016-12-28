package tao.tech.study.spring.springinaction.demo1.model.impl;

import tao.tech.study.spring.springinaction.demo1.model.Knight;
import tao.tech.study.spring.springinaction.demo1.model.Quest;

public class BraveKnight implements Knight {
	private Quest quest;
	
	public BraveKnight(Quest quest) {
		this.quest = quest;
	}

	public void embarkOnQuest() {
		quest.embark();
	}
}
