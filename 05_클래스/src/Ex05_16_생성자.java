class Person2{
	private String name;//������� (field), instance����
	private int age;
	private double height;
	Person2(){//'������'>>Ŭ�����̸��� ���� �޼���, ��ü�� ����� �޼��� �ڵ����� ȣ��, ���� Ÿ�� x
		System.out.println("Person () ������");
		name="����";
		age=30;
		height=188.5;
	}	
	Person2(String name, int age, double height){//������ �����ε�
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
		System.out.println("�̸�: "+name);
		System.out.println("����: "+age);
		System.out.println("Ű: "+height);
	}
	String show (){
		return "�̸�  " +name + " ����  "+age+" Ű "+height;
	}

	
}


public class Ex05_16_������ {

	public static void main(String[] args) {
		
		Person2 a= new Person2();
//		a.setter_name("������");
		System.out.println(a.getter_name());
		System.out.println(a.getter_age());
		System.out.println(a.getter_height());
		System.out.println();

		Person2 a1= new Person2("�̿���",24,160.4);		
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
