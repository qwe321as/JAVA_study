import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Connect {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩성공");
			String url ="jdbc:oracle:thin:@localhost:1521:orcl";
			String user="jspid";
			String pw = "jsppw";
			Connection conn =
					DriverManager.getConnection(url,user,pw);
			System.out.println("접속성공");
			conn.close();
			System.out.println("접속끊기 성공");
		}
		catch (SQLException e) {
			System.out.println("접속실패");
		}
		catch (ClassNotFoundException e) {
			System.out.println("드라이브 로딩 실패");
		}

	}
}
