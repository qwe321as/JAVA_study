import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex13_03_Server {
//�о�帮��
	public static void main(String[] args) {
		BufferedReader br =null;
		ServerSocket ss =null;
		String line;
		try {
			ss= new ServerSocket(9999);
		} catch (IOException e) {
			System.err.println("9999�� �����");
			System.exit(1);
		}
		Socket cs = null;
		try {
			System.out.println("Server ready..");
			cs = ss.accept();//������ Ŭ���̾�Ʈ����
		} catch (IOException e) {
			System.out.println("accept ����");
			System.exit(1);
		}
		try {
			br = new BufferedReader(new InputStreamReader(cs.getInputStream()));
		} catch (IOException e) {
		}
		try {
			line = br.readLine();
			System.out.println("Ŭ���̾�Ʈ���� �Ѿ�� ������ "+ line);
		} catch (IOException e) {
		}
		try {
			br.close();
			cs.close();
			ss.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
