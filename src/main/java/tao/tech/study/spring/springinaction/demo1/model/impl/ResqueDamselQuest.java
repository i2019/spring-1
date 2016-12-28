package tao.tech.study.spring.springinaction.demo1.model.impl;

import tao.tech.study.spring.springinaction.demo1.model.Quest;

/**
 * 营救少女任务
 * @author 江涛
 *
 */
public class ResqueDamselQuest implements Quest{
	public void embark(){
		System.out.println("执行营救少女任务");
	}
}
