package com.callor.score.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

import com.callor.score.domain.StudentVO;
import com.callor.score.service.StudentService;

public class StudentServiceImplV1 implements StudentService {

	private StudentVO[] stVO;
	private String stFile;
	
	/*
	 * private StudentServiceImplV1() { }
	 */
	
	public StudentServiceImplV1(String stFile, int length) {
		this.stFile= stFile;
		this.stVO = new StudentVO[length];
		for(int i = 0; i < this.stVO.length ; i++) {
			this.stVO[i] = new StudentVO();
		}
	}
	
	
	@Override
	public void loadStudent() {
		
		InputStream is = null;
		
		try {
			is = new FileInputStream(this.stFile);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		Scanner scan = new Scanner(is);
		/*
		while(true) {
			boolean bYes = scan.hasNext();
			if(bYes == false) {
				break;
			}
			String stLine =scan.nextLine();
			System.out.println(stLine);
		}
		*/
		while(scan.hasNext() ) {
			String stLine = scan.nextLine();
			System.out.println(stLine);
			String[] stInfos = stLine.split(":");
			
			System.out.println("학번" + stInfos[0]);
			System.out.println("이름" + stInfos[1]);
			System.out.println("학년" + stInfos[2]);
			System.out.println("학과" + stInfos[3]);
			System.out.println("주소" + stInfos[4]);
			
			StudentVO vo = new StudentVO();
			vo.setStName(stInfos[0]);
			vo.setStName(stInfos[1]);
			vo.setStGrade(stInfos[2]);
			vo.setStDept(stInfos[3]);
			vo.setStAddr(stInfos[4]);
		}
		
	}

	@Override
	public StudentVO[] getStudents() {
		
		return null;
	}

	@Override
	public StudentVO findByNum(String stNum) {

		return null;
	}

}
