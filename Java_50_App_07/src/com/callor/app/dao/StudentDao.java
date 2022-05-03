package com.callor.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.callor.app.dbconfig.DBConnection;
import com.callor.app.model.StudentVO;

public class StudentDao {

	private final Connection dbConn;
	public StudentDao() {
		dbConn = DBConnection.getDBCConnection();
	}
	
	public List<StudentVO> selectAll() throws SQLException {
		String sql = " SELECT * FROM tbl_student";
		PreparedStatement pStr = null;
		
		pStr = dbConn.prepareStatement(sql);
		ResultSet rSet = pStr.executeQuery();
		
		List<StudentVO> stList = new ArrayList<>();
		
		while(rSet.next()) {
			
			 StudentVO stVO = new StudentVO( 
					 rSet.getString("st_num"),
					 rSet.getString("st_name"), 
					 rSet.getString("st_tel"),
					 rSet.getString("st_addr"), 
					 rSet.getString("st_dept"), rSet.getInt("st_grade")
			  );
			 
			StudentVO stVO1 = new StudentVO();
			stVO.setStNum( rSet.getString("st_num"));
			stVO.setStName( rSet.getString("st_name"));
			stVO.setStTel( rSet.getString("st_tel"));
			stVO.setStDept( rSet.getString("st_dept"));
			stVO.setStAddr( rSet.getString("st_addr"));
			stVO.setStGrade( rSet.getInt("st_grade"));
			
			StudentVO stVO2 = StudentVO.builder()
								.stNum( rSet.getString("st_num"))
								.stName( rSet.getString("st_name"))
								.stTel( rSet.getString("st_tel"))
								.build();
		}
	}
	
	
	
}
