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
public class Ex_05_05_�ż��� {

	public static void main(String[] args) {
		//���� 2���Է�
		Scanner sc= new Scanner(System.in);
		System.out.print("����1>>");
		int A = sc.nextInt();
		System.out.print("����2>>");
		int B = sc.nextInt();

		Calculator a =new Calculator();

		int sresult = a.sum(A, B);
		int maxresult = a.max(A, B);
		int minesult = a.min(A, B);

		System.out.println("�� :"+sresult);
		System.out.println("ū�� :"+maxresult);
		System.out.println("������ :"+minesult);
	}

}
