package com.jade.spring.springinaction.chapter01.knights;

import java.io.PrintStream;

public class SlayDragonQuest implements Quest {

	private PrintStream stream;
	
	public SlayDragonQuest(PrintStream stream) {
		super();
		this.stream = stream;
	}

	@Override
	public void embark() {
		stream.println("Embarking on quest to slay the dragon.");
	}

}
