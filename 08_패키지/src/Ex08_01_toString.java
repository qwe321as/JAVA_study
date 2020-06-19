class Person{
	private String name;
	private int age;
	
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return name+","+age;
	}
	public boolean equals(Object obj) {
//		System.out.println(obj.age);
		if(obj instanceof Person) {
			Person p = (Person)obj;
			return this.age == p.age;
//			System.out.println(p.age);
		}
		return false;
	}
	
}
public class Ex08_01_toString {
	public static void main(String[] args) {
		Person man = new Person("보검",30);
		Person woman = new Person("윤아",20);
		System.out.println(man.toString());//참조변수 == 참조변수.toString()
		System.out.println(woman);
		System.out.println(man.equals(woman));//나이
		System.out.println(man==woman);//주소를 비교한다.
		
		
	}

}
