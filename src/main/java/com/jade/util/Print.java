package com.jade.util;

import java.io.PrintStream;

public class Print {
	
	//换行
	public static void print() {
		System.out.println();
	}
	
	//打印并换行
	public static void print(Object obj) {
		System.out.println(obj);
	}
	
	//打印，不换行
	public static void printnb(Object obj) {
		System.out.print(obj);
	}
	
	//格式化打印
	public static PrintStream printf(String format, Object... args) {
		return System.out.printf(format, args);
	}

}
