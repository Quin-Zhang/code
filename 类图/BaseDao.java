package 类图;

import 系统静态模型.Connection;
import 系统静态模型.PrepareStatement;
import 系统静态模型.String;

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
