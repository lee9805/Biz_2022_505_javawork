package com.callor.arrays.exec;

public class ExecV5 {

	public static void main(String[] args) {

		int intNum[] = new int[100];
		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = (int) (Math.random() * 100) + 1;
		}

		// 짝수인 수를 덧셈할 변수를 선언
		int intEvenCount = 0;
		int intEvenSum = 0;
		for (int i = 0; i < intNum.length; i++) {
			boolean bEven = (intNum[i] % 2) == 0;

			if (bEven) {
				intEvenCount++;
				//intEvenSum = intEvenSum + intNum[i];
				intEvenSum += intNum[i];
			}
		}
		System.out.println("짝수의 개수 : " + intEvenCount);
		System.out.println("짝수의 총합 : " + intEvenSum);
	}
}
