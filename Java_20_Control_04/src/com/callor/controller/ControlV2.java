package com.callor.controller;

public class ControlV2 {

	public static void main(String[] args) {
		
		//if(비교연산식) { }
		//for(;;) { }
		
		int intNum =1;
		/*
		 * for() 반복문을 아무런 조건없이 실행하여
		 * {} 내부의 코드를 무한 반복하기
		 */
		for(;;) {
			
			System.out.printf("\t%d * %d =  %d\n", 3, intNum, 3 * intNum++);

			if(intNum > 9) {
				System.out.println("\t10 넘어감");
				/*
				 * for() 반복문 내에서  break 명령이 실행되면
				 * 즉시 반복을 멈춘다
				 */
				break;
			}// end if
		}// end for
	} // end main
}//end classcontroller
