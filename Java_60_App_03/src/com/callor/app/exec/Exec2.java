package com.callor.app.exec;

public class Exec2 {

	public static void main(String[] args) {
		
		int intSum = 0;
		int index;
		for(index = 0; index < 100; index++) {
			intSum += index +1;
		}
		System.out.println("1 ~ 100 까지 정수의 덧셈 결과 : " + intSum );
	}
	
}
