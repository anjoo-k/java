package com.kh.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.kh.common.JDBCTemplate;
import com.kh.model.vo.Member;


// DAO(Data Access Object) : db에 직접적으로 접근, 사용자의 요청에 맞는 sql문 실행 후 결과반환(JDBC)

public class MemberDao {
	/**
	 * 사용자가 입력한 정보들을 db에 추가시켜주는 메소드
	 * @param m : 사용자가 입력한 값들이 담겨있는 Member 객체
	 * @return : insert문 실행 후 처리된 행 수
	 */	
	public int insertMember(Connection conn, Member m) {
		// insert문  => 처리된 행 수(int) => 트랜잭션 처리
		
		//필요한 변수 먼저 세팅
		 // 처리된 결과(처리된 행 수)를 받아줄 변수
		// 연결된 데이터베이스 정보 담는 객체
		 // 완성된 sql문 전달, 곧바로 실행 후 결과 받는 객체
		
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

		int result = 0;
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO MEMBER VALUES(SEQ_USERNO.NEXTVAL, ?, ?, ?, ?, ?, ?, ?, ?, ?, SYSDATE)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, m.getUserId());
			pstmt.setString(2, m.getUserPwd());
			pstmt.setString(3, m.getUserName());
			pstmt.setString(4, m.getGender());
			pstmt.setInt(5, m.getAge());
			pstmt.setString(6, m.getEmail());
			pstmt.setString(7, m.getPhone());
			pstmt.setString(8, m.getAddress());
			pstmt.setString(9, m.getHobby());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
		}
		
	return result;
		
		
	}
	
	
	public ArrayList<Member> selectList(Connection conn) {
		//select문(여러행 조회) -> ResultSet 객체 -> ArrayList<Member>에 담기
		
		ArrayList<Member> list = new ArrayList<>();
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = "SELECT * FROM MEMBER ORDER BY USERNAME";
		
		try {
			pstmt = conn.prepareStatement(sql);
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				
				Member m = new Member();
				m.setUserNo(rset.getInt("userno"));
				m.setUserId(rset.getString("userid"));
				m.setUserPwd(rset.getString("userpwd"));
				m.setUserName(rset.getString("username"));
				m.setGender(rset.getString("gender"));;
				m.setAge(rset.getInt("age"));
				m.setEmail(rset.getString("email"));
				m.setPhone(rset.getString("phone"));
				m.setAddress(rset.getString("address"));
				m.setHobby(rset.getString("hobby"));
				m.setEnrollDate(rset.getDate("enrolldate"));
				list.add(m);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
			
		}
		
		return(list);
	
	}


	public int updateMember(Connection conn, Member m) {
		// update문 -> 처리된 행의 수 (int)
		int result = 0;
		
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
		
			pstmt = conn.prepareStatement(sql); // 미완성sql
			pstmt.setString(1,  m.getUserPwd());
			pstmt.setString(2,  m.getEmail());
			pstmt.setString(3,  m.getPhone());
			pstmt.setString(4,  m.getAddress());
			pstmt.setString(5,  m.getUserId());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
			
		}
		
		
		return result;
		
	}
	
	public int deleteMember(Connection conn, String userId) {
		//delete 문 => 처리된 행 수
		int result = 0;
		
		PreparedStatement pstmt = null;
		
		String sql = "DELETE FROM MEMBER "
				+ "WHERE USERID = ?";
					  
		try {
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
		}
		
		return result;
		
	}


	public Member selectByUserId(Connection conn, String userId) {
		//select(한 행) => ResultSet 객체에 담고 => 한 행이니까 Member 객체에 담는다.
		
		Member m = null;
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = "SELECT * FROM MEMBER WHERE USERID = ?";
		
		try {
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId); // 한줄이니까 하나만 채워주면 됌
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) { // 하나니까 while문 필요 없음
				
				m = new Member();
				m.setUserNo(rset.getInt("userno"));
				m.setUserId(rset.getString("userid"));
				m.setUserPwd(rset.getString("userpwd"));
				m.setUserName(rset.getString("username"));
				m.setGender(rset.getString("gender"));;
				m.setAge(rset.getInt("age"));
				m.setEmail(rset.getString("email"));
				m.setPhone(rset.getString("phone"));
				m.setAddress(rset.getString("address"));
				m.setHobby(rset.getString("hobby"));
				m.setEnrollDate(rset.getDate("enrolldate"));
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
		}
		
		return m;
		
	}


	public ArrayList<Member> selectByUserName(Connection conn, String keyword) {
		// select(결과 여러행) => resultSet 객체에 담아서 => ArrayList 객체에 담아줌
		
		ArrayList<Member> list = new ArrayList<Member>();
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = "SELECT * FROM MEMBER WHERE USERNAME LIKE '%' || ? || '%'";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, keyword);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				Member m = new Member();

				m.setUserNo(rset.getInt("userno"));
				m.setUserId(rset.getString("userid"));
				m.setUserPwd(rset.getString("userpwd"));
				m.setUserName(rset.getString("username"));
				m.setGender(rset.getString("gender"));;
				m.setAge(rset.getInt("age"));
				m.setEmail(rset.getString("email"));
				m.setPhone(rset.getString("phone"));
				m.setAddress(rset.getString("address"));
				m.setHobby(rset.getString("hobby"));
				m.setEnrollDate(rset.getDate("enrolldate"));
				list.add(m);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		
		return list;
		
	}
	

}
