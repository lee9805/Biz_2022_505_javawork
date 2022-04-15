package com.callor.classes.utils;

public class Line {

	public static String dLine(int length) {
		String dLine = "="; // 문자열 dLine을 생성하고 문자열 "="를 dLine에 담는다
		return dLine.repeat(length); // dLine 길이를 length만큼 생성해서 return 한다
	}

	public static String sLine(int length) {
		return "-".repeat(length);
	}

}
