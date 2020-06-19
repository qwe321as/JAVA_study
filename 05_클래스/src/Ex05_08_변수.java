class Var{
	static int a;//static 변수 모든지역에 걸쳐
	int b; //instance 변수 객체에 걸쳐
	
	void increment() {
		int c = 0;//지역변수
		a++; b++; c++;
		System.out.println("static 변수 : "+a);
		System.out.println("instance 변수 : "+b);
		System.out.println("지역 변수 : "+c);
		System.out.println();
	}
}
public class Ex05_08_변수 {
	public static void main(String[] args) {
		System.out.println("객체 1 생성");
		Var v1=new Var();
		v1.increment();
		v1.increment();
		
		System.out.println("객체 2 생성");
		Var v2=new Var();
		v2.increment();
		v2.increment();
		
		System.out.println("객체 3 생성");
		Var v3=new Var();
		v3.increment();
		v3.increment();
	}
}
