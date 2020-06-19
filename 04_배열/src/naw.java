import java.util.Scanner;

public class naw {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num,sutNum,i,sum=0,t,j,max,min;
		int[] snum = null;
		boolean flag =false;
		t=sc.nextInt();

		
		while(true) {
			System.out.println("-------------------------------------");		
			System.out.println("1.학생수|2.점수입력|3.점수목록|4.분석|5.종료|");		
			System.out.println("-------------------------------------");		
			System.out.print("번호를 입력>> ");
			num= sc.nextInt();
			switch (num) {
			case 1:System.out.println("1"); break;
			case 2:System.out.println("2"); break;
			case 3:System.out.println("3"); break;
			case 4:
				System.out.println("4"); break;
	
			case 5:
			System.out.println("나감");
			flag = true;
				break;

			default:

			}	
            if (flag == true) {
                System.out.println("프로그램이 종료되었습니다.");
                break;
            }
		}
	}
}
