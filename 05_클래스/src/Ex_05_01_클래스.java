class Person{
	String name;//������� (field), instance����
	int age;
	double height;
	static String nation;//static ����
}
public class Ex_05_01_Ŭ���� {
	public static void main(String[] args) {
		int a =1;
		double b=2.3;
		String name ="�����";//man�� name�̶� �޶� �����̴޶�
		a=3;
		a=7;
		Person man= new Person();//��������  class �ڷ��� ��ü����
//		man,woman = �������� 
//		��������.�������
		man.name="����";
		man.age=30;
		man.height=188.7;
		Person.nation="�ѱ�";

		System.out.println(man.name);
		System.out.println(man.age);
		System.out.println(man.height);
		System.out.println(Person.nation);
		
		Person woman = new Person(); //��ü (�ν��Ͻ�)����
		woman.name="����";
		woman.age=24;
		woman.height=160.3;
 		System.out.println(woman.name);
		System.out.println(woman.age);
		System.out.println(woman.height);
		System.out.println(Person.nation);
	}
}
