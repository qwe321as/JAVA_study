
class Tv{
	String color;//�⺻ null
	int channel; //�⺻ 0
	boolean power;//�⺻ false
	
}
//class Person{
//	String name;//������� (field)
//	int age;
//	double height;
//}
public class Ex05_02_Ŭ���� {

	public static void main(String[] args) {
		Tv tvv = new Tv();
		//		tvv.color ="black";
		//		tvv.channel =15;
		//		tvv.power ="on";
		System.out.println(tvv.channel);
		System.out.println(tvv.color);
		System.out.println(tvv.power);
		Tv tw = new Tv();
		tw.color ="red";
		tw.channel =16;
		tw.power =false;
		System.out.println(tw.channel);
		System.out.println(tw.color);
		System.out.println(tw.power);
		Person A = new Person();
		A.name = "����";
		A.age=30;
		A.height=188;
		System.out.println(A.age);
		System.out.println(A.height);
		System.out.println(A.name);

	}

}
