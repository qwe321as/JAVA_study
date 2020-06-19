class Person{
	String name;//멤버변수 (field), instance변수
	int age;
	double height;
	static String nation;//static 변수
}
public class Ex_05_01_클래스 {
	public static void main(String[] args) {
		int a =1;
		double b=2.3;
		String name ="배고팡";//man의 name이랑 달라 공간이달라서
		a=3;
		a=7;
		Person man= new Person();//내가만든  class 자료형 객체생성
//		man,woman = 참조변수 
//		참조변수.멤버변수
		man.name="김우빈";
		man.age=30;
		man.height=188.7;
		Person.nation="한국";

		System.out.println(man.name);
		System.out.println(man.age);
		System.out.println(man.height);
		System.out.println(Person.nation);
		
		Person woman = new Person(); //객체 (인스턴스)생성
		woman.name="예지";
		woman.age=24;
		woman.height=160.3;
 		System.out.println(woman.name);
		System.out.println(woman.age);
		System.out.println(woman.height);
		System.out.println(Person.nation);
	}
}
