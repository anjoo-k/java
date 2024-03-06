package model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

import common.PigTemplate;
import model.vo.PigMember;

public class PigDao {
	
private Properties prop = new Properties();
	
	public PigDao() {
		try {
			prop.loadFromXML(new FileInputStream("resources/query.xml"));
			
		} catch (InvalidPropertiesFormatException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public int insertMember(Connection conn, PigMember pm) {
		
		int result = 0;
		PreparedStatement pstmt = null;
		String sql = prop.getProperty("insertMember");
		
		try {
			pstmt = conn.prepareStatement(sql);
		
			pstmt.setString(1, pm.getUniNum());
			pstmt.setString(2, pm.getBirth());
			pstmt.setString(3, pm.getGender());
			pstmt.setString(4, pm.getBreed());
			pstmt.setDouble(5, pm.getBirthWeight());
			pstmt.setString(6, pm.getFinalDate());
			pstmt.setDouble(7, pm.getFinalWeight());
			pstmt.setString(8, pm.getSelection());

			result = pstmt.executeUpdate();


		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			
			PigTemplate.close(pstmt);
		}
		
		return result;
	}

	public ArrayList<PigMember> selectList(Connection conn) {
		
		ArrayList<PigMember> list = new ArrayList<>();
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = prop.getProperty("selectList");
		
		try {
			pstmt = conn.prepareStatement(sql);
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				PigMember pm = new PigMember();
				
				pm.setpNum(rset.getInt("pNum"));
				pm.setUniNum(rset.getString("uniNum"));
				pm.setBirth(rset.getString("birth"));
				pm.setGender(rset.getString("gender"));
				pm.setBreed(rset.getString("breed"));
				pm.setBirthWeight(rset.getDouble("birthWeight"));
				pm.setFinalDate(rset.getString("finalDate"));
				pm.setFinalWeight(rset.getDouble("finalWeight"));
				pm.setSelection(rset.getString("psel"));

				list.add(pm);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			PigTemplate.close(rset);
			PigTemplate.close(pstmt);
			
		}
		
		
		return list;
	}

	public int modifyPigMem(Connection conn, PigMember pm) {
		
		int result = 0;
		PreparedStatement pstmt = null;
		
//		String sql = "UPDATE PIGMANAGE " // 띄워쓰기 조심
//				+ "SET BIRTH = ?,"
//			   	   + "GENDER = ?,"
//				    + "BREED = ?,"
//		      + "BIRTHWEIGHT = ?,"
//				+ "FINALDATE = ?,"
//			  + "FINALWEIGHT = ?,"
//				     + "PSEL = ?"
//			 + "WHERE UNINUM = ?";
		
		String sql = prop.getProperty("modifyPigMem");
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, pm.getBirth());
			pstmt.setString(2, pm.getGender());
			pstmt.setString(3, pm.getBreed());
			pstmt.setDouble(4, pm.getBirthWeight());
			pstmt.setString(5, pm.getFinalDate());
			pstmt.setDouble(6, pm.getFinalWeight());
			pstmt.setString(7, pm.getSelection());
			pstmt.setString(8, pm.getUniNum());
			
			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			PigTemplate.close(pstmt);
			
		}
		
		
		return result;
	}

	public int deletePigMem(Connection conn, String uniNum) {
		int result = 0;
		PreparedStatement pstmt = null;
		
//		String sql = "DELETE FROM PIGMANAGE "
//   			     	+ "WHERE UNINUM = ?";
		String sql = prop.getProperty("deletePigMem");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, uniNum);
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			PigTemplate.close(pstmt);
			
		}

		return result;
	}

	public PigMember searchByUniNum(Connection conn, String uniNum) {
		
		PigMember pm = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
//		String sql = "SELECT * FROM PIGMANAGE WHERE UNINUM = ?";
		String sql = prop.getProperty("searchByUniNum");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, uniNum);
			rset = pstmt.executeQuery();
			
			pm = new PigMember();
			
			while(rset.next()) {
			
			pm.setpNum(rset.getInt("pNum"));
			pm.setUniNum(rset.getString("uniNum"));
			pm.setBirth(rset.getString("birth"));
			pm.setGender(rset.getString("gender"));
			pm.setBreed(rset.getString("breed"));
			pm.setBirthWeight(rset.getDouble("birthWeight"));
			pm.setFinalDate(rset.getString("finalDate"));
			pm.setFinalWeight(rset.getDouble("finalWeight"));
			pm.setSelection(rset.getString("psel"));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			PigTemplate.close(rset);
			PigTemplate.close(pstmt);
			
		}

		return pm;
	}

	public ArrayList<PigMember> breedselectList(Connection conn) {
		
		ArrayList<PigMember> list = new ArrayList<>();
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
//		String sql = "SELECT * FROM PIGMANAGE";
		String sql = prop.getProperty("breedselectList");
		
		try {			
			pstmt = conn.prepareStatement(sql);
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				PigMember pm = new PigMember();
				
				pm.setpNum(rset.getInt("pNum"));
				pm.setUniNum(rset.getString("uniNum"));
				pm.setBirth(rset.getString("birth"));
				pm.setGender(rset.getString("gender"));
				pm.setBreed(rset.getString("breed"));
				pm.setBirthWeight(rset.getDouble("birthWeight"));
				pm.setFinalDate(rset.getString("finalDate"));
				pm.setFinalWeight(rset.getDouble("finalWeight"));
				pm.setSelection(rset.getString("psel"));
				
				list.add(pm);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			PigTemplate.close(rset);
			PigTemplate.close(pstmt);
		}

		return list;
	}

}
