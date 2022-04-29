package com.callor.app.exec;

/*
 *대한민국의 통화는 5만원, 1만원, 5천원, 1천원, 500원, 100원, 50원, 10원 권이 있다
 *급여를 현금으로 지급하는데 최소한의 액면권 개수로 지급하려고 한다
 *급여 금액을 임의로 설정하고 액면권 개수를 계산하여 출력 
 */
public class Exec2 {

	public static void main(String[] args) {
		int num = 5_654_654;
		int paper1 = (num / 50_000);
		int paper2 = (num / 10_000);
		int paper3 = 5_000;
		int paper4 = 1_000;
		int paper5 = 500;
		int paper6 = 100;
		int paper7 = 50;
		int paper8 = 10;

			System.out.println("5만원권 :" +paper1);
			num -= paper1 *50_000;
			
		
		
	}

}
