package com.callor.arrays.controller;

import com.callor.arrays.service.ServiceV1;
import com.callor.arrays.service.ServiceV1A;

public class ControllerV1 {
	
	public static void main(String[] args) {
		
		ServiceV1 v1 = new ServiceV1();
		int intKor1 = v1.scoreKorSum();
		System.out.println("총점 : " + intKor1);

		ServiceV1A v1a = new ServiceV1A();
		int intKor2 = v1a.scoreKorSum();
		System.out.println("총점 : " + intKor2);
				
	}

}
