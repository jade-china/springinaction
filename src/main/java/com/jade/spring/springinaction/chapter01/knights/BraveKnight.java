package com.jade.spring.springinaction.chapter01.knights;

public class BraveKnight implements Knight {

	private Quest quest;
	
	
	public BraveKnight(Quest quest) {
		super();
		this.quest = quest;
	}

	@Override
	public void embarkOnQuest() {
		quest.embark();
	}

}
