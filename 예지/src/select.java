import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class select {
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
			String sql = "Select * from simple";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				int num = rs.getInt("num");
				String name = rs.getString("name");
				String addr = rs.getString("addr");
				System.out.println(num+name+" "+addr);
			}
		} catch (SQLException e) {
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
