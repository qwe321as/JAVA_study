class Person1{
	private String name;//������� (field), instance����
	private int age;
	private double height;
//	 Person1(){} default ������ �ڵ�����
	void setter_name(String name) {
		this.name = name;
	}
	void setter_age(int age) {
		this.age = age;
	}
	void setter_height(double height) {
		this.height = height;
	}
	String getter_name() {
		return name;
	}
	int getter_age() {
		return age;
	}
	double getter_height() {
//		double height = 185.4;�������� �켱���� ����
		return height;
	}
}
public class Ex05_15_setter_getter {
	public static void main(String[] args) {
		Person1 as = new Person1();
		as.setter_name("����");
		String a = as.getter_name();
		System.out.println(a);
		System.out.println(as.getter_name());
		as.setter_age(30);
		System.out.println(as.getter_age());
		as.setter_height(188.5);
		System.out.println(as.getter_height());
	}
}
