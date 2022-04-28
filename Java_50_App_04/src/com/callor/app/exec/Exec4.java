package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

public class Exec4 {

	public static void main(String[] args) {
		
		List<Integer> nums =new ArrayList<>();
		for(int i =0; i< 100; i++) {
			nums.add((int)(Math.random() *100) +1);
		}
		//1번째 방법
		int lastIndex = 0;
		int lastValue = 0;
		int size = nums.size();
		for(int i= 0; i< size; i++) {
			int num = nums.get(i);
			if(num >= 55) {
				lastIndex = i;
				lastValue = num;
			}
		}
		System.out.printf("\t%3d : %3d\n", lastIndex, lastValue);
		
		//2번째 방법
		lastIndex = 0;
		for(int i =0; i <size; i++) {
			int num = nums.get(i);
			if(num >=55) {
				lastIndex = i;
			}
		}
		System.out.printf("\t%3d : %3d\n", lastIndex, nums.get(lastIndex));
		
		//3번째 방법
		//for() index 를 역순으로 진행하기
		for(int i = size -1; i> -1; i--) {
			if(nums.get(i) >= 55) {
				System.out.printf("\t%3d 번째 %3d", i, nums.get(i));
				break;
			}
		}
	}
	
}
