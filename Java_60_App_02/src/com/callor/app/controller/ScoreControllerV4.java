package com.callor.app.controller;

import com.callor.app.service.ScoreService;
import com.callor.app.service.impl.ScoreServiceImplV4;

public class ScoreControllerV4 {

	public static void main(String[] args) {
		ScoreService service = new ScoreServiceImplV4();
		service.inputScore();
		service.saveScore();
	}
	
}
