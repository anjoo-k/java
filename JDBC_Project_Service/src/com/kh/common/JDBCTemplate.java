package com.kh.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// 공통 템플릿(반복적인 코드를 메소드로 정의
public class JDBCTemplate {
	// 모든 메소드 static 메소드
	// 싱글톤 패턴 : 메모리 영역에 한번 올려두고 매번 재사용하는 개념
	
	// 1. Connection 객체 생성(DB) 접속 후 해당 Connection 객체 반환
	public static Connection getConnection() {
		
	
		Connection conn =  null; // 연결된 데이터베이스 정보 담는 객체
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "JDBC", "JDBC");
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		return conn;
	}
	
	// 2. commit 처리해주는 메소드(Connection 객체 전달 받아)
	public static void commit(Connection conn) {
		try {
			if(conn != null && !conn.isClosed()) {
				conn.commit();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	// 3. rollback 처리해주는 메소드(Connection 객체 전달 받아)
	public static void rollback(Connection conn) {
		try {
			if(conn != null && !conn.isClosed()) {
				conn.rollback();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	// JDBC용 객체를 전달받아 반납처리해주는 메소드
	// 4. Statement 관련 객체 전달받아 반납시켜주는 메소드
	public static void close(Statement stmt) {
		try {
			if(stmt != null && !stmt.isClosed()) {
				stmt.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	// 5. Connection 관련 객체 전달받아 반납시켜주는 메소드
	public static void close(Connection conn) { // 오버로딩ㅋㅋㅋㅋ
		try {
			if(conn != null && !conn.isClosed()) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	// 6. ResultSet 객체 전달받아 반납시켜주는 메소드
	public static void close(ResultSet rset) { // 오버로딩ㅋㅋㅋㅋ
		try {
			if(rset != null && !rset.isClosed()) {
				rset.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	

}
