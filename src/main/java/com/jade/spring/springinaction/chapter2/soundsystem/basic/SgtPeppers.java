package com.jade.spring.springinaction.chapter2.soundsystem.basic;

import static com.jade.util.Print.printf;

public class SgtPeppers implements CompactDisc {

	private String title = "Sgt. Pepper's Lonely Hearts Club Band";
	private String artist = "The Beatles";
	
	@Override
	public void play() {
		printf("Playing %s by %s", title, artist);
	}

}
