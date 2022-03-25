package com.callor.var;

public class Var_02 {
	public static void main(String[] args) {
		
		int num1 = 100;
		int num2 = 200;
		
		int num3 = 0;
		int num4 = 0;
		num3 = 200;
		num4 = 300;
		//변수에 값을 저장(할당,대입) 하거나
		//읽을려면 반드시 이전에 변수가
		//최소한 선언되어 있어야 한다.
		System.out.println(num3 + num4);

		int num5 = 0;
		num5 =100;
		num5 = 1000;
		System.out.println(num5);
		num5 = 99;
		num5 =-1;
		//전에 있는 어떤 숫자든 마지막 초기화를 하면 
		//전에 숫자는 삭제되고 마지막 초기화만 남는다.
		System.out.println(num5);
		
		
	}

}
