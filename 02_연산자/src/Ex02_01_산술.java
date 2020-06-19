import java.util.Scanner;

public class Ex02_01_산술 {
	public static void main(String[] args) {
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자1 : ");
		num1 = sc.nextInt();
		System.out.print("숫자2 : ");
		num2 = sc.nextInt();
		double avr = (double)(num1+num2)/2; 
		System.out.println(num1+","+num2);
		System.out.println();
		System.out.println(num1+" 더하기 "+num2+" = "+(num1+num2));
		System.out.println(num1+" 뺴기 "+num2+" = "+(num1-num2));
		System.out.println(num1+" 곱하기 "+num2+" = "+num1*num2);
		System.out.println(num1+" % "+num2+" = "+num1%num2);
//		System.out.printf("%d 나누기 %d = %.2f",num1, num2 ,avr);
		System.out.printf("%d 나누기 %d = %.2f",num1, num2 ,(double)num1/num2);

	}

}