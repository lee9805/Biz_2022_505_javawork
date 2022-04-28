package com.callor.app.primes;

public class Exec7 {

	/*
	 * 100의 배열을 만들고
	 * 2~101까지 임의 정수를 요소 요소에 저장
	 * 각 요소에 저장된 갑중에 소수가 몇개인가 찾아서 출력
	 * 
	 */
	public static void main(String[] args) {


		int intSum = 0;
		int[] intNums = new int[100];
		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = (int) (Math.random() * 100) + 2;
			int j = 2;
			int p = 1;
			
			while(j < intNums[i]) {
				if(intNums[i] %j == 0) {
					p++;
					break;
				}
				j++;
			}
			if(p == 1) {
				System.out.println("소수인 " +intNums[i]);
				intSum ++;
			}
		}
		System.out.println("개수 총합: " +intSum);
	}
}
