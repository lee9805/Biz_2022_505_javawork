package com.callor.var;

public class Var_01 {

	public static void main(String[] args) {
		
		//실수(double) 형으로 선언을 할경우 0 보다는 0.0 처럼
		//명확하게 표현하는 것이 좋다
		double douNum1 = 0;
		double douNum2 = 0;
		
		douNum1 = Math.random() * 1000;
		douNum2 = Math.random() * 1000;

		System.out.println(douNum1);
		System.out.println(douNum2);
		
		System.out.println(douNum1 + douNum2);
		System.out.println(douNum1 - douNum2);
		System.out.println(douNum1 * douNum2);
		System.out.println(douNum1 / douNum2);
		 
	}

}
