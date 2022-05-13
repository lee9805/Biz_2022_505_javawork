package com.callor.todo.service.impl;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import com.callor.todo.model.TodoVO;

public class TodoServiceImplV2 extends TodoServiceImplV1 {

	public TodoServiceImplV2() {
		super();
		loadTodoList();
	}

	protected void loadTodoList() {

		// InputStream 을 생성하고
		FileInputStream is = null;
		// Scanner에 연결
		Scanner scan = null;
		try {
			is = new FileInputStream(saveFileName);
		} catch (Exception e) {
			System.out.println(saveFileName + "파일이 없습니다");
			return;
		}
		scan = new Scanner(is);

		// key, sdate, stime, edate, etime, content
		int T_KEY = 0;
		int T_SDATE = 1;
		int T_STIME = 2;
		int T_EDATE = 3;
		int T_ETIME = 4;
		int T_CONTENT = 5;

		while (scan.hasNext()) {

			// 파일로 부터 한 라인을 읽어서 line 변수에 담기
			String line = scan.nextLine();

			// 읽어들인 line 을 컴마(,) 기준으로 분해(splite)
			// 분해한 결과는 String 형 배열 모양이다
			String[] todo = line.split(",");
			//text 파일에 데이터를 저장하면 마지막에
			//공백의 Line 이 추가되는 경우가 있다
			//이때는 split 으로 분해한 배열의 개수가 부족하게 된다
			//이러한 상황을 방지하기 위햐여 아래 코드를 추가한다
			if (todo.length < T_CONTENT + 1)
				continue;

			String eDate = todo[T_EDATE];
			String eTime = todo[T_ETIME];

			if (eDate.equalsIgnoreCase("null"))
				eDate = null;
			if (eTime.equalsIgnoreCase("null"))
				eTime = null;

			TodoVO tVO = TodoVO.builder()
								.tKey(todo[T_KEY])
								.sdate(todo[T_SDATE])
								.stime(todo[T_STIME])
								.edate(todo[T_EDATE])
								.etime(todo[T_ETIME])
								.tContent(todo[T_CONTENT])
								.build();
			todoList.add(tVO);
		}
		try {
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}