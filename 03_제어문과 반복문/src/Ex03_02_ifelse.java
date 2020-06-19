import java.util.Scanner;

public class Ex03_02_ifelse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요!");
		String name = sc.next();
		System.out.print("국어점수 : ");
		int kor =sc.nextInt();
		System.out.print("영어점수 : ");
		int eng =sc.nextInt();
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		int total=kor+eng+math;
		double avg = (double)total/3;
		System.out.println("이름 :"+name);
		System.out.println("국어= "+kor);
		System.out.println("영어= "+eng);
		System.out.println("수학= "+math);
		System.out.println("총점= "+total);
		System.out.printf("평균= %.2f ",avg);
		
		String hakjum="";
		if (avg>=90) {
			hakjum = "A학점";
		}
		else if(avg>=80) {
			hakjum= "B학점";
		}
		
		else if(avg>=70) {
			hakjum= "C학점";
		}
		
		else if(avg>=60) {
			hakjum= "D학점";
		}
		 
		else {
			hakjum= "F학점";
		}
		System.out.println("학점 :"+hakjum);
		System.out.println("==============================");
		if(kor%5==0) {
			System.out.println("국어점수가 5의배수입니다.");
		if(kor%10==0) {
				System.out.println("10의 배수입니다.");
			}
		}
		switch ((int)avg/10) {
		case 10 : 
			System.out.println("학점은 A+ 입니다.");
			break;
		case 9 :
			System.out.println("학점은 A 입니다.");
			break;
		case 8 :
			System.out.println("학점은 B 입니다.");
			break;
		case 7 :
			System.out.println("학점은 C 입니다.");
			break;
		case 6 :
			System.out.println("학점은 D 입니다.");
			break;

		default:
			System.out.println("학점은 F입니다.");}
		
		
		
		
	

}
}
