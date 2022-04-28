package com.callor.app.primes;

import java.util.ArrayList;
import java.util.List;

public class Exec7E {

	/*
	 * 100의 배열을 만들고
	 * 2~101까지 임의 정수를 요소 요소에 저장
	 * 각 요소에 저장된 갑중에 소수가 몇개인가 찾아서 출력
	 * 
	 */
	public static void main(String[] args) {
	
		List<Integer> nums = new ArrayList<>();
		for(int i= 0; i< 100; i++) {
			/*
			 *  int 형 데이터를 Integer 형 변수에 담기 위해서는
			 *  Integer.valueOf() method 사용하여 Integer 형으로 형 변환을 해야 하낟
			 *  하지만 int 형을 Integer 형의 변수에 저자하면
			 *  자동으로 Boxing 이 이루어 진다
			 *  이것을 Auto Boxing 이라고 한다
			 *  반대의 겨우는 Auto UnBoxing이라고 한다
			 */
			Integer num = Integer.valueOf((int)(Math.random() * 100) +1);
			nums.add(num);
		}
		int count =0;
		int size = nums.size();
		for(int i = 0; i < size; i++) {
			int num = nums.get(i);
			int index =0;
			for(index = 2; index < num; index++) {
				if(num % index == 0) {
					break;
				}
			}
			if(index >= num) {
				count++;
			}
		}
		System.out.println("소수의 개수 :" + count);
	}
}
