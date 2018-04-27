package com.jade.spring.springinaction.chapter01.knights;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("knights.xml");
		Knight knight = context.getBean(Knight.class);
		knight.embarkOnQuest();
		context.close();
	}

}
