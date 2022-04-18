package com.callor.classes.controller;

import com.callor.classes.service.ScoreServiceV3;

public class ScoreControllerV3 {

	public static void main(String[] args) {

		ScoreServiceV3 v3 = new ScoreServiceV3();
		v3 = new ScoreServiceV3(20);
		
		/*
		 * String[] strName = new String[5];
		 * String[0] ="홍길동";
		 * String[0] ="이몽룡";
		 * String[0] ="장보고";
		 * String[0] ="성춘향";
		 * String[0] ="임꺽정";
		 * */
		String[] strNames = {"홍길동", "이몽룡", "장보고", "성춘향", "임꺽정"};
		v3 = new ScoreServiceV3(strNames);
 	}
}
