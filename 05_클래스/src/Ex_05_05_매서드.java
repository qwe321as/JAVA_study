import java.util.Scanner;

class Calculator{
	int sum(int a, int b) {
//		int sum = a+b;
//		return sum; 
		return a+b;
	}
	int max (int a, int b) {
		if(a>b) 
			return a;
		else 
			return b;
	}
	int min (int a, int b) {
		if(a<b) 
			return a;
		else 
			return b;
	}
}
public class Ex_05_05_매서드 {

	public static void main(String[] args) {
		//정수 2개입력
		Scanner sc= new Scanner(System.in);
		System.out.print("정수1>>");
		int A = sc.nextInt();
		System.out.print("정수2>>");
		int B = sc.nextInt();

		Calculator a =new Calculator();

		int sresult = a.sum(A, B);
		int maxresult = a.max(A, B);
		int minesult = a.min(A, B);

		System.out.println("합 :"+sresult);
		System.out.println("큰값 :"+maxresult);
		System.out.println("작은값 :"+minesult);
	}

}
