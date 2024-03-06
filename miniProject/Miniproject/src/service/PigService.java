package service;

import java.sql.Connection;
import java.util.ArrayList;

import common.PigTemplate;
import model.dao.PigDao;
import model.vo.PigMember;

public class PigService {

	public int insertPigMember(PigMember pm) {
		
		Connection conn = PigTemplate.getConnection();
		
		int result = new PigDao().insertMember(conn, pm);
		
		if(result > 0) {
			PigTemplate.commit(conn);
		} else {
			PigTemplate.rollback(conn);
		}
		
		PigTemplate.close(conn);

		return result;
	}

	public ArrayList<PigMember> selectList() {
		
		Connection conn = PigTemplate.getConnection();
		
		ArrayList<PigMember> list = new PigDao().selectList(conn);
		
		PigTemplate.close(conn);
		
		return list;
	}

	public int modifyPigMember(PigMember pm) {
		Connection conn = PigTemplate.getConnection();
		
		int result = new PigDao().modifyPigMem(conn, pm);
		
		if(result > 0) {
			PigTemplate.commit(conn);
		} else {
			PigTemplate.rollback(conn);
		}
		
		PigTemplate.close(conn);
		
		
		return result;
	}

	public int deletePigMember(String uniNum) {
		
		Connection conn = PigTemplate.getConnection();
		
		int result = new PigDao().deletePigMem(conn, uniNum);
		
		if(result > 0) {
			PigTemplate.commit(conn);
		} else {
			PigTemplate.rollback(conn);
		}
		
		PigTemplate.close(conn);
		
		
		return result;
	}

	public PigMember searchByPigMem(String uniNum) {
		
		Connection conn = PigTemplate.getConnection();
		
		PigMember pm = new PigDao().searchByUniNum(conn, uniNum);
		
		PigTemplate.close(conn);
		
		return pm;
	}

	public ArrayList<PigMember> breedselectList() {
		
		Connection conn = PigTemplate.getConnection();
		ArrayList<PigMember> list = new PigDao().breedselectList(conn);
		
		PigTemplate.close(conn);

		return list;
	}


	
	
}


