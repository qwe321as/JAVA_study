import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductDao {
	String driver="oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String user = "jspid";
	String pw = "jsppw";
	PreparedStatement ps = null;
	ResultSet rs = null;
	Connection conn = null;
	ProductDao (){
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 발견되지 않습니다.");
			e.printStackTrace();		

		}

	}
	public void getConnection() {
		try {
			conn = DriverManager.getConnection(url,user, pw);
		} catch (SQLException e) {
			System.out.println("커넥션 생성 오류");
			e.printStackTrace();
		}
	}

	public ArrayList<ProductBean> getAllproducts() {
		getConnection();
		ProductBean bean = null;

		String sql = "select * from products order by id asc";
		ArrayList<ProductBean> lists = new ArrayList<ProductBean>();
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int stock = rs.getInt("stock");
				int price = rs.getInt("price");
				String category = rs.getString("category");
				String inputdate= String.valueOf(rs.getString("inputdate"));
				bean = new ProductBean();
				bean.setId(id);
				bean.setName(name);
				bean.setStock(stock);
				bean.setPrice(price);
				bean.setCategory(category);
				bean.setInputdate(inputdate);
				lists.add(bean);
			}
		} catch (SQLException e) {
		}
		finally {
			try {
				if(rs!=null)
					rs.close();
				if(ps!=null)
					ps.close();
				if(conn!=null)
					conn.close();
			}catch(SQLException e) {

			}
		}
		return lists ;
	}
	public ProductBean getproductfid(int fid) {
		getConnection();
		ProductBean bean = null ;
		String sql="select * from products where id =?";
		try {
			ps= conn.prepareStatement(sql);
			ps.setInt(1, fid);
			rs = ps.executeQuery();
			if (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int stock = rs.getInt("stock");
				int price = rs.getInt("price");
				String category = rs.getString("category");
				String inputdate= String.valueOf(rs.getString("inputdate"));
				bean= new ProductBean();
				bean.setId(id);
				bean.setName(name);
				bean.setStock(stock);
				bean.setPrice(price);
				bean.setCategory(category);
				bean.setInputdate(inputdate);
			}
		} catch (SQLException e) {
		}
		finally {
			try {
				if(rs!=null)
					rs.close();
				if(ps!=null)
					ps.close();
				if(conn!=null)
					conn.close();
			}catch(SQLException e) {

			}
		}
		return bean;

	}
	public ArrayList<ProductBean> getproductcate(String fcate) {		
		getConnection();
		ProductBean bean = null ;
		String sql = "select * from products where category = ?";
		ArrayList<ProductBean> lists = new ArrayList<ProductBean>();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, fcate.toUpperCase());
			rs = ps.executeQuery();
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int stock = rs.getInt("stock");
				int price = rs.getInt("price");
				String category= rs.getString("category");
				String inputdate = String.valueOf(rs.getString("inputdate"));
				bean = new ProductBean();
				bean.setId(id);
				bean.setName(name);
				bean.setCategory(category);
				bean.setPrice(price);
				bean.setStock(stock);
				bean.setInputdate(inputdate);
				lists.add(bean);
			} 
		} catch (SQLException e) {

		}
		finally {
			try {
				if(ps!=null);
				ps.close();
				if(rs!=null);
				rs.close();
				if(conn!=null);
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return lists;
	}

	public int insertData(ProductBean pb) {
		getConnection();
		int cnt = -1;
		String sql =" insert into products values (prdseq.nextval,?,?,?,?,?)";
		try{ps = conn.prepareStatement(sql);
		ps.setString(1, pb.getName());
		ps.setInt(2,pb.getStock());
		ps.setInt(3,pb.getPrice());
		ps.setString(4, pb.getCategory());
		ps.setString(5, pb.getInputdate());
		cnt = ps.executeUpdate();
		System.out.println("insertdata cnt : "+cnt);
		}catch(SQLException e) {

		}finally {
			try {
				if(ps!=null)
					ps.close();
				if(conn!=null)
					conn.close();
			}
			catch (Exception e) {
			}
		}
		return cnt;
	}
	public int updateData(ProductBean pb) {
		getConnection();
		int cnt = -1;
		String sql = "update products set name=?, stock=? , price=?, category=?, inputdate=? where id=?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, pb.getName());
			ps.setInt(2,pb.getStock());
			ps.setInt(3,pb.getPrice());
			ps.setString(4, pb.getCategory());
			ps.setString(5, pb.getInputdate());
			ps.setInt(6,pb.getId());
			cnt = ps.executeUpdate();
			System.out.println("update cnt : "+cnt);
		} catch (SQLException e) {
		}
		finally {
			try {
				if(ps!=null)
					ps.close();
				if(conn!=null)
					conn.close();
			}catch (Exception e) {
			}
		}
		return cnt;
	}
	public int deleteData(int id) {
		getConnection();
		int cnt = -1;
		String sql = "delete from products where id =?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			cnt = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(ps!=null)
					ps.close();
				if(conn!=null)
					conn.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		

		return cnt;
	}
}