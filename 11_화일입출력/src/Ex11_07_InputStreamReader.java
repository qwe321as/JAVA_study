import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex11_07_InputStreamReader {
	public static void main(String[] args) throws IOException {
		System.out.print("������ �Է�: ");
		InputStream is = System.in; //system.in�� ǥ���Է���ġ Ű���� �ǹ�.
		InputStreamReader ir = new InputStreamReader(is); //2����Ʈ �ѱ��Է��Ҷ�
//		BufferedReader br = new BufferedReader(ir);//���������� ���� �Է� ���� ����������.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//Ű����� �Է¹޴µ� 2����Ʈ�Է¹ްڴ�!
		String str = br.readLine();
		System.out.println("str: "+str);
	}//Scanner�� ���� �Է� �Ұ���.
}
