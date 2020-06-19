import java.util.Scanner;
import java.util.InputMismatchException;
public class Ex07_07_숫자입력 {
	public static void main(String[] args) {
		//	double d = Math.random();
		//	System.out.prntln("d "+d);
		//	(int)(0*100)+1<=(int)(x*100)+1<(int)(1*100)+1
		int answer=(int)(Math.random()*100) +1;
		int input=0;
		int count=0;
		System.out.println("answer : "+answer);
		do {
			count ++;
			System.out.print("1-100 사이의 정수값을 입력하시오 : ");
			Scanner sc = new Scanner(System.in);
			try {
				input = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("정수만 입력하세요.");
				continue;// while의 조건식으로간다.
				}
			if (answer>input) {
				System.out.println("더 큰수 입력하세요");
			}
			else if (answer<input) {
				System.out.println("더 작은수 입력하세요");
			}
			else {
				System.out.println("정답입니다.");
				System.out.println("시도한 횟수는 "+count +"번입니다.");
				break;
			}
		} while (true); 
		System.out.println("프로그램종료");
	}
}
