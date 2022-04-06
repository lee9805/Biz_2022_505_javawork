package com.callor.controller;

public class ControllerV3 {

	public static void main(String[] args) {
		
		//if(비교연산식) { }
		//for(;;) { }
		
		int intNum =1;
		/*
		 * for() 반복문을 코드 내부에 조건연산을 추가하여
		 * 반복 횟수를 제한하기
		 * break : for() 반복문을 중단하는 키워
		 */
		for(;;) {
			
			System.out.printf("\t%d * %d =  %d\n", 3, intNum, 3 * intNum++);

		}// end for
	} // end main
}//end classcontroller
