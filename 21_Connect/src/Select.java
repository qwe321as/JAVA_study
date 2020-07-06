import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {

	public static void main(String[] args)  {
		PreparedStatement ps = null;
		ResultSet rs = null;
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("로딩성공");
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "jspid";
			String pw = "jsppw";
			conn = DriverManager.getConnection(url,user,pw);
			System.out.println("접속 성공");
			String sql = "select * from simple";
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				int num = rs.getInt("num");
				String name = rs.getString("name");
				String addr = rs.getString("addr");
				System.out.println(num+":"+name+","+addr);
			}
			System.out.println("접속 끊기");
		}
		catch (SQLException e) {
			System.out.println("접속 실패");
		}
		catch (ClassNotFoundException e) {
			System.out.println("로딩 실패");
		}
	finally {
			try {
				if (rs != null)
					rs.close();
				if (ps != null)
					ps.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
			}
		}

	}

}
