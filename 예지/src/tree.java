import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class tree {
	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement ps = null;
		ResultSet rs =null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "jspid";
			String pw = "jsppw";

			conn = DriverManager.getConnection(url,user,pw);
			String sql = "select * from emp";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				int no = rs.getInt("empno");
				String name = rs.getString("ename");
				int sal =rs.getInt("salary");
				System.out.println(no+name+sal);
			}
		}catch (SQLException e) {
		}

		catch (ClassNotFoundException e) {
		}
		finally {
			try {
				if (conn !=null)
					conn.close();
				if (ps !=null) 
					ps.close();
				if (rs !=null) 
					rs.close();
			} catch (SQLException e) {
			}

		}
	}
}
