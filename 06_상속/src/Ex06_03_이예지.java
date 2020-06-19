class Person{
	private String name;
	private int age;
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	void display() {
		System.out.println("�̸�: "+name+" ���� :"+age);
	}
}
class Student extends Person{
	int kor,eng;
	Student(String name, int age, int kor, int eng){
		super(name,age);
		this.eng=eng;
		this.kor=kor;
	}
	void display() {
		System.out.println();
		super.display();
		System.out.println("�������� : "+kor+" ��������: "+eng);
		System.out.println();
	}
}
class Employee extends Person{
	String company, part;
	Employee(String name, int age, String company, String part){
		super(name,age);
		this.company=company;
		this.part=part;
	}
	void display() {
		super.display();
		System.out.println("ȸ�� : "+company+" �μ�: "+part);
	}
}
class Teacher extends Employee{
	//	private String name;
	//	private int age;
	//	private String company;
	//	private String part;
	private String sub;
	public Teacher(String name, int age, String company, String part, String sub) {
		super(name, age, company,part);
		this.sub=sub;  
	}
	void display() {
		System.out.println();
		super.display();
		System.out.println("���� : "+sub);
	}

}
public class Ex06_03_�̿��� {

	public static void main(String[] args) {
		Person pe= new Person("ȿ��",30);
		Student st = new Student("����", 30, 100, 88);
		Employee em = new Employee("�̽±�", 33, "īī��", "���ֺ�");
		Teacher te = new Teacher("�̿���", 24,"�˴ܰ���б�","��Ȱ������","����");
		pe.display();
		st.display();
		em.display();
		te.display();
		
	}

}
