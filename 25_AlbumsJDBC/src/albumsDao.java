import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class albumsDao {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String id = "jspid";
	String pw = "jsppw";
	PreparedStatement ps =null;
	ResultSet rs = null;
	Connection con = null;
	albumsBean bean = null;

	albumsDao(){
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이브접속안됌");
		}

	}
	void gcon() {
		try {
			con = DriverManager.getConnection(url, id, pw);}
		catch (SQLException e) {
			System.out.println("sql 로그인안됌");
		}
	}
	public ArrayList<albumsBean> getalbums() {
		ArrayList<albumsBean> list = new ArrayList<albumsBean>();
		gcon();
		String sql = "select * from albums order by num";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				int num = rs.getInt("num");
				String song = rs.getString("song");
				String singer = rs.getString("singer");
				String company = rs.getString("company");
				int price = rs.getInt("price");
				String pub_day = String.valueOf(rs.getDate("pub_day"));
				bean = new albumsBean();
				bean.setNum(num);
				bean.setSong(song);
				bean.setSinger(singer);
				bean.setCompany(company);
				bean.setPrice(price);
				bean.setPub_day(pub_day);
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
	public int insertalbums(albumsBean bean) {
		int cnt = -1;
		gcon();
		String sql = "insert into albums values(albumseq.nextval,?,?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, bean.getSong());
			ps.setString(2, bean.getSinger());
			ps.setString(3, bean.getCompany());
			ps.setInt(4, bean.getPrice());
			ps.setString(5, bean.getPub_day());
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
	public int deletealbums(String song) {
		int cnt =-1;
		gcon();
		String sql = "delete from albums  where song =?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, song);
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
	public int updatealbums(albumsBean bean) {
		int cnt =-1;
		gcon();
		String sql = "update albums set song=?,singer=?,company=?,price=?,pub_day=? where num =?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, bean.getSong());
			ps.setString(2, bean.getSinger());
			ps.setString(3, bean.getCompany());
			ps.setInt(4, bean.getPrice());
			ps.setString(5, bean.getPub_day());
			ps.setInt(6, bean.getNum());
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
	public ArrayList<albumsBean> pricealbums(int start, int last) {
		ArrayList<albumsBean>list = new ArrayList<albumsBean>();
		gcon();
		String sql ="select rank ,num, song, singer, company, price, pub_day " + 
				"from(select rownum as rank,   num, song, singer, company, price, pub_day " + 
				"from (select  rownum,  num, song, singer, company, price, pub_day  from albums order by price desc , singer asc )) " + 
				"where rank between "+start+" and " + last;
		try {
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while (rs.next()) {
				int num = rs.getInt("num");
				String song = rs.getString("song");
				String singer = rs.getString("singer");
				String company = rs.getString("company");
				int price = rs.getInt("price");
				String pub_day = String.valueOf(rs.getDate("pub_day"));
				bean = new albumsBean();
				bean.setNum(num);
				bean.setSong(song);
				bean.setSinger(singer);
				bean.setCompany(company);
				bean.setPrice(price);
				bean.setPub_day(pub_day);
				list.add(bean);
			}
			
		} catch (SQLException e) {
		}
		return list;
	}
	public ArrayList<albumsBean> jungalbums(String column, String adsc) {
		ArrayList<albumsBean>list = new ArrayList<albumsBean>();
		gcon();
		String sql = "select * from albums order by "+ column +" "+ adsc ;
		try {
			ps = con.prepareStatement(sql);
//				ps.setString(1,adsc);
			rs=ps.executeQuery();
			while (rs.next()) {
				int num = rs.getInt("num");
				String song = rs.getString("song");
				String singer = rs.getString("singer");
				String company = rs.getString("company");
				int price = rs.getInt("price");
				String pub_day = String.valueOf(rs.getDate("pub_day"));
				bean = new albumsBean();
				bean.setNum(num);
				bean.setSong(song);
				bean.setSinger(singer);
				bean.setCompany(company);
				bean.setPrice(price);
				bean.setPub_day(pub_day);
				list.add(bean);
			}

			//				while (rs.next()) {
			//					bean = new albumsBean();
			//					bean.setNum(rs.getInt("num"));
			//					bean.setSong(rs.getString("song"));
			//					bean.setSinger(rs.getString("singer"));
			//					bean.setCompany(rs.getString("company"));
			//					bean.setPrice(rs.getInt("price"));
			//					bean.setPub_day(String.valueOf(rs.getDate("pub_day")));
			//					list.add(bean);
			//				}
		} catch (SQLException e) {
		}finally {
			try {
				if(ps!=null)
					ps.close();
				if(con!=null)
					con.close();
				if(rs!=null)
					rs.close();
			} catch (SQLException e) {
			}
		}

		return list;
	}
	public ArrayList<albumsBean> jogunalbums(String column, String ssnum) {
		ArrayList<albumsBean>list = new ArrayList<albumsBean>();
		gcon();
		String sql = "select * from albums where "+ column +" like ?" ;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, "%"+ssnum+"%"); 
			rs = ps.executeQuery();
			while (rs.next()) {
				bean = new albumsBean();
				bean.setNum(rs.getInt("num"));
				bean.setSong(rs.getString("song"));
				bean.setSinger(rs.getString("singer"));
				bean.setCompany(rs.getString("company"));
				bean.setPrice(rs.getInt("price"));
				bean.setPub_day(String.valueOf(rs.getDate("pub_day")));
				list.add(bean);
			}
		} catch (SQLException e) {
		}finally {
			try {
				if(ps!=null)
					ps.close();
				if(con!=null)
					con.close();
				if(rs!=null)
					rs.close();
			} catch (SQLException e) {
			}
		}
		return list;
	}
}
