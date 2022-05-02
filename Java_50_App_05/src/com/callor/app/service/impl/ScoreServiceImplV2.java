package com.callor.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;
import com.callor.app.utils.Line;

public class ScoreServiceImplV2 implements ScoreService {
	
	protected int stCount;
	protected final List<ScoreVO> scList;
	
	protected final int lineLength = 50;
	protected final String[] subs;
	
	public ScoreServiceImplV2() {
		scList = new ArrayList<>();
		stCount = 20;
		subs = new String[]{"학번","국어","영어","수학","총점","평균"};
	}
	private int getScore () {
		int score = (int)(Math.random() * 50 )+51;
		return score;
	}
	public void makeScore() {
		for(int i = 0 ; i < stCount ; i++) {
			ScoreVO scVO = new ScoreVO();
			scVO.setNum(i + 1);
			scVO.setKor(getScore());
			scVO.setMath(getScore());
			scVO.setEng(getScore());
			scList.add(scVO);	
		}
	}
	@Override
	public void printScore() {
		System.out.println(Line.dLine(lineLength));
		System.out.println("한국고교 성적일람표");
		System.out.println(Line.sLine(lineLength));
		for(String sub : subs) {
			System.out.print(sub + "\t");
		}
		System.out.println();
		System.out.println(Line.sLine(lineLength));
		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;
		int sumTotal = 0;
		for(ScoreVO scVO : scList) {
			System.out.printf("%5d\t",scVO.getNum());
			System.out.printf("%5d\t",scVO.getKor());
			System.out.printf("%5d\t",scVO.getEng());
			System.out.printf("%5d\t",scVO.getMath());
			System.out.printf("%5d\t",scVO.getSum());
			System.out.printf("%5.2f\n",scVO.getAvg());
			korTotal += scVO.getKor();
			engTotal += scVO.getEng();
			mathTotal += scVO.getMath();
			sumTotal += scVO.getSum();
		}
		System.out.printf("%5d\t", korTotal);
		System.out.printf("%5d\t", engTotal);
		System.out.printf("%5d\t", mathTotal);
		System.out.printf("%5d\t", sumTotal);
	}
		
	}
	
	

