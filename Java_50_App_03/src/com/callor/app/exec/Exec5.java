package com.callor.app.exec;

public class Exec5 {

	/*
	 * 임의의 정수 10개를 만들어 각각의 수를 even() 메서드에 매개변수로 전달하고 even() 메서드는 매개변수로 전달받은 값이 짝수이면
	 * 전달 받은 값, 아니면 0을 return even() 메서드가 return 한 값을 합산하여 출력
	 */
	public static void main(String[] args) {

		int num = (int) (Math.random() * 100) + 1;
		int iFlag =0;
		
		for(int i =2; i < num ; i++ ) {
			if(num % i == 0) {
				iFlag++;
			}
		}
		if(iFlag == 0) {
			System.out.println(num +"는(은) 소수");
		}else {
			System.out.println(num +"는(은) 소수가 아님");
		}
		if(iFlag == 1) {
			System.out.println(num +"는(은) 소수");
		}else {
			System.out.println(num +"는(은) 소수가 아님");
		}
		//안전한 조건검사
		if(iFlag > 0) {
			System.out.println(num +"는(은) 소수가 아님");
		}else {
			System.out.println(num +"는(은) 소수");
		}
	}
}