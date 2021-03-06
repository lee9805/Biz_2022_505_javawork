package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.AddressVO;
import com.callor.app.service.AddrServiceV1;
import com.callor.utils.Line;

public class Exec03 {

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
	int size = addrs.size();
	for(int i =0 ; i <size ; i++) {
		for(int j = i +1 ; j <size ;j++ ) {
			if(addrs.get(i).getAge() > addrs.get(j).getAge()) {
				AddressVO _tVO = addrs.get(i);
				addrs.set(i, addrs.get(j));
				addrs.set(j, _tVO);
			}
		}
	}
	System.out.println(Line.dLine(100));
	for(AddressVO vo : addrs) {
		System.out.println(vo);
	}
}
}
