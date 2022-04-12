package com.callor.controller;

public class Method_02 {

	public static void main(String[] args) {
		//  여기에서 코드 들여쓰기

		int addNum = add();
		int multiNum = multi();
		
		System.out.println(addNum);
		System.out.println(multiNum);
		System.out.println( addNum + multiNum );
	}// end main
	public static int add() {
		int addNum1 = (int)(Math.random() * 100) +1;
		int addNum2= (int)(Math.random() * 100) +1;
		return addNum1 + addNum2;
		
	}public static int multi() {
		int multiNum1 = (int)(Math.random() * 100) +1;
		int multiNum2 = (int)(Math.random() * 100) +1;
		return multiNum1 * multiNum2;
	}

}
