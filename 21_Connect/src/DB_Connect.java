import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Connect {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε�����");
			String url ="jdbc:oracle:thin:@localhost:1521:orcl";
			String user="jspid";
			String pw = "jsppw";
			Connection conn =
					DriverManager.getConnection(url,user,pw);
			System.out.println("���Ӽ���");
			conn.close();
			System.out.println("���Ӳ��� ����");
		}
		catch (SQLException e) {
			System.out.println("���ӽ���");
		}
		catch (ClassNotFoundException e) {
			System.out.println("����̺� �ε� ����");
		}

	}
}
