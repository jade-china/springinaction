package com.jade.spring.springinaction.chapter2.soundsystem.basic;

import com.jade.spring.springinaction.chapter2.soundsystem.basic.MediaPlayer;

public class CDPlayer implements MediaPlayer {

	private MediaPlayer cd;
	
	@Override
	public void play() {
		cd.play();
	}

}
