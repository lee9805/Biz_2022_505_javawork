package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.ScoreVO;

public class ObjectEx1 {

	public static void main(String[] args) {
		
		//한사람의 성적을 저장할 VO 객체 생성
		ScoreVO scVO = new ScoreVO();
		scVO.setStNum(1);
		scVO.setIntEng(90);
		scVO.setIntEng(80);
		scVO.setIntMath(85);
		
		// 5명 학생의 성적을 저장할 VO 배열 선언
		ScoreVO[] scVOs = new ScoreVO[5];
		
		//scVOs 배역의 0변 요소를 객체로 생성하기(초기화 하기)
		scVOs[0] = new ScoreVO();
		scVOs[0].setStNum(2);
		scVOs[0].setIntKor(0);
		scVOs[0].setIntEng(0);
		scVOs[0].setIntMath(0);

		scVOs[1] = new ScoreVO();
		scVOs[1].setStNum(3);
		scVOs[1].setIntKor(0);
		scVOs[1].setIntEng(0);
		scVOs[1].setIntMath(0);
		
		
		
		//다수의 학생 성적을 저장할 ScoreVO list를 생성
		List<ScoreVO> scList = new ArrayList<>();
		ScoreVO sVO1 = new ScoreVO();
		sVO1.setStNum(4);
		sVO1.setIntKor(88);
		sVO1.setIntEng(88);
		sVO1.setIntMath(77);
		scList.add(sVO1);
		
		sVO1 = new ScoreVO();
		sVO1.setStNum(5);
		sVO1.setIntKor(98);
		sVO1.setIntEng(88);
		sVO1.setIntMath(78);
		
	}
	
}
