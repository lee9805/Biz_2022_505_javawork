package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.AddressVO;
import com.callor.app.service.AddrServiceV1;

public class Exec04 {

	public static void main(String[] args) {
		
		/*
		 * List : interface,  데이터 그룹을 저장하기 위한 type
		 * 			Collections type 
		 * 다수의 데이터를 저장하고 연산에 사용하기 위한 데이터 type
		 * List를 선언할때는 Generic type을 지정한다
		 * 		List 에 add 하는 데이터를 제한하여
		 *		잘못도니 데이터가 add 되는것을 방지하기 위함
		 *		2. 메모리 낭비를 막고 성능상 잇점이 있기 때문에
		 *아래 선언된 List 는 Generic type 이 AddressVO이다
		 *여기 List에 데이터를 추가하려면 먼저 AddressVO type의 
		 *		vo 객체를 만들고, 데이터를 저장한 다음 add 한다
		 */
		List<AddressVO> ListVO = new ArrayList<>();
		
		AddressVO adVO = new AddressVO();
		
		/*
		 * VO 데이터를 List 에 add 하기 위해서는
		 * 항상 새로운 VO를 생성하고 데이터를 setting 하고 add해야 한다
		 */
		adVO.setName("hong");
		adVO.setAge(21);
		adVO.setAddr("서울시");
		adVO.setTel("010-111-1111");
		ListVO.add(adVO);
		
		adVO = new AddressVO();
		adVO.setName("lee");
		adVO.setAge(52);
		adVO.setAddr("광주시");
		adVO.setTel("010-444-444");
		ListVO.add(adVO);

		adVO = new AddressVO();
		adVO.setName("sung");
		adVO.setAge(24);
		adVO.setAddr("광주시");
		adVO.setTel("010-4441-4441");
		ListVO.add(adVO);
		
	
		AddrServiceV1 v1 = new AddrServiceV1();
		v1.printAddr(ListVO);
	}
}
