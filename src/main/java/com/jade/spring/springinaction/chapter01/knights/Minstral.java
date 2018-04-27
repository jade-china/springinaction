package com.jade.spring.springinaction.chapter01.knights;

import java.io.PrintStream;

public class Minstral {
	
	private PrintStream stream;

	public Minstral(PrintStream stream) {
		super();
		this.stream = stream;
	}
	
	public void singBeforeQuest() {
		stream.println("Fa la la, the knight is so brave!");
	}

	public void singAfterQuest() {
		stream.println("Tee hee hee, the brave knight did embark on a quest!");
	}
}
