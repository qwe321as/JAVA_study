class Person2{
	private String name;//멤버변수 (field), instance변수
	private int age;
	private double height;
	Person2(){//'생성자'>>클래스이름과 같은 메서드, 객체를 만들면 메서드 자동으로 호출, 리턴 타입 x
		System.out.println("Person () 생성자");
		name="김우빈";
		age=30;
		height=188.5;
	}	
	Person2(String name, int age, double height){//생성자 오버로딩
		System.out.println("sting int double");
		this.name =name;
		this.age =age;
		this.height =height;
	}
	void setter_name(String name) {
		this.name = name;
	}
	String getter_name() {
		return name;
	}
	int getter_age() {
		return age;
	}
	double getter_height(){
		return height;
	}
	void display() {
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
		System.out.println("키: "+height);
	}
	String show (){
		return "이름  " +name + " 나이  "+age+" 키 "+height;
	}

	
}


public class Ex05_16_생성자 {

	public static void main(String[] args) {
		
		Person2 a= new Person2();
//		a.setter_name("조정석");
		System.out.println(a.getter_name());
		System.out.println(a.getter_age());
		System.out.println(a.getter_height());
		System.out.println();

		Person2 a1= new Person2("이예지",24,160.4);		
		System.out.println(a1.getter_name());
		System.out.println(a1.getter_age());
		System.out.println(a1.getter_height());
		System.out.println("==============");
		a.display();
		a1.display();
		System.out.println(a.show());
		System.out.println(a1.show());


	}

}
