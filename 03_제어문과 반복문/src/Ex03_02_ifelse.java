import java.util.Scanner;

public class Ex03_02_ifelse {

	public static void main(String[] args) {

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
		System.out.println("����= "+kor);
		System.out.println("����= "+eng);
		System.out.println("����= "+math);
		System.out.println("����= "+total);
		System.out.printf("���= %.2f ",avg);
		
		String hakjum="";
		if (avg>=90) {
			hakjum = "A����";
		}
		else if(avg>=80) {
			hakjum= "B����";
		}
		
		else if(avg>=70) {
			hakjum= "C����";
		}
		
		else if(avg>=60) {
			hakjum= "D����";
		}
		 
		else {
			hakjum= "F����";
		}
		System.out.println("���� :"+hakjum);
		System.out.println("==============================");
		if(kor%5==0) {
			System.out.println("���������� 5�ǹ���Դϴ�.");
		if(kor%10==0) {
				System.out.println("10�� ����Դϴ�.");
			}
		}
		switch ((int)avg/10) {
		case 10 : 
			System.out.println("������ A+ �Դϴ�.");
			break;
		case 9 :
			System.out.println("������ A �Դϴ�.");
			break;
		case 8 :
			System.out.println("������ B �Դϴ�.");
			break;
		case 7 :
			System.out.println("������ C �Դϴ�.");
			break;
		case 6 :
			System.out.println("������ D �Դϴ�.");
			break;

		default:
			System.out.println("������ F�Դϴ�.");}
		
		
		
		
	

}
}
