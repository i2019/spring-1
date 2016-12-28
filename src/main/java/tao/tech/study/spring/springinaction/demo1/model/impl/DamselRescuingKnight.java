package tao.tech.study.spring.springinaction.demo1.model.impl;

import tao.tech.study.spring.springinaction.demo1.model.Knight;
import tao.tech.study.spring.springinaction.demo1.model.Quest;
/**
 * 营救少女的骑士
 * @author 江涛
 *
 */
public class DamselRescuingKnight implements Knight{
	//private ResqueDamselQuest quest;
	/**
	 * 构造方法
	 * 与ResqueDamselQuest紧耦合
	 * @param quest
	 */
	/*
	public DamselRescuingKnight(ResqueDamselQuest quest) {
		this.quest = quest;
	}
	*/
	
	private Quest quest;
	/**
	 * 构造器注入（Constructor Injectionmock）接口，实现更加灵活
	 * @param quest
	 */
	public DamselRescuingKnight(Quest quest) {
		this.quest = quest;
	}
	
	/**
	 * 执行任务
	 */
	public void embarkOnQuest(){
		quest.embark();
	}
}
