
class Tv{
	String color;//±âº» null
	int channel; //±âº» 0
	boolean power;//±âº» false
	
}
//class Person{
//	String name;//¸â¹öº¯¼ö (field)
//	int age;
//	double height;
//}
public class Ex05_02_Å¬·¡½º {

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
		A.name = "±è¿ìºó";
		A.age=30;
		A.height=188;
		System.out.println(A.age);
		System.out.println(A.height);
		System.out.println(A.name);

	}

}
