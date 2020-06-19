import java.util.Scanner;

public class Ex05_11_이예지 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a+"의"+b+"승은 :"+je(a,b));

	}
	static int je(int a1, int b1) {
		if (b1==1) {
			return a1;
		}
		else {
			return a1*je(a1, (b1-1));
		}
	}

}
