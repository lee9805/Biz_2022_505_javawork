package com.callor.app.exec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exec07 {

	public static void main(String[] args) throws FileNotFoundException {

		FileInputStream is = new FileInputStream("src/com/callor/app/exec/data.txt");
		
		//file 과 관련한 클래스는
		// 객체 선언문과 생성(초기화)를 분리한다
		// try-catch 선언때문에 (throws로도 사용가능)
		Scanner scan = new Scanner(is);
		
		while(scan.hasNext()) {
			System.out.println(scan.nextLine());
		}
		
	}
	 
	
}
