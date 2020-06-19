class Person{
	private String name;
	private int age;
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	void display() {
		System.out.println("이름: "+name+" 나이 :"+age);
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
		System.out.println("국어점수 : "+kor+" 영어점수: "+eng);
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
		System.out.println("회사 : "+company+" 부서: "+part);
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
		System.out.println("과목 : "+sub);
	}

}
public class Ex06_03_이예지 {

	public static void main(String[] args) {
		Person pe= new Person("효연",30);
		Student st = new Student("윤아", 30, 100, 88);
		Employee em = new Employee("이승기", 33, "카카오", "연애부");
		Teacher te = new Teacher("이예지", 24,"검단고등학교","생활지도부","도덕");
		pe.display();
		st.display();
		em.display();
		te.display();
		
	}

}
