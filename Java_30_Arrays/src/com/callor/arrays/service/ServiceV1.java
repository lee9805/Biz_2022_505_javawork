package com.callor.arrays.service;

public class ServiceV1 {
	
	public int scoreKorSum() {
		
		int intKor1 = (int)(Math.random() * 100) + 1;
		int intKor2 = (int)(Math.random() * 100) + 1;
		int intKor3 = (int)(Math.random() * 100) + 1;
		int intKor4 = (int)(Math.random() * 100) + 1;
		int intKor5 = (int)(Math.random() * 100) + 1;
		
		
		int intSum = intKor1 + intKor2 + intKor3 + intKor4 + intKor5;		
		return intSum;
	}
	

}
