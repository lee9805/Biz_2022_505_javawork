package com.callor.controller;

// 지금부터 java.util package에 담긴
//Scanner라는 클래스를 연결해서 사용하겠다
import java.util.Scanner;

public class ScannerEx_01 {
	
	public static void main(String[] args) {
		
		int intRnd = (int)(Math.random() * 100) +1 ;
		
		// 클래스를 사용하여 객체(object)를 선언하기
		// Scanner 클래스에 포함된 를 method호출하여
		// 무언가 명령을 수행하기 위한 첫 준비 단계
		// 객체(object)를 선언한다
		// 객체가 선언만 된 상태에서는 아직 method를 호출 하여
		// 무엇가 명령을 수행할수 없다
		Scanner scan;
		
		System.out.println("console에 출력");
		/*
		 * 선언된 scan object를 인스턴스로 만들어
		 * 메모리에 loading하고 사용할 준비가 된 상태
		 * 이때 "scan 인스턴스"라고 부른다
		 * 
		 * new Scanner(System.in)
		 * pc에 연결된 키보드를Scanner 클래스에게 연결하여
		 * 키보드로 부터 데이터(값)을 입력받을수 있도록 한다
		 * 
		 */
		scan = new Scanner(System.in);
		
		String inputStr = new String();
		
		inputStr = scan.nextLine();
		System.out.println("inputStr 값 : "+ inputStr);
		
		
		
		
		
	}

}
