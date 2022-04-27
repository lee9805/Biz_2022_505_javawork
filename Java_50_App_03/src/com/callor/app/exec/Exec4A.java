package com.callor.app.exec;

public class Exec4A {

	/*
	 * 1 ~ 100까지 임의 수를 생성하고
	 * 그 수가 소수 (prime number)인지 판별하시오
	 */
	public static void main(String[] args) {
		
		int num = (int)(Math.random() *100) +1 ;
		 
		boolean pflag = true;
		for(int i=2; i < num; i++) {
			if(num % i == 0) {
				pflag = !pflag;
				break;
			}
		}
		/*
		 * 만약 num 값이 소수인경우 for() 반복문이 모두 완료되고 종료된다
		 * 그러면 pflag 는 처음 설정한 갓ㅂ이 변함이 없기 때문에 true이다
		 * 
		 * 만약 num 값이 소수가 아닌 경우 중간의 if() {} 코드가 실행되어
		 * pflag가 반전되고 (즉 false가 되고) 다음의 if 조건을 만족하지 않아
		 * else() 코드가 실행된다
		 */
		  if(pflag) {
			  System.out.println(num + "는(은) 소수이다");
		  }else {
			  System.out.println(num + "는(은) 소수가 아니다");
		  }
		}    
		
	
}
