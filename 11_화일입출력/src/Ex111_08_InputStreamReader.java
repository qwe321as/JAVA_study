import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex111_08_InputStreamReader {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String text;
			System.out.println("파일이름 입력: ");
			String fileName = br.readLine();// c:\\sun\\x.txt
			FileWriter fw =new FileWriter(fileName);//경로파일이 만들어져있지않을때 오류가 발생힌다.
			BufferedWriter bw = new BufferedWriter(fw); //fw는 1차 스트림참조변수 -1 아닌 null로			
			System.out.println("파일에 저장한 내용을 입력하세요.");
		
		
			while ((text=br.readLine())!=null) {
				bw.write(text);//컨트롤제트
				bw.newLine();
			}
			System.out.println("입력을 마칩니다.");
			bw.close();
			br.close();
			BufferedReader br2 = new BufferedReader(new FileReader(fileName));
			//스트림형성 부터.read는 한글자 readline은 공백도 가능 여러글자
			String line;
			while((line = br2.readLine())!=null) {
				System.out.println(line);
			}
			br2.close();
		} catch (IOException e) {
			e.printStackTrace();
		}


	}
}
