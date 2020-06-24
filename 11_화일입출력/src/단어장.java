import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Scanner;

public class 단어장 {
	
public static void main(String[] args) throws Exception {
	Scanner sc = new Scanner(System.in);
	int input;
	String str,line;
	BufferedReader br2=null;
	BufferedReader br = null;
	BufferedWriter bw = null;
	boolean flag = false;
	while (true) {
System.out.print("1.단어입력 2.단어 검색 3. 종료>>");
input = sc.nextInt();
switch (input) {
case 1: //버퍼드리더는 공백까지 읽어들이는 것
	System.out.print("단어/뜻 입력>>");
	br = new BufferedReader(new InputStreamReader(System.in));
	str = br.readLine();
	System.out.println(str);
	bw = new BufferedWriter(new FileWriter("c:\\sun\\voca.txt",true));
	bw.write(str);
	bw.newLine();
//	bw.close();
	bw.flush();
	break;
case 2:
	System.out.println("검색할 단어 입력 >>");
	br = new BufferedReader(new InputStreamReader(System.in));
	str = br.readLine();
	br2 = new BufferedReader(new FileReader("c:\\sun\\voca.txt"));
	while ((line=br2.readLine())!=null){
		flag = false;
//		System.out.println(line);
		String[] token = line.split("/"); //token[0]:apple token[1]:사과
		if (token[0].equals(str)) {
			System.out.println("단어>"+str);
			System.out.println("뜻>"+token[1]);
			flag = true;
			break;
		}
		
	}
	if (flag==false) 
		System.out.println("찾는 단어 없음");
		break;
case 3:
	System.out.println("프로그램 종료");
	if(br!=null) //초기값이랑 다르면 성공적으로 연결다리 형성된것이다.
	br.close();
	if(bw!=null)
	bw.close();
	System.exit(0);

default:
	throw new IllegalArgumentException("Unexpected value: " + input);
}
	}
}
}
