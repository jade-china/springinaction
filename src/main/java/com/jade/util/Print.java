package com.jade.util;

import java.io.PrintStream;

public class Print {
	
	//��ӡ�հ�����
	public static void print() {
		System.out.println();
	}
	
	//��ӡ����
	public static void print(Object obj) {
		System.out.println(obj);
	}
	
	//��ӡnot line break
	public static void printnb(Object obj) {
		System.out.print(obj);
	}
	
	//��ʽ����ӡ
	public static PrintStream printf(String format, Object... args) {
		return System.out.printf(format, args);
	}

}
