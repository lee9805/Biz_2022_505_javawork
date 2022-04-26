package com.callor.classes.controller;

import com.callor.classes.service.ScoreServiceV1;

public class ScoreControllerV1 {

	public static void main(String[] args) {

		ScoreServiceV1 v1 = new ScoreServiceV1(2);
		int intResult = v1.input();
		if (intResult < 0) {
			System.out.println("입력 도중 중단함");
		} else {
			System.out.println("입력을 모두 마침");
		}
	}
}
