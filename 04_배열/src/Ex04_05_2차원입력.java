import java.util.Scanner;

public class Ex04_05_2차원입력 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr=new int[2][3] ;
		//		arr [0][0] = sc.nextInt();
		for (int i = 0; i <2 ; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("숫자: ");
				arr[i][j]=sc.nextInt();
			}
		}
		for (int i = 0; i <2 ; i++) {
			for (int j = 0; j < 3; j++) {
				
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		for(int[] temp:arr) {
			for(int t:temp) {
				System.out.print(t+" ");
			}
		}
	}

}
