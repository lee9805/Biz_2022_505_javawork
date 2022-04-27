package com.callor.app.exec;

public class Exec4A {

	/*
	 * 1 ~ 100까지 임의 수를 생성하고 그 수가 소수 (prime number)인지 판별하시오
	 */
	public static void main(String[] args) {

		int n = 0;
		int num = (int) (Math.random() * 100) + 1;// num의 변수에 랜덤 숫자 저장
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				n++;
				break;
			}
		}
		if (n == 0) {
			System.out.println(num + "은(는) 소수 이다");
		} else {
			System.out.println(num + "은(는) 소수가 아니다");
		}
	}
}