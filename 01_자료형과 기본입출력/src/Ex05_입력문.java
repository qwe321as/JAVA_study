import java.util.Scanner;

public class Ex05_�Է¹� {
	public static void main(String[] args) {
		int a;
		a=10;
		System.out.println("a= "+a);
		a=20;
		System.out.println("a= "+a);
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ���!");
		String name = sc.next();
		System.out.print("�������� : ");
		int kor =sc.nextInt();
		System.out.print("�������� : ");
		int eng =sc.nextInt();
		System.out.print("�������� : ");
		int math = sc.nextInt();
		int total=kor+eng+math;
		double avg = (double)total/3;
		System.out.println("�̸� :"+name);
		System.out.println("kor= "+kor);
		System.out.println("eng= "+eng);
		System.out.println("math= "+math);
		System.out.println("total= "+total);
		System.out.printf("avg= %.2f ",avg);
		}
}
