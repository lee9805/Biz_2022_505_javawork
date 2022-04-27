package com.callor.app.exec;

public class Exec01 {
	public static void main(String[] args) {

		int intSum = 0;
		int[] intNums = new int[100];
		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = (int) (Math.random() * 100) + 1;
			int j = 2;
			int p = 1;
			
			while(j < intNums[i]) {
				if(intNums[i] %j == 0) {
					p=0;
					break;
				}
				j++;
			}
			if(p == 1) {
				System.out.println("" +intNums[i]);
				intSum ++;
			}
		}
		System.out.println("ÃÑ °¹¼ö : " +intSum);
	}
}
