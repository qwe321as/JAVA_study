import java.util.Scanner;

public class Ex05_입력문 {
	public static void main(String[] args) {
		int a;
		a=10;
		System.out.println("a= "+a);
		a=20;
		System.out.println("a= "+a);
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요!");
		String name = sc.next();
		System.out.print("국어점수 : ");
		int kor =sc.nextInt();
		System.out.print("영어점수 : ");
		int eng =sc.nextInt();
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		int total=kor+eng+math;
		double avg = (double)total/3;
		System.out.println("이름 :"+name);
		System.out.println("kor= "+kor);
		System.out.println("eng= "+eng);
		System.out.println("math= "+math);
		System.out.println("total= "+total);
		System.out.printf("avg= %.2f ",avg);
		}
}
