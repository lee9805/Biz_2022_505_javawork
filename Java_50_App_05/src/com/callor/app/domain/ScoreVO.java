package com.callor.app.domain;

public class ScoreVO {

	private String intNum;
	private String intKor;
	private String intEng;
	private String intMath;
	private String intSum;
	private String intAvg;
	public String getIntNum() {
		return intNum;
	}
	public void setIntNum(String intNum) {
		this.intNum = intNum;
	}
	public String getIntKor() {
		return intKor;
	}
	public void setIntKor(String intKor) {
		this.intKor = intKor;
	}
	public String getIntEng() {
		return intEng;
	}
	public void setIntEng(String intEng) {
		this.intEng = intEng;
	}
	public String getIntMath() {
		return intMath;
	}
	public void setIntMath(String intMath) {
		this.intMath = intMath;
	}
	public String getIntSum() {
		return intSum;
	}
	public void setIntSum(String intSum) {
		this.intSum = intSum;
	}
	public String getIntAvg() {
		return intAvg;
	}
	public void setIntNums(String intAvg) {
		this.intAvg = intAvg;
	}
	@Override
	public String toString() {
		return "ScoreVO [intNum=" + intNum + ", intKor=" + intKor + ", intEng=" + intEng + ", intMath=" + intMath
				+ ", intSum=" + intSum + ", intAvg=" + intAvg + "]";
	}
	
	
}
