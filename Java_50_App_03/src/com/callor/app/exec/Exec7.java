package com.callor.app.exec;

public class Exec7 {

	/*
	 * 임의의 정수 10개를 만들어 각각의 수를 even() 메서드에 매개변수로 전달하고 even() 메서드는 매개변수로 전달받은 값이 짝수이면
	 * 전달 받은 값, 아니면 0을 return even() 메서드가 return 한 값을 합산하여 출력
	 */
	public static void main(String[] args) {

		int[] intNums = new int[100];
		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = (int) (Math.random() * 100) + 1;
			for(int i = 0; i < intNums.length; i++) {
			boolean isPrime = true;

			for (int f = 2; f < intNums.length; f++) {
				if (intNums[i] % f == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println(intNums[i] + "소수이다");
			}
		}
			
	}
}
