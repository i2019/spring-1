package tao.tech.study.spring.springinaction.demo1.test;

import org.junit.Test;

import tao.tech.study.spring.springinaction.demo1.model.Quest;
import tao.tech.study.spring.springinaction.demo1.model.impl.BraveKnight;
import static org.mockito.Mockito.*;  
import static org.junit.Assert.*;  

public class BraveKnightTest {

	@Test
	public void knightShouldEmbarkOnQuest(){
		Quest mockQuest = mock(Quest.class);
		BraveKnight knight = new BraveKnight(mockQuest);
		knight.embarkOnQuest();
		verify(mockQuest, times(1)).embark();
	}
	
}
