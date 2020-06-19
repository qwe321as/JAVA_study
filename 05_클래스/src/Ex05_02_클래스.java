class Tv{
	String color;//기본 null
	int channel; //기본 0
	boolean power;//기본 false
	static String company;

	void channelup() {//정의
		channel++;
	}
	void power() {//메서드정의
		power = !power;
	}
}
//class Person{
//	String name;//멤버변수 (field)
//	int age;
//	double height;
//}
public class Ex05_02_클래스 {

	public static void main(String[] args) {
		Tv.company = "LG";
		Tv tvv = new Tv();
		tvv.color ="black";
		tvv.channel =15;
		tvv.power =true;
		System.out.println(tvv.channel);
		System.out.println(tvv.color);
		System.out.println(tvv.power);
		System.out.println(Tv.company);
		tvv.channelup();
		tvv.power();
		System.out.println(tvv.power);
		System.out.println(tvv.channel);
		System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
		Tv tw = new Tv(); 
		tw.color ="red";
		tw.channel =4;
		tw.power =false;
		System.out.println(tw.channel);
		System.out.println(tw.color);
		System.out.println(tw.power);
		System.out.println(Tv.company);
		tw.channelup();
		System.out.println(tw.channel);
		System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
		Person A = new Person();
		A.name = "김우빈";
		A.age=30;
		A.height=188;
		System.out.println(A.age);
		System.out.println(A.height);
		System.out.println(A.name);

	}

}
