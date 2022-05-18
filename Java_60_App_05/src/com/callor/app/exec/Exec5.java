package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.AddressVO;
import com.callor.app.service.AddrServiceV1;
import com.callor.utils.Line;

public class Exec5 {

	public static void main(String[] args) {
		
		List<AddressVO> addrs = new ArrayList<>();
		
		AddressVO aVO = new AddressVO();
		addrs.add(AddressVO.builder()
						.name("hong")
						.age(25)
						.build());
		
		addrs.add(AddressVO.builder().name("lee").age(26).build());
		
		addrs.add(AddressVO.builder().name("sung").age(24).build());

	
	for(AddressVO vo : addrs) {
		System.out.println(vo.toString());
	}
	//이름순서로 오름차순 정렬
	int size = addrs.size(); 
	for(int i =0; i < size; i++) {
		for(int j = i +1; j < size; j++) {
			if(addrs.get(i).getName().compareTo(addrs.get(j).getName()) > 0) {
				AddressVO vo = addrs.get(i);
				addrs.set(i, addrs.get(j));
				addrs.set(j, vo);
			}
		}
	}
	System.out.println(Line.dLine(100));
	for(AddressVO vo : addrs) {
		System.out.println(vo);
	}
}
}
