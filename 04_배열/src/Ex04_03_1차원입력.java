import java.util.Scanner;

public class Ex04_03_1�����Է� {

	public static void main(String[] args) {
		//�����ϳ� �Է¹޾� ���
		Scanner sc = new Scanner(System.in);
		//		System.out.print("���ڸ� �Է��ϼ���!");
		//		int a = sc.nextInt();
		//		System.out.println("�Է��Ͻ� ���ڴ� "+a+"�Դϴ�.");
		int [] jum = new int[7];
		//		jum[0]= sc.nextInt();
		//		jum[1]= sc.nextInt();
		//		jum[2]= sc.nextInt();
		//		jum[3]= sc.nextInt();
		//		jum[4]= sc.nextInt();
		//		jum[5]= sc.nextInt();
		//		jum[6]= sc.nextInt();
		for(int i =0 ; i<jum.length; i++){
			System.out.print(i+"����: ");
			jum[i] =sc.nextInt();
		}
		for (int i = 0; i < jum.length; i++) {
			System.out.print(jum[i]+ " ");
		}

	}

}
