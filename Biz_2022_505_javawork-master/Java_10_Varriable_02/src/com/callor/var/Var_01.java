package com.callor.var;

public class Var_01 {
	
	/*
	 * 1. 변수명은 키워드 등으로 사용할수 없다
	 * 2. 같은 변수명은 한 블럭( { } ) 내부에서 
	 *    두번이상 선언할수 없다
	 * 3. 변수명은 첫글자가 반드시 소문자다
	 * 4. 두 단어 이상을 조합하여 의미있는 단어로 작성
	 */	
	public static void main(String[] args) {
	 //변수 선언과 0으로 초기화(clear라고 표현)

		int num1 = 0; /* 선언과 초기화 */
		int num2 = 0;
		
		num1= 55; /* 대입하기 */
		num2= 33;
		
		/*
		 * 위에 선언과 대입를 동시 표기
		 * int num = 55; 
		 * int num = 33;
		 */		
		
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
	}

}
