package com.callor.app.controller;

import com.callor.app.service.ScoreService;
import com.callor.app.service.impl.ScoreServiceImplV3;

public class ScoreControllerV3 {

	public static void main(String[] args) {
		ScoreService scScore = new ScoreServiceImplV3();
		scScore.inputScore();
		scScore.saveScore();
	}
	
}
