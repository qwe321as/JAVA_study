import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Ex11_10_이예지 extends Thread {
	public static void main(String[] args)  throws Exception  {
		Scanner sc = new Scanner(System.in);
		int num;
		String str, line;
		BufferedReader br2=null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		boolean flag = false;
		FileWriter fw =new FileWriter("voca.txt");//경로파일이 만들어져있지않을때 오류가 발생힌다.
		while (true) {
			System.out.print("1.단어입력  2.단어검색  3.종료 >> ");
			num = sc.nextInt();
			switch (num) {
			case 1:
				System.out.print("단어 / 뜻  입력");
				 br = new BufferedReader(new InputStreamReader(System.in));
				str = br.readLine();
				System.out.println(str);
				 bw = new BufferedWriter(new FileWriter("voca.txt"));				
				bw.write(str);
				bw.newLine();
				bw.flush();
				break;
			case 2:
				System.out.println("검색할 단어");
				 br = new BufferedReader(new InputStreamReader(System.in));
				str = br.readLine();
				 br2 = new BufferedReader(new FileReader("voca.txt"));
				while ((line=br2.readLine())!=null) {
					flag = false;
					String[] token = line.split("/");
					if (token[0].equals(str)) {
						System.out.println("단어 >"+str);
						System.out.println("뜻 >"+token[1]);
						flag = true;
						break;
					}
				}
				if (flag==false) {
					System.out.println("찾는단어없음");
				}
		break;
			case 3:
				System.out.println("프로그램종료");
				if (br!=null) {
					br.close();
				}
				if (bw!=null) {
					bw.close();
				}
				System.exit(0);
				break;
			default:
				System.out.println("1~3입력");
			}


		}
	}
}

//입력한 단어/뜻은 voca.txt에 쓰기
//1.단어입력 2.단어검색 3.종료 >> 1
//단어/뜻 입력>>apple/사과
//
//1.단어입력 2.단어검색 3.종료 >> 1
//단어/뜻 입력>>blue sky/파란 하늘
//
//1.단어입력 2.단어검색 3.종료 >> 2
//검색 단어 입력>>apple
//단어>apple
//단어의 뜻>사과
//
//1.단어입력 2.단어검색 3.종료 >> 2
//검색 단어 입력>>summer
//찾는 단어 없음
//
//1.단어입력 2.단어검색 3.종료 >> 3
//프로그램 종료합니다.
