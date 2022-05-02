package com.callor.app.model;
/*
 * 성적처리를 하기 위해서 반드시 필요한 데이터
 * 		학번, 국어, 영어, 수학
 * 출력결과를 보기위해서 총점과 평균도 있으면 좋겠다
 * 좀더 확장을하여 학생의 석차 항목도 있으면 좋겠다
 * 
 * 추상화 : 필요한 데이터를 설계
 * private 변수선언 : VO클래스의 추상화된 데이터를 저장할 변수들
 * private 변수에 접근하기 위햐여 getter, setter method 선언
 * 저장된 데이터를 확인하기 위하여 toString() method 도 재정의
 * 
 * spring project 에서는 기본생성자, 모든 필드를 포함한 임의 생성자를
 * 만들지만, Console Project 에서는 생성자는 생략 해도된다
 */
public class ScoreVO {

	private int Num;
	private int Kor;
	private int Eng;
	private int Math;
	private int Sum;
	private float Avg;
	
	private int Rank;
	
	
	public int getRank() {
		return Rank;
	}
	public void setRank(int rank) {
		Rank = rank;
	}
	public int getNum() {
		return Num;
	}
	public void setNum(int num) {
		Num = num;
	}
	public int getKor() {
		return Kor;
	}
	public void setKor(int kor) {
		Kor = kor;
	}
	public int getEng() {
		return Eng;
	}
	public void setEng(int eng) {
		Eng = eng;
	}
	public int getMath() {
		return Math;
	}
	public void setMath(int math) {
		Math = math;
	}
	public int getSum() {
		//Sum = Kor + Eng + Math;
		return Sum;
	}
	public void setSum(int sum) {
		Sum = sum;
	}
	public float getAvg() {
		Avg = (float)(getSum() /3.2);
		return Avg;
	}
	public void setAvg(float avg) {
		Avg = avg;
	}
	@Override
	public String toString() {
		String scStr = String.format("%5d\t", Kor);
		scStr += scStr + String.format("%5d\t", Eng);
		scStr += scStr + String.format("%5d\t", Math);
		scStr += scStr + String.format("%5d\t", getSum());
		scStr += scStr + String.format("%5.2f\n", getAvg());
		
		return scStr;
	}
	
	
}
