package com.kh.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.kh.model.vo.Member;

// DAO(Data Access Object) : db에 직접적으로 접근, 사용자의 요청에 맞는 sql문 실행 후 결과반환(JDBC)

public class MemberDao {
	/**
	 * 사용자가 입력한 정보들을 db에 추가시켜주는 메소드
	 * @param m : 사용자가 입력한 값들이 담겨있는 Member 객체
	 * @return : insert문 실행 후 처리된 행 수
	 */	
	public int insertMember(Member m) {
		// insert문  => 처리된 행 수(int) => 트랜잭션 처리
		
		//필요한 변수 먼저 세팅
		int result = 0; // 처리된 결과(처리된 행 수)를 받아줄 변수
		Connection conn =  null; // 연결된 데이터베이스 정보 담는 객체
		PreparedStatement pstmt = null; // 완성된 sql문 전달, 곧바로 실행 후 결과 받는 객체
		
		// 실행할 SQL문
		// INSERT INTO MEMBER
		// VALUES(SEQ_USERNO.NEXTVAL, 'admin', '1234', '관리자', 'M', 45, 'admin@iei.or.kr'
	    //        , '1012345678', '서울', NULL, '21-07-27');
		
//		String sql = "INSERT INTO MEMBER VALUES(SEQ_USERNO.NEXTVAL," + 
//					"'" + m.getUserId()      + "'," +
//					"'" + m.getUserPwd()     + "'," + 
//					"'" + m.getUserName()    + "'," +
//					"'"+ m.getGender()       + "'," +
//					   + m.getAge()          + "'" +
//					"'" + m.getEmail()       + "'," +
//					"'" + m.getPhone()       + "'," +
//					"'" + m.getAddress()     + "'," +
//					"'" + m.getHobby()       + "'," + "SYSDATE)";

		String sql =  "INSERT INTO MEMBER VALUES(SEQ_USERNO.NEXTVAL, ?, ?, ?, ?, ?, ?, ?, ?, ?, SYSDATE)";
		

				try {
					// 1) JDBC Driver 등록
					Class.forName("oracle.jdbc.driver.OracleDriver");
					
					
					// 2) Connection 객체 생성
					conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "JDBC", "JDBC");
						
					// 3) Statement 객체 생성
					pstmt = conn.prepareStatement(sql); //아직 미완성 sql문으로 ?를 전부 채워줘야 한다.
					pstmt.setString(1, m.getUserId());
					pstmt.setString(2, m.getUserPwd());
					pstmt.setString(3, m.getUserName());
					pstmt.setString(4, m.getGender());
					pstmt.setInt(5, m.getAge());
					pstmt.setString(6, m.getEmail());
					pstmt.setString(7, m.getPhone());
					pstmt.setString(8, m.getAddress());
					pstmt.setString(9, m.getHobby());

					// 4, 5) sql문 전달하면서 실행 후 값받아우기
					
					result = pstmt.executeUpdate();
					
					// 6) 트랜잭션 처리
					if(result > 0) { // 요청한 sql문 성공
						conn.commit();
					} else {
						conn.rollback(); // 요청한 sql문 실패
					}
					
					
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					// 7) 다 쓴 jdbc 객체 반환
					try {
						pstmt.close();
						conn.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
										
				}
				
				return result;

	}
	
	
	public ArrayList<Member> selectList() {
		//select문(여러행 조회) -> ResultSet 객체 -> ArrayList<Member>에 담기
		
		ArrayList<Member> list = new ArrayList<Member>();
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null; // select문 실행 시 조회된 결과값들이 최초로 담기는 공간
		
		// 실행할 sql
		String sql = "SELECT * FROM MEMBER";
		
		try {
			// 1) JDBC Driver 등록
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2) Connection 객체 생성
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "JDBC", "JDBC");
			
			// 3) Statement 객체 생성
			stmt = conn.createStatement();
			
			// 4, 5) sql 전송 및 결과 받기
			rset = stmt.executeQuery(sql);
			
			// 6) ResultSet으로부터 데이터를 하나씩 꺼내서 담아주기
			
			while(rset.next()) {
				Member m = new Member();
				m.setUserNo(rset.getInt("userno"));
				m.setUserId(rset.getString("userid"));
				m.setUserPwd(rset.getString("userpwd"));
				m.setUserName(rset.getString("username"));
				m.setGender(rset.getString("gender"));
				m.setAge(rset.getInt("age"));
				m.setEmail(rset.getString("email"));
				m.setPhone(rset.getString("phone"));
				m.setAddress(rset.getString("address"));
				m.setHobby(rset.getString("hobby"));
				m.setEnrollDate(rset.getDate("enrolldate"));
				// 현재 참조하고 있는 행에 대한 모든 컬럼에 데이터들을 한 Memner 객체에 담기
				
				list.add(m);
			}
			
			// 반복문이 끝난 시점
			// 조회된 데이터가 없었다면 리스트는 비워져 있을 것
			// 조회된 데이터가 있다면 전부 list에 담겨있을 것
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rset.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return list;
		

		
		
	}


	public int updateMember(Member m) {
		// update문 -> 처리된 행의 수 (int)
		int result = 0;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		/*
		 * update member
		 * set userpwd = 'xx', email = 'xx', phone = 'xx', add = 'xx'
		 * where userid = 'xxx';
		 */
		String sql = "UPDATE MEMBER "
				+ "SET USERPWD = ?,"
					  + "EMAIL = ?,"
					  + "PHONE = ?,"
					  + "ADDRESS = ?"
				+ "WHERE USERID = ?";
					  
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "JDBC", "JDBC");
			
			pstmt = conn.prepareStatement(sql); // 미완성sql
			pstmt.setString(1,  m.getUserPwd());
			pstmt.setString(2,  m.getEmail());
			pstmt.setString(3,  m.getPhone());
			pstmt.setString(4,  m.getAddress());
			pstmt.setString(5,  m.getUserId());

			
			result = pstmt.executeUpdate();
			
			if(result > 0) {
				conn.commit();
			} else {
				conn.rollback();
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		
		return result;
		
	}
	
	public int deleteMember(String userId) {
		//delete 문 => 처리된 행 수
		int result = 0;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "DELETE MEMBER "
				+ "WHERE USERID = ?";
					  
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "JDBC", "JDBC");
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);
			
			result = pstmt.executeUpdate();
			
			if(result > 0) {
				conn.commit();
			} else {
				conn.rollback();
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return result;
		
	}
	

}
