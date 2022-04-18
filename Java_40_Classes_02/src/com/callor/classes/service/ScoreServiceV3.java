package com.callor.classes.service;
/*
 * 다형성 : 같은 이름의 메서드를 생성해도 아규먼트가 다른 타입들로 생성되면
 * 이름 중복이 가능하다 
 */
public class ScoreServiceV3 {
	protected String[] student;
	protected int[] intKor;

	public ScoreServiceV3() {
		this(10);
	}
	public ScoreServiceV3(int length) {
		student = new String[length];
		intKor = new int[length];
	}
	public ScoreServiceV3(String[] student) {
		this.student = student;
		this.intKor = new int[this.student.length];
	}


	

}
