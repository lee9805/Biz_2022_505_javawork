package com.callor.arrays.controller;

import com.callor.arrays.service.StudentServiceV1;

public class StudentControllerV1 {
	
	public static void main(String[] args) {
		
		//기본 생성자를 호출하여 인스턴스 생성
		StudentServiceV1 sServiceV10 = new StudentServiceV1();
		
		//임의 생성자를 호출하여 인스턴스 생성
		StudentServiceV1 sServiceV =new StudentServiceV1(5);
		
		sServiceV.inputStudent();
		//sServiceV.printStudent();
		
	}

}
