package com.callor.app.exec;

public class Exec4 {

	/*
	 * 1 ~ 100까지 임의 수를 생성하고
	 * 그 수가 소수 (prime number)인지 판별하시오
	 */
	public static void main(String[] args) {
		
		int i,m=0,flag=0;  //i,m,flag의 변수에 0으로 초기화   
		int num = (int)(Math.random() *100) +1 ;//num의 변수에 랜덤 숫자 저장    
		  m = num / 2;  // num 랜덤 숫자를 2로 나누고 m의 변수에 저장    
		  if( num == 0 || num == 1 ){  //num 나누어진 값이 0 혹은 1 일 경우 
		   System.out.println(num+" 소수가 아니다"); //"소수가 아니다"라고 나온다 
		  } else{  // 그렇지 않다면
		   for( i = 2 ; i <= m ; i++){  // i의 2는 m 보다 작거나 같을경우 1씩 커지고     
		    if( num % i == 0 ){      
		     System.out.println(num+"소수가 아니다");      
		     flag = 1;      
		     break;      
		    }      
		   }      
		   if( flag == 0 )  { System.out.println(num+" 소수다"); }  
		  }//end of else  
		}    
		
	
}
