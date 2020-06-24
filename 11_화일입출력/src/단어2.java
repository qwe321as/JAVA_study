import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Scanner;

public class 단어2 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner (System.in);
		int input;
		boolean flag = false;
		String str,line;
		BufferedReader br = null,br2;
		BufferedWriter bw = null;
		while (true) {
			System.out.print("단어입력 단어검색 종료");
			input = sc.nextInt();
			switch (input) {
			case 1:
				br= new BufferedReader(new InputStreamReader(System.in));
				str =br.readLine();
				System.out.println(str);
				bw = new BufferedWriter(new FileWriter("dan.txt", true));
				bw.write(str);
				bw.flush();
				break ;
			case 2:
				System.out.println("찾는단어");
				br= new BufferedReader(new InputStreamReader(System.in));
				str = br.readLine();
				br2 = new BufferedReader(new FileReader("dan.txt"));
				while ((line=br2.readLine())!=null) {
					flag = false;
					String[] token = line.split("/");
					if (token [0].equals(str)) {
						System.out.println("단어 "+str);
						System.out.println("뜻"+token[1]);
						flag = true;
						break;
					}
				}
				if (flag==false) {
					System.out.println("찾는단어없음");
				}
				break;
			case 3:
				if (bw!=null) {
					bw.close();
				}
				if(br!=null) {
					br.close();
				}
				System.exit(0);
				break;


			default:
				System.out.println("1-3숫자만 입력");
			}
		}
	}
}
