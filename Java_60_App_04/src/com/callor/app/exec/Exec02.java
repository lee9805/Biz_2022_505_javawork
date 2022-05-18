package com.callor.app.exec;

public class Exec02 {

	public static void main(String[] args) {
		
		int[] nums = new int[10];
		int sum = 0;
		int count = 0;
		
		for( int i = 0; i < nums.length; i++ ) {
			nums[i] = (int)(Math.random() * 100 ) +1;
			
		}
		for(int num : nums) {
			if(num  %2 == 0 ) {
				System.out.println(num);
				sum += num;
				count ++;
			}
		}
		System.out.println("짝수의 총개수 : " + count);
		System.out.println("짝수의 총합 : " + sum);
	}
	
}
