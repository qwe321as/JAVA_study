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
			System.out.println("1.�л���|2.�����Է�|3.�������|4.�м�|5.����|");		
			System.out.println("-------------------------------------");		
			System.out.print("��ȣ�� �Է�>> ");
			num= sc.nextInt();
			switch (num) {
			case 1:System.out.println("1"); break;
			case 2:System.out.println("2"); break;
			case 3:System.out.println("3"); break;
			case 4:
				System.out.println("4"); break;
	
			case 5:
			System.out.println("����");
			flag = true;
				break;

			default:

			}	
            if (flag == true) {
                System.out.println("���α׷��� ����Ǿ����ϴ�.");
                break;
            }
		}
	}
}
