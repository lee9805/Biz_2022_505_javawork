package com.callor.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;
import com.callor.app.utils.Line;

public class ScoreServiceImplV1 implements ScoreService {

	/*
	 * Service 클래스에서 필요한 데이터를 클래스 영역에 선언할때는 final 키워드를 부착하자 final 키워드를 부착하면 혹시 모를
	 * 데이터 손상을 방지하고 데이터가 저장된 상태에서 임의의 또다시 초기화 하는 것을 방지한다 초기화 하지 않으면 오류가 나서
	 * NullPointerException도 막을수 있다
	 */

	// 리스트 객체를 final로 선언하고
	private final List<ScoreVO> scList;

	public ScoreServiceImplV1() {
		scList = new ArrayList<>();
	}

	@Override
	public void makeScore() {
//		int size = scList.size();
		for (int i = 0; i < 20; i++) {
			
			int intKor = (int) (Math.random() * 50) + 51;
			int intEng = (int) (Math.random() * 50) + 51;
			int intMath = (int) (Math.random() * 50) + 51;

			// 생성된 3과목의 점수를 VO클래스를 생성하여 저장하기
			ScoreVO scVO = new ScoreVO();
			scVO.setNum(i + 1);
			scVO.setKor(intKor);
			scVO.setEng(intEng);
			scVO.setMath(intMath);

			int intSum = intKor + intEng + intMath;
			float fAvg = (float) intSum / 3;

			scVO.setSum(intSum);
			scVO.setAvg(fAvg);
		
			scList.add(scVO);

		}
	}

	@Override
	public void printScore() {
		int size = scList.size();
		int lineLength = 50;

		System.out.println(Line.dLine(lineLength));
		System.out.println("한국고교 성적일람표");
		System.out.println(Line.sLine(lineLength));

		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println(Line.sLine(lineLength));

		int[] intTotal = new int[4];
		int KOR = 0;
		int ENG = 0;
		int MATH = 0;
		int SUM = 0;
		for (int i = 0; i < size; i++) {
			ScoreVO scVO = scList.get(i);
			System.out.printf("%5d\t", scVO.getNum());
			System.out.printf("%5d\t", scVO.getKor());
			System.out.printf("%5d\t", scVO.getEng());
			System.out.printf("%5d\t", scVO.getMath());
			System.out.printf("%5d\t", scVO.getSum());
			System.out.printf("%5.2df\n", scVO.getAvg());

			intTotal[KOR] += scVO.getKor();
			intTotal[ENG] += scVO.getEng();
			intTotal[MATH] += scVO.getMath();
			intTotal[SUM] += scVO.getSum();
		}
		System.out.println(Line.sLine(lineLength));
		System.out.printf("%d\t%d\t%d\t%d\n", intTotal[KOR], intTotal[ENG], intTotal[MATH], intTotal[SUM]);
	}

}
