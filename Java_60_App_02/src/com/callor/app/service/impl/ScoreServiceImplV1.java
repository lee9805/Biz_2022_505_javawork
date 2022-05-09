package com.callor.app.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;


public class ScoreServiceImplV1 implements ScoreService {

	protected final List<ScoreVO> scList;
	protected final Scanner scan;
	public ScoreServiceImplV1() {
		scList = new ArrayList<>();
		scan = new Scanner(System.in);
	}
	
	@Override
	public void inputScore() {

		while(true) {
			
			//학생이름 입력
			System.out.println("학생이름입력(QUIT:종료) >> ");
			String stName = scan.nextLine();
			//QUIT 입력되면 break;
			if(stName.equals("QUIT")) {
				break;
			}
			//국어, 영어, 수학 입력
			System.out.println("국어 점수 >> ");
			String strKor = scan.nextLine();
			Integer intKor = Integer.valueOf(strKor);
			
			System.out.println("영어 점수 >> ");
			String strEng = scan.nextLine();
			Integer intEng = Integer.valueOf(strEng);
			
			System.out.println("수학 점수 >> ");
			String strMath = scan.nextLine();
			Integer intMath = Integer.valueOf(strMath);
			
			// VO 생성, VO에 setting, scList.add()
		ScoreVO scVO = new ScoreVO();
		
		scVO.setStName(stName);
		scVO.setIntKor(intKor);
		scVO.setIntEng(intEng);
		scVO.setIntMath(intMath);
		
		scList.add(scVO);
		}
		System.out.println("입력이 중단되었습니다.");
	}

	@Override
	public void saveScore() {

		
		
	}

}
