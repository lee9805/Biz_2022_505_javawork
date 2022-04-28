package com.callor.app.primes;

import java.util.ArrayList;
import java.util.List;

public class Exec7C {

	/*
	 * 100의 배열을 만들고
	 * 2~101까지 임의 정수를 요소 요소에 저장
	 * 각 요소에 저장된 갑중에 소수가 몇개인가 찾아서 출력
	 * 
	 */
	public static void main(String[] args) {
		int[] nums = new int[100];
		for(int i =0; i< nums.length; i++) {
			nums[i] = (int)(Math.random() * 100 ) +2;
		}
		int count =0 ;
		for(int num: nums) {
			count+=prime(num);
		}
		/*
		 * int conut =0; for(int i= 0; i < nums.length; i++) { count += prime( nums[i]);
		 * }
		 */
			System.out.println("소수의 개수 : " + count);
	}
	/*
	 * 매개변수로 전달받은 num 변수 값이
	 * 소수이면 1을 아니면 0을 return 한다
	 */
	public static int prime(int num) {
		for(int i = 2; i< num; i++) {
			if(num % 2 == 0) {
				return 0;
			}
		}
		return 1;
	}
}
