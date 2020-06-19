//import java.util.Scanner;

public class Ex05_10_¿Á±Õ»£√‚ {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		System.out.println("4 factorial : "+fact(4));
	}
	static int fact(int a) {
		if (a==1) 
			return 1;
		else 
			return a* fact(a-1);
	}
}
