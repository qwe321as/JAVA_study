import java.util.Scanner;
import java.util.InputMismatchException;
public class Ex07_07_�����Է� {
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
			System.out.print("1-100 ������ �������� �Է��Ͻÿ� : ");
			Scanner sc = new Scanner(System.in);
			try {
				input = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("������ �Է��ϼ���.");
				continue;// while�� ���ǽ����ΰ���.
				}
			if (answer>input) {
				System.out.println("�� ū�� �Է��ϼ���");
			}
			else if (answer<input) {
				System.out.println("�� ������ �Է��ϼ���");
			}
			else {
				System.out.println("�����Դϴ�.");
				System.out.println("�õ��� Ƚ���� "+count +"���Դϴ�.");
				break;
			}
		} while (true); 
		System.out.println("���α׷�����");
	}
}
