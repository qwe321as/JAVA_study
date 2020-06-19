import java.util.Scanner;

public class Ex03_01_ifelse {

	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 a ");
		a =sc.nextInt();
		System.out.print("숫자 b ");
		b =sc.nextInt();
		System.out.println(a+","+b);
		if (a>b) 
			System.out.println("a가 b보다 크다");	
		else if (b>a)
			System.out.println("b가 a보다 크다");
		else 
			System.out.println("a와 b는 같다");
		System.out.println("if else 공부하는중");
	}
	
	
	
 	
}
