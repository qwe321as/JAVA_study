package db¿¬½À;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class Dao {

	String driver = "oracle.jdbc.dreiver.OraceleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String id = "jspid";
	String pw = "jsppw";
	PreparedStatement ps=null;
	Connection con = null;
	ResultSet rs = null;
	Dao(){
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
		}
		
	}
	void conn(){
		try {
			con=DriverManager.getConnection(url, id, pw);
		} catch (SQLException e) {
		}
	}
	public ArrayList<Bean> select() {
		ArrayList<Bean> list = new ArrayList<Bean>();
		String sql = "select * from ji";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				Bean bean = new Bean();
				int id = rs.getInt("id");
				bean.setId(id);
				bean.setName(rs.getString("name"));
				bean.setLikenum(rs.getInt("Likenum"));
				list.add(bean);
			}
		} catch (SQLException e) {
		}finally {
				try {
					if(con!=null)
					con.close();
					if(rs!=null)
						rs.close();
					if(ps!=null)
						ps.close();
				} catch (SQLException e) {
				}
		}
		
		return list;
	}
	
}
