package ��ͼ;

import ϵͳ��̬ģ��.Connection;
import ϵͳ��̬ģ��.PrepareStatement;
import ϵͳ��̬ģ��.String;

public class BaseDao {

	private Connection con;

	private PrepareStatement pstm;

	public Vector selectr(String sql, List<String> list) {
		return null;
	}

	public Vector<Vector<User>> selectAll(String sql, List<String> list) {
		return null;
	}

	public int insert(String sql, List<String> list) {
		return 0;
	}

	public int update(String sql, List<String> list) {
		return 0;
	}

}
