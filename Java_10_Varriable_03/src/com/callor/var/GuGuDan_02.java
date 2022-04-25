package com.callor.var;

public class GuGuDan_02 {

	public static void main(String[] args) {
		
		int intDan = 8;
		int intIndex = 1;
		/*
		 * 미리 출력할 모양을 만들고 ("%d * %d = %d") 뒤에 
		 * 나열된 값을 수선대로 %d 대신 부착하여 Console 에 출력하기
		 * 
		 * 양식(form)을 미리 만들고 form 모양에 따라 값을 출력하는 용도의
		 * methomd 
		 * 
		 * "\n" : println 처음 출력후 줄바꿈하기
		 * "\t" : 키보드의 Tap 키를 누른 것 처럼 간격을 띄우기
		 * "%d" :정수형 숫자를 표현하는 기호
		 * 
		 * ++ : 식이 다끝나고 나서 그 다음부터 인식이 된다
		 * 
		 */		
		System.out.printf("\t%d * %d = %d\n", intDan, intIndex, intDan * intIndex++);
		System.out.printf("\t%d * %d = %d\n", intDan, intIndex, intDan * intIndex++);
		System.out.printf("\t%d * %d = %d\n", intDan, intIndex, intDan * intIndex++);
		System.out.printf("\t%d * %d = %d\n", intDan, intIndex, intDan * intIndex++);
		System.out.printf("\t%d * %d = %d\n", intDan, intIndex, intDan * intIndex++);
		System.out.printf("\t%d * %d = %d\n", intDan, intIndex, intDan * intIndex++);
		System.out.printf("\t%d * %d = %d\n", intDan, intIndex, intDan * intIndex++);
		System.out.printf("\t%d * %d = %d\n", intDan, intIndex, intDan * intIndex++);
		System.out.printf("\t%d * %d = %d\n", intDan, intIndex, intDan * intIndex++);
		System.out.printf("\t%d * %d = %d\n", intDan, intIndex, intDan * intIndex++);
		System.out.printf("\t%d * %d = %d\n", intDan, intIndex, intDan * intIndex++);
		System.out.printf("\t%d * %d = %d\n", intDan, intIndex, intDan * intIndex++);
		System.out.printf("\t%d * %d = %d\n", intDan, intIndex, intDan * intIndex++);
		System.out.printf("\t%d * %d = %d\n", intDan, intIndex, intDan * intIndex++);
	}
}
