import java.util.Scanner;

public class Ex03_01_ifelse {

	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.print("���� a ");
		a =sc.nextInt();
		System.out.print("���� b ");
		b =sc.nextInt();
		System.out.println(a+","+b);
		if (a>b) 
			System.out.println("a�� b���� ũ��");	
		else if (b>a)
			System.out.println("b�� a���� ũ��");
		else 
			System.out.println("a�� b�� ����");
		System.out.println("if else �����ϴ���");
	}
	
	
	
 	
}
