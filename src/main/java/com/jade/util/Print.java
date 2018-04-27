package com.jade.util;

import java.io.PrintStream;

public class Print {
	
	//打印空白新行
	public static void print() {
		System.out.println();
	}
	
	//打印新行
	public static void print(Object obj) {
		System.out.println(obj);
	}
	
	//打印not line break
	public static void printnb(Object obj) {
		System.out.print(obj);
	}
	
	//格式化打印
	public static PrintStream printf(String format, Object... args) {
		return System.out.printf(format, args);
	}

}
