import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex11_07_InputStreamReader {
	public static void main(String[] args) throws IOException {
		System.out.print("데이터 입력: ");
		InputStream is = System.in; //system.in은 표준입력장치 키보드 의미.
		InputStreamReader ir = new InputStreamReader(is); //2바이트 한글입력할라구
//		BufferedReader br = new BufferedReader(ir);//공백포함한 문자 입력 가능 엔터전까지.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//키보드로 입력받는데 2바이트입력받겠다!
		String str = br.readLine();
		System.out.println("str: "+str);
	}//Scanner는 공백 입력 불가능.
}
