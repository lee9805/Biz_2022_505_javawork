package com.callor.score.controller;

import com.callor.score.service.ScoreServiceV2;

public class ScoreControllerV2 {

	public static void main(String[] args) {

		String[] StName = {"홍길동","이몽룡","성춘향","장보고","임꺽정"};
		
		ScoreServiceV2 serviceV2 = new ScoreServiceV2(StName);
		serviceV2.makeScore();
		serviceV2.printScore();
	}


}
