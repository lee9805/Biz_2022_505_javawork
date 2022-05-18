package com.callor.app.exec;

import com.callor.utils.Line;

public class Exec06 {

	public static void main(String[] args) {

		System.out.println(Line.dLine(10));
		System.out.println("7단 구구단");
		System.out.println(Line.sLine(10));
		int num = 7;
		for(int i= 2; i < 10 ; i++) {
			int result = num * i;
			System.out.printf("%d × %d = %d\n", num , i , result);
		}
	}
	
}
