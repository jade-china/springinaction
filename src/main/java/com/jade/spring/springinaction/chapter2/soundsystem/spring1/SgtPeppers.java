package com.jade.spring.springinaction.chapter2.soundsystem.spring1;

import static com.jade.util.Print.printf;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc {

	private String title = "Sgt. Pepper's Lonely Hearts Club Band";
	private String artist = "The Beatles";
	
	@Override
	public void play() {
		printf("Playing %s by %s", title, artist);
	}

}
