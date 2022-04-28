package com.callor.app.primes;

import java.util.ArrayList;
import java.util.List;

public class Exec7F {

	/*
	 * 100의 배열을 만들고
	 * 2~101까지 임의 정수를 요소 요소에 저장
	 * 각 요소에 저장된 갑중에 소수가 몇개인가 찾아서 출력
	 * 
	 */
	public static void main(String[] args) {
	
		List<Integer> nums = new ArrayList<>();
		for(int i= 0; i< 100; i++) {
			int num = (int)(Math.random() * 100 ) +2;
			nums.add(num);
		}
		int count =0;
		int size = nums.size();
		for (Integer i =0; i<size; i++) {
			count += prime(nums.get(i));
		}
		/*
		 * count =0;
		 * for(Integer num : nums) {
		 * count += prime(num);
		 * }
		 */
		System.out.println("소수의 개수" + count);
	}
	public static Integer prime(Integer num) {
		for(Integer i =0 ; i <num ;i++) {
			if(num %i ==0) {
				return 0;
			}
		}
		return 1;
	}
}
