package com.callor.arrays.controller;

import com.callor.arrays.service.ScoreServiceV4;

public class ScoreControllerV4 {
	
	public static void main(String[] args) {
		
		ScoreServiceV4 v4 = new ScoreServiceV4(15);
		v4.makeScore();
		v4.printScore();
	}

}
