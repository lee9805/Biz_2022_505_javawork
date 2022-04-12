package com.callor.controller;

public class Boolean_03 {

	public static void main(String[] args) {
		
		boolean bYes = true;
		boolean bWhat = bYes;
		
		//bYes 에 저장된 값이false가 물어보는 연산이 실행되고
		// 그결과가 bWhat 에 저장된다
		bWhat = bYes == false;
		
		//bYes 에 저장된 값이 true가 아니냐? 라고 물어보는연산
		// 결과는 당연히 false
		bWhat = bYes != true;
		
		// ! : not 연산기호
		// boolean 형 데이터를 반전 시키는 연산
		//true가 담겨 있으면 false, false가 담겨 있으면 true
		bWhat = !bYes;
		
		// !(not 연산자)를 사용하여 변수 값을true, false가 
		//반복되도록  하는 명령문
		bWhat = !bWhat;
		bWhat = !bWhat;
		
	}
}
