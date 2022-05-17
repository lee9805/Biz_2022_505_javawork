package com.callor.app.exec;

import com.callor.app.model.AddressVO;
import com.callor.app.service.AddrServiceV1;

public class Exec03 {

	public static void main(String[] args) {
		
		AddressVO[] vo = new AddressVO[3];
		vo[0] = AddressVO.builder()
						.name("hong")
						.tel("010-1111-111")
						.age(25)
						.build();
//		vo[0].setName("hong");
//		vo[0].setAddr("서울시");
//		vo[0].setAge(25);
//		vo[0].setTel("001-111-111");
//		vo[0].setHaddy("축구");
//
		vo[1] = new AddressVO();
		vo[1].setName("lee");
		vo[1].setAddr("서울시");
		vo[1].setAge(26);
		vo[1].setTel("001-111-111");
		vo[1].setHaddy("축구");
		
		vo[2] = new AddressVO();
		vo[2].setName("sung");
		vo[2].setAddr("서울시");
		vo[2].setAge(24);
		vo[2].setTel("001-222-212");
		vo[2].setHaddy("음악");

		AddrServiceV1 v1 = new AddrServiceV1();
		v1.printAddrList(vo);
	}
}
