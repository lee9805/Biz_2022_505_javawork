package com.callor.app.exec;

import com.callor.app.model.AddressVO;
import com.callor.app.service.AddrServiceV1;

public class AddrEx02 {

	public static void main(String[] args) {
		
		AddressVO hong = AddressVO.builder()
									.name("홍길동")
									.tel("011-0111-1111")
									.addr("서울시")
									.age(25)
									.haddy("영화감상")
									.build();
		AddrServiceV1 addService = new AddrServiceV1();
		/*
		 * printAddr() method 는 AddressVO type 의 매개변수를 갖고 있다
		 * 특별히 return type이 없다
		 */
		addService.printAddr(hong);
		
	}
	
}
