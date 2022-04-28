package com.callor.app.primes;

public class Exec7B {

	/*
	 * 100의 배열을 만들고
	 * 2~101까지 임의 정수를 요소 요소에 저장
	 * 각 요소에 저장된 갑중에 소수가 몇개인가 찾아서 출력
	 * 
	 */
	public static void main(String[] args) {
		
		int[] nums = new int[100];
		for(int i = 0; i <nums.length; i++) {
			int num =(int)(Math.random() *100 ) +2;
			nums[i] = num;
		}
		int count = 0;
		for( int num : nums) {
			int index = 0;
			for(index = 2; index <num; index++) {
				if( num % index ==0) {
					break;
				}
			}
			// for(index) 가 break 를 만났으면 index 값은 num 보다 항상 작다
			// index 값이 num 보다 작다는 것은 num 가 소수가 아니라는 것
			// 그 반대이면  index == num 로 검사할수 있지만
			//index >= num 로 검사하여 좀더 안전한 코드로 작성한다
			if(index >= num) {
				count ++;
			}
		}
		System.out.println("소수의 개수 :" + count);
	}
}
