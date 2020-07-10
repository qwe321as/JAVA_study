import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Dao {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String user = "jspid";
	String pw = "jsppw";
	PreparedStatement ps = null;
	Connection con = null;
	ResultSet rs = null;
	Dao(){
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
		}

	}
	void gcon() {
		try {
			con = DriverManager.getConnection(url, user, pw);
		} catch (SQLException e) {
		}
	}
	public ArrayList<Bean> select() {
		gcon();
		String sql = "select * from yeji";
		ArrayList<Bean> list = new ArrayList<Bean>();
		try {
			ps =con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				Bean b = new Bean();
				b.setId(rs.getInt("id"));
				b.setLikenum(rs.getInt("likenum"));
				b.setName(rs.getString("name")); 
				b.setEmail(rs.getString("email"));
				b.setFcode(rs.getInt("fcode"));
				list.add(b);
			}
		} catch (SQLException e) {
		}finally {
			try {
				if (con!=null)
					con.close();
				if (rs!=null) 
					rs.close();
				if (ps!=null) 
					ps.close();
			} catch (SQLException e) {
			}
		}
		return list;
	}
	public  int delete(String name) {
		gcon();
		int cnt = -1;
		String sql = "delete from yeji where name =?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, name);
			cnt = ps.executeUpdate();
		} catch (SQLException e) {
		}finally {
			try {
				if (con!=null)
					con.close();
				if (rs!=null) 
					rs.close();
				if (ps!=null) 
					ps.close();
			} catch (SQLException e) {
			}
		}
		return cnt;
	}
	public  int update(Bean bean) {
		gcon();
		int cnt = -1;
		String sql = "update yeji set likenum =? ,name=? ,email=?,fcode=? where id = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1,bean.getLikenum());
			ps.setString(2, bean.getName());
			ps.setString(3, bean.getEmail());
			ps.setInt(4, bean.getFcode());
			ps.setInt(5, bean.getId());
			cnt = ps.executeUpdate();
		} catch (SQLException e) {
		}finally {
			try {
				if (con!=null)
					con.close();
				if (ps!=null) 
					ps.close();
			} catch (SQLException e) {
			}
		}
		return cnt;
	}
	public  int insert(Bean bean) {
		gcon();
		int cnt = -1;
		String sql = "insert into yeji values(se.nextval,?, ?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, bean.getLikenum());
			ps.setString(2,bean.getName());
			ps.setString(3, bean.getEmail());
			ps.setInt(4, bean.getFcode());
			cnt = ps.executeUpdate();
		} catch (SQLException e) {
		}finally {
			try {
				if (con!=null)
					con.close();
				if (rs!=null) 
					rs.close();
				if (ps!=null) 
					ps.close();
			} catch (SQLException e) {
			}
		}
		return cnt;
	}
	public  ArrayList<Bean> find(String col, String find) {
		gcon();
		ArrayList<Bean> list = new ArrayList<Bean>();
		String sql = "select * from yeji where "+col+" like ?";
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, "%" +find+"%");
			rs = ps.executeQuery();
			while (rs.next()) {
				Bean b = new Bean();
				b.setId(rs.getInt("id"));
				b.setLikenum(rs.getInt("likenum"));
				b.setName(rs.getString("name")); 
				b.setEmail(rs.getString("email"));
				b.setFcode(rs.getInt("fcode"));
				list.add(b);
			}
		} catch (SQLException e) {
		}
		
		return list; 
	}
	public  ArrayList<Bean> sun(String col, String asc) {
		gcon();
		ArrayList<Bean> list = new ArrayList<Bean>();
		String sql = "select * from yeji order by "+col +" "+asc;
		try {
			ps= con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				Bean b = new Bean();
				b.setId(rs.getInt("id"));
				b.setLikenum(rs.getInt("likenum"));
				b.setName(rs.getString("name")); 
				b.setEmail(rs.getString("email"));
				b.setFcode(rs.getInt("fcode"));
				list.add(b);
			}
		} catch (SQLException e) {
		}finally {
			try {
				if (con!=null)
					con.close();
				if (rs!=null) 
					rs.close();
				if (ps!=null) 
					ps.close();
			} catch (SQLException e) {
			}
		}
		return list; 
	}
	public int sunupdate(int upid, String col, String upval) {
		gcon();
		int cnt = -1;
//		System.out.println(upid+col+upval);
		String sql = "update yeji set "+col+" = '"+upval+"' where id= "+upid;
//		String sql = "update yeji set name = 'ddd' where id= 1";
		try {
			ps = con.prepareStatement(sql);
			cnt = ps.executeUpdate();
			
		} catch (SQLException e) {
		}finally {
				try {
					if(ps!=null)
						ps.close();
					if(con!=null)
					con.close();
				} catch (SQLException e) {
				}
		}
		return cnt;
		
	}
	public ArrayList<Bean> match() {
		ArrayList<Bean> lists = new ArrayList<Bean>();
		gcon();
		String sql = "select id, yeji.name as name, food.fcode as code, food.name as foodname from yeji inner join food on yeji.fcode = food.fcode";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				Bean bean = new Bean();
				bean.setId(rs.getInt("id"));
				bean.setName(rs.getString("name")); 
				bean.setFcode(rs.getInt("code"));
				bean.setFood(rs.getString("foodname"));
				lists.add(bean);
			}
		
		} catch (SQLException e) {
		}finally {
				try {
					if(ps!=null)
						ps.close();
					if(con!=null)
					con.close();
				} catch (SQLException e) {
				}
		}
		return lists;
		}

}