import java.util.Scanner;
public class Ex07_05_divide {
	public static void main(String[] args) {
		int num1,num2;
		Scanner sc = new Scanner(System.in);
		System.out.print("수 1:" );
		num1 = sc.nextInt();
		System.out.print("수 2:" );
		num2 = sc.nextInt();
		boolean result =divide(num1,num2);
		if (result==true) 
			System.out.println("연산성공");
		else 
			System.out.println("연산실패");
	}
	static boolean divide(int num1,int num2){
		try {
			int div = num1/num2;
			System.out.println("div = "+div);
			return true;
		} catch (Exception e) {
			System.out.println(e.toString());
			return false;		
		}finally {
			System.out.println("finally");
		}
	}
}




