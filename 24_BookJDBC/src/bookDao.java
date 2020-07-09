import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class bookDao {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String id = "jspid";
	String pw = "jsppw";
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	bookDao(){
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			System.out.println("클래스없음");
		}
	}
	 void getcon() {
		try {
			con = DriverManager.getConnection(url, id, pw);}
		catch (SQLException e) {
			System.out.println("커넥션");
		}

	}
	//1
	public ArrayList<bookBean> getbook() {
		getcon();
		String sql = "select * from book order by no";
		bookBean bean = null;
		ArrayList<bookBean> list = new ArrayList<bookBean>();
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				int no = rs.getInt("no");
				String title = rs.getString("title");
				String author = rs.getString("author");
				String publisher = rs.getString("publisher");
				int price = rs.getInt("price");
				bean = new bookBean();
				bean.setNo(no);
				bean.setTitle(title);
				bean.setAuthor(author);
				bean.setPublisher(publisher);
				bean.setPrice(price);
				bean.setPu_day(String.valueOf(rs.getDate("pu_day")));
				list.add(bean);
			}
		}catch (SQLException e) {
		}finally {
				try {
					if (ps!=null)
					ps.close();
					if (rs!=null)
						rs.close();
					if (con!=null)
						con.close();
				} catch (SQLException e) {
				}
			
		}
		return list;
	}
	public int insertbook(bookBean bean) {
		getcon();
		int cnt = -1;
		String sql = "insert  into book values (bseq.nextval,?,?,?,?,to_date(?,'yyyy.mm.dd'))";
		try {
			ps =con.prepareStatement(sql);
			ps.setString(1,bean.getTitle());
			ps.setString(2, bean.getAuthor());
			ps.setString(3, bean.getPublisher());
			ps.setInt(4, bean.getPrice());
			ps.setString(5, bean.getPu_day());
			cnt = ps.executeUpdate();
			System.out.println(cnt);
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
	public int deleteData(String title) {
		getcon();
		int cnt = -1;
		String sql = "delete from book where title=?";
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, title);
			cnt = ps.executeUpdate();
		} catch (SQLException e) {
		}
		finally{
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
	public int updatebook(bookBean bean) {
		int cnt =-1;
		getcon();
		String sql = "update book set title =?, author =?, publisher=? ,price=? ,pu_day=? where no = ?";
		try {
			con.setAutoCommit(false);//자동커밋 안함
			ps = con.prepareStatement(sql);
			ps.setString(1, bean.getTitle());
			ps.setString(2, bean.getAuthor());
			ps.setString(3, bean.getPublisher());
			ps.setInt(4, bean.getPrice());
			ps.setString(5, bean.getPu_day());					
			ps.setInt(6, bean.getNo());
			cnt = ps.executeUpdate();
			con.commit();
		} catch (SQLException e) {
			try {
				con.rollback();
			} catch (SQLException e1) {
			}
		}finally {
				try {
					if(ps!=null)
					ps.close();
					if(con!=null)
						con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		return cnt;
	}
	public ArrayList<bookBean> searchbook(String column, String search_word) {
		getcon();
		ArrayList<bookBean> list = new ArrayList<bookBean>();
		//String sql = "select * from book where " +  column + " like ? order by no";
//		String sql = "select * from book where " +  column + " like '%"+search_word+"%' order by no";
		String sql = "select * from book where " + column + " like '%' || ? || '%' order by no"; // 3
		try {
			ps = con.prepareStatement(sql);
//			ps.setString(1, "%"+search_word+"%"); // where like %정% 
			ps.setString(1, search_word); // 3
			
			rs = ps.executeQuery();
			while(rs.next()) {
				
				bookBean bean = new bookBean();
				bean.setNo(rs.getInt("no"));
				bean.setTitle(rs.getString("title"));
				bean.setAuthor(rs.getString("author"));
				bean.setPublisher(rs.getString("publisher"));
				bean.setPrice(rs.getInt("price"));
				bean.setPu_day(String.valueOf(rs.getDate("pu_day")));  

				list.add(bean);
				
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

		return list;
	}

}
