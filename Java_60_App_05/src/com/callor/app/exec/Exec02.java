package com.callor.app.exec;

import com.callor.app.model.AddressVO;

public class Exec02 {

	public static void main(String[] args) {

		AddressVO[] addrs = new AddressVO[3];

		addrs[0] = new AddressVO();
		addrs[0].setName("귀여워");
		addrs[0].setAge(20);

		addrs[1] = AddressVO.builder().name("하나는").age(10).build();

		addrs[2] = AddressVO.builder().name("정말").age(19).build();
		for (AddressVO aVO : addrs) {
			System.out.println(aVO.toString());
		}
		int size = addrs.length;
		//for() 반복문이 시작되기 전에 aVO 선언하고
		//for 내부에서 반복적으로 값을 교환하는 코드를 사용할 경우 
		//type 형 변수의 생명주기 문제고 메모리 누수가 발생할수 있다
		//어차피 aVO 는 소모성 변수이므로 가장 내부에서 선언하고
		//사용후 제거되도록 코드를 작성하는것이 유리하다
		//AddressVO aVO = null;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				// 배열의 i 요소인 aVO 의 나이가 더 큰값이면
				if (addrs[i].getAge() > addrs[j].getAge()) {
					// 배열의 i번째 요소를 aVO에 임시저장
					// 배열의 i번째 요소를 대피
					AddressVO aVO = addrs[i];
					// i번째 요소위치에 j번째 요소값을 복사
					addrs[i] = addrs[j];
					// 대피해 두었던 i번째 요소 값을 j 번째에 복사
					addrs[j] = aVO; 

				}
			}
		}
	}
}