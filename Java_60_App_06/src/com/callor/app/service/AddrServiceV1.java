package com.callor.app.service;

import java.util.List;

import com.callor.app.model.AddressVO;

public class AddrServiceV1 {

	// AddressVO type 의 매개변수 1개를 받기
	public void printAddr(AddressVO hong) {
		System.out.println(hong);

	}

	// AddressVO 배열 type 의 매개 변수 1개 받기
	// 배열의 개수만큼 AddressVO 가 전달된다
	public void printAddrList(AddressVO[] vo) {
		for (AddressVO voAddr : vo) {
			// 객체만 println() 에 전달하면
			// 내부에서 vo.toString() 을 호추라형 문자열을 받아 출력
			System.out.println(vo);
		}
		for (int i = 0; i < vo.length; i++) {
			System.out.println(vo[i].toString());
		}

	}

	public void printAddr(List<AddressVO> ListVO) {
		for (AddressVO vo : ListVO) {
			System.out.println(ListVO);
		}
	}

	public void printAddrList(List<AddressVO> ListVO) {

	}

}
