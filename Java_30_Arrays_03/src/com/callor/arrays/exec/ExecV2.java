package com.callor.arrays.exec;

public class ExecV2 {

	public static void main(String[] args) {

		int intNum[] = new int[100];
		//for() 명령문의 선언부에서 변수를 선언하면
		//for() {} 이 끝날때 변수가 소멸된다
		//같은 method 내에서 같은 이름의 변수를 계속 사용할수 있다
		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = (int) (Math.random() * 100) + 1;
		}

		for (int i = 0; i < intNum.length; i++) {

			boolean bEven = true;
			bEven = (intNum[i] % 2) == 0;

			
			if (bEven) {
				System.out.println((i + 1) + "번째는 " + intNum[i] + "는(은) 짝수");
			} else {
				System.out.println((i + 1) + "번째는 " + intNum[i] + "는(은) 홀수");
			/*
			 * if(bEven) {
			 * System.out.printf("\t%d 는(은) 짝수\n" , intNum[i]);
			 * } else {
			 * System.out.printf("\t%d 는(은) 짝수가 아님\n" , intNum[i]);
			 * }
			 */
			}

		}
	}
}
