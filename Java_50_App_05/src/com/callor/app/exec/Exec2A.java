package com.callor.app.exec;

/*
 *대한민국의 통화는 5만원, 1만원, 5천원, 1천원, 500원, 100원, 50원, 10원 권이 있다
 *급여를 현금으로 지급하는데 최소한의 액면권 개수로 지급하려고 한다
 *급여 금액을 임의로 설정하고 액면권 개수를 계산하여 출력 
 */
public class Exec2A {

	public static void main(String[] args) {
		int pay = 5_654_654;
		int money =50_000;
		int sw = 1;
		
		while(pay > 0) {
			int paper = pay / money;
			System.out.printf("%7d 권 : %5d 매\t", money, paper);
			pay -= paper * money;
			
			if(sw > 0) {
			money = money /5;
			} else {
				money = money /2;
			}
			sw = sw*(-1);
		}
		
	}

}
