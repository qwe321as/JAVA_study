import java.util.Scanner;

public class Ex04_03_1차원입력 {

	public static void main(String[] args) {
		//정수하나 입력받아 출력
		Scanner sc = new Scanner(System.in);
		//		System.out.print("숫자를 입력하세요!");
		//		int a = sc.nextInt();
		//		System.out.println("입력하신 숫자는 "+a+"입니다.");
		int [] jum = new int[7];
		//		jum[0]= sc.nextInt();
		//		jum[1]= sc.nextInt();
		//		jum[2]= sc.nextInt();
		//		jum[3]= sc.nextInt();
		//		jum[4]= sc.nextInt();
		//		jum[5]= sc.nextInt();
		//		jum[6]= sc.nextInt();
		for(int i =0 ; i<jum.length; i++){
			System.out.print(i+"번방: ");
			jum[i] =sc.nextInt();
		}
		for (int i = 0; i < jum.length; i++) {
			System.out.print(jum[i]+ " ");
		}

	}

}
