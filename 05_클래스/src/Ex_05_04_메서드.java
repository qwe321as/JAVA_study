class Calc{
	int i=11;
	static int j=7;
	int add(int a, int b) {
		System.out.println(i);
		System.out.println(j);
		prn1();
		prn2();
		int sum = a+b;
		return sum;	
	}
	int sub(int a, int b) {
		return a-b;
	}
	static int mul(int a, int b) {
//		System.out.println(i);  static 메서드에서는 static 변수만사용가능하다.
		System.out.println(j);
//		prn1();                 static 메서드에서는 static 변수만사용가능하다.
		prn2();
		return a*b;
	}
	void prn1() {
		System.out.println("---------------");
	}
	static void prn2() {
		System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆");
	}
}

public class Ex_05_04_메서드 {//실행클래스
	public static void main(String[] args) {
		
		Calc a = new Calc();
		int result =a.add(10,20);
		System.out.println("결과 :"+result);
		
		Calc b=new Calc();
		int subresult = b.sub(100, 50);
		System.out.println("결과 :"+subresult);
		//		System.out.println(b.sub(10, 7));
		//		Calc c = new Calc();
		
		int mulresult = Calc.mul(10,80);
		System.out.println("mulresult: "+mulresult);
		
		int returndiv = div(10,5);
		System.out.println("returndiv = "+returndiv);
		
		Ex_05_04_메서드 ex = new Ex_05_04_메서드();
		System.out.println("나머지 리턴값: "+ex.na(10, 5));
	}
	static int div(int a,int b){
		int divresult = a/b;
		return divresult;
	}
	int na(int a, int b) {
		int naresult = a%b;
		return naresult;
	}

}
