package com.callor.classes.exec;

import com.callor.classes.utils.Line;

public class String2IntV1 {
	
	public static void main(String[] args) {
		
		String strAge ="";
		int intAge = 33;
		
		//숫자형 변수 + "문자열" : 숫자값을 문자열형 값으로 형변환
		strAge = intAge + "";
		
		/*
		 * Integer.toString(정수값) :
		 * Integer 클래스에 선언된 toString static method에게
		 * 정수값 arg 로 전달하여 문자열로 return 받는다
		 */
		/*
		 * Integer.toString() 메서드를 사용하여
		 * 정수형 숫자를 문자열형 숫자로 바꾼다
		 */
		strAge = Integer.toString(intAge);
		
		System.out.println(strAge);
		
		/*
		 * Integer.valueOf() 메서드를 사용하여
		 * 정수형 숫자를 문자열형 숫자로 바꾼다
		 */
		strAge = "55";
		intAge = Integer.valueOf(intAge);
		
		System.out.println(Integer.toBinaryString(33));
		
		int num1 = 33;
		int num2 = 55;
		String strBinNum1 = Integer.toBinaryString(num1);
		String strBinNum2 = Integer.toBinaryString(num2);

		/*
		 * int intBinNum1 = Integer.valueOf(strBinNum1); 
		 * int intBinNum2 = Integer.valueOf(strBinNum2);
		 */		
		
		int intSum = num1 + num2;
		String strSum = Integer.toBinaryString(intSum);
		
		System.out.println(Line.dLine(20));
		System.out.printf("    %s\n", strBinNum1);
		System.out.printf(" +  %s\n", strBinNum2);
		System.out.println("-".repeat(20));
		System.out.println(strSum);
		System.out.println(Line.sLine(20));
	}

}
