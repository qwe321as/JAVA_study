import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class hello {
	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");	

		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String user = "jspid";
		String pw ="jsppw";
		Connection con = DriverManager.getConnection(url,user,pw);
		String sql = "select * from emp";
		String sql1 = "insert  into emp values(3656,'¿¹Áö',20,5000)";
		String sql2 = "delete from emp where empno = 8003";
		PreparedStatement ps = con.prepareStatement(sql);
		PreparedStatement ps1 = con.prepareStatement(sql1);
		PreparedStatement ps2 = con.prepareStatement(sql2);
		int cnt=ps1.executeUpdate();
		ps2.executeUpdate();
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			String ename = rs.getString("ename");
			int empno = rs.getInt("empno");
			System.out.println(ename+empno);
		}
		ps.close();
		con.close();
		ps1.close();
		rs.close();
	}
}
