package com.callor.app.controller;

import com.callor.app.service.ServiceV2;

/*
 * ServiceV2 클래스에 guguDan()를 선언하고
 * guguDan( )는 구구단 3단을 출력한다
 * ControllerV2에서 guguDan() 호출하여
 * 구구단을 보여준다
 */
public class ControllerV2 {

	public static void main(String[] args) {
		ServiceV2 sV2 = new ServiceV2();
		sV2. guguDan();
		System.out.println("===========================================");
		sV2.guguDan(8);
		
	}

}
