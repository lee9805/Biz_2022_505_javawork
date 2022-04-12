package com.callor.arrays.exec;

public class ExecV6 {

	public static void main(String[] args) {
		
		System.out.println("\t짝수 리스트\n");
		System.out.println("===================");
		
		int intNum[] =new int[100];
		for(int i = 0 ; i < intNum.length; i++) {
			intNum[i] = (int)(Math.random() * 100) + 1;
		}
		
		int Count = 0;
		for( int i= 0; i < intNum.length ; i++ ) {
		
		if(intNum[i] % 2 ==0 ) {
			System.out.print(intNum[i] + ",\t");
			Count++;
			
		}
		if(Count == 5) {
			System.out.println("");
			Count = 0;
		}
		}
	}
}
