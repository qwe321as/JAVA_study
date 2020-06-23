import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Ex11_10_이예지 extends Thread {
	public static void main(String[] args)  throws Exception  {
		Scanner sc = new Scanner(System.in);
		int num;
		String dan,kdan ,fdan;

		FileWriter fw =new FileWriter("voca.txt");//경로파일이 만들어져있지않을때 오류가 발생힌다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(fw); //fw는 1차 스트림참조변수 -1 아닌 null로					while(true) {
		while (true) {
			System.out.print("1.단어입력  2.단어검색  3.종료 >> ");
			num = sc.nextInt();
			switch (num) {
			case 1:{
				System.out.print("단어 / 뜻  입력");
				while ((fdan=br.readLine())!=null) {
					bw.write(fdan);//컨트롤제트
					bw.newLine();
				}
				System.out.println("입력을 마칩니다.");
				bw.close();
				br.close();
				break;
				}
			case 2:

				break;
			case 3:

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
