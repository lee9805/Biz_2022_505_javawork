package com.callor.app.exec;

public class Exec6 {

	/*
	 * 임의의 정수 10개를 만들어 각각의 수를 even() 메서드에 매개변수로 전달하고 even() 메서드는 매개변수로 전달받은 값이 짝수이면
	 * 전달 받은 값, 아니면 0을 return even() 메서드가 return 한 값을 합산하여 출력
	 */
	public static void main(String[] args) {

		int num = (int) (Math.random() * 100) + 1;
		
		int index =0;
		for(index = 2; index< num; index++ ) {
			if(num % index == 0) {
				break;
			}
		}
		if(index < num) {
			System.out.println(num + "는 소수가 아님");
		}else {
			System.out.println(num + "는 소수");
		}
	}
}
