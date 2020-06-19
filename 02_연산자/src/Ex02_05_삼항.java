
public class Ex02_05_삼항 {

	public static void main(String[] args) {
//		이항연산자 : 3+4,-,*,/
//		단항연산자 : ++ ,--,!
//		삼항연산자: 조건문 ? 참: 거짓
		
		int a= 11, b=20;
		String result;
		result = a%2==1? "홀수":"짝수";
		System.out.println("result: "+result);
		
		if(a%2==0)
		{
			System.out.println("a는 짝수입니다.");
		}
		else
		{
			System.out.println("a는 홀수입니다.");
		}
		
		switch (a%2) {
		case 0 :
			System.out.println("a는 짝수입니다.");
			break ;

		default:
			System.out.println("a는 홀수입니다.");
		}
	}

}
