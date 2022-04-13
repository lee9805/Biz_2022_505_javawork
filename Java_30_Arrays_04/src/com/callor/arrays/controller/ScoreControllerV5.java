package com.callor.arrays.controller;

import com.callor.arrays.service.ScoreServiceV5;

public class ScoreControllerV5 {
	public static void main(String[] args) {
		ScoreServiceV5 v5 = new ScoreServiceV5(10);
		v5.makeScore();
		v5.printScore();
		v5.sumScore();
	}

}
