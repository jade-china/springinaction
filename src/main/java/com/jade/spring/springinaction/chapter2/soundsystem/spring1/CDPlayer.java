package com.jade.spring.springinaction.chapter2.soundsystem.spring1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jade.spring.springinaction.chapter2.soundsystem.spring1.MediaPlayer;

@Component
public class CDPlayer implements MediaPlayer {

	private CompactDisc cd;
	
	@Autowired
	public CDPlayer(CompactDisc cd) {
		super();
		this.cd = cd;
	}

	@Override
	public void play() {
		cd.play();
	}

}
