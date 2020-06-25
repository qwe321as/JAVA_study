import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;


public class Ex13_03_Client {
	//내보내는
	public static void main(String[] args) throws IOException {
		Socket cs = null;
		//new Socket("172.30.1.36")
		try {
			cs = new Socket("172.30.1.20",9090);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print ("client 문자입력 :");
		String input = br.readLine();
		System.out.println("input: "+input);
		PrintWriter pw = new PrintWriter(cs.getOutputStream());
		pw.write(input);
		pw.close();
		br.close();
		cs.close();
	}
}
