package com.callor.classes.controller;

import com.callor.classes.service.ScoreServiceV1;

public class ScoreControllerV1 {
	
	public static void main(String[] args) {
		
		ScoreServiceV1 v1 = new ScoreServiceV1(3);
		v1.input();
		v1.print();
		
		
	}

}
