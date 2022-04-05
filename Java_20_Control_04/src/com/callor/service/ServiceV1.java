package com.callor.service;

public class ServiceV1 {
	
	/*
	 * void type method를
	 * guguDan 이름으로 선언하기
	 * void type method 는 return 명령이 없어도 된다.
	 */
	public void guguDan() {
		
		int intNum1 = 3;
		int intDan = 1;
		int intRnd = intNum1 * intDan;
		
		System.out.printf("\t%d × %d = %d\n", intNum1 , intDan, intNum1 * intDan++);
		System.out.printf("\t%d × %d = %d\n", intNum1 , intDan, intNum1 * intDan++);
		System.out.printf("\t%d × %d = %d\n", intNum1 , intDan, intNum1 * intDan++);
		System.out.printf("\t%d × %d = %d\n", intNum1 , intDan, intNum1 * intDan++);
		System.out.printf("\t%d × %d = %d\n", intNum1 , intDan, intNum1 * intDan++);
		System.out.printf("\t%d × %d = %d\n", intNum1 , intDan, intNum1 * intDan++);
		System.out.printf("\t%d × %d = %d\n", intNum1 , intDan, intNum1 * intDan++);
		System.out.printf("\t%d × %d = %d\n", intNum1 , intDan, intNum1 * intDan++);
		System.out.printf("\t%d × %d = %d\n", intNum1 , intDan, intNum1 * intDan++);	
		
	}

}
