class Tv{
	String color;//�⺻ null
	int channel; //�⺻ 0
	boolean power;//�⺻ false
	static String company;

	void channelup() {//����
		channel++;
	}
	void power() {//�޼�������
		power = !power;
	}
}
//class Person{
//	String name;//������� (field)
//	int age;
//	double height;
//}
public class Ex05_02_Ŭ���� {

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
		System.out.println("�١١١١١١١١١١١١١١١١١١١١١١�");
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
		System.out.println("�١١١١١١١١١١١١١١١١١١١١١١�");
		Person A = new Person();
		A.name = "����";
		A.age=30;
		A.height=188;
		System.out.println(A.age);
		System.out.println(A.height);
		System.out.println(A.name);

	}

}
