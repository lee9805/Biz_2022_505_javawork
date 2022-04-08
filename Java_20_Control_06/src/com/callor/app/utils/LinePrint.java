package com.callor.app.utils;

/*
 * Math.random() : Math 클래스에 선언된 static random() method 호출
 * 
 * dLine과 sLIne 을 public static 으로 선언하였다
 * 이두 static 변수는 이 프로젝트 전체 어디에서든
 * 	LinePrint.dLine이나 LinePrint.sLine 으로 값을 사용할 수 있다
 */
public class LinePrint {

	
	public static String dLine = "=".repeat(100);
	public static String sLine = "-".repeat(100);
}
