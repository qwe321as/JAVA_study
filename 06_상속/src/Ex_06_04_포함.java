class Man{
	String name;
	int age;
	Man(){

	}
	Man(String name, int age){
		this.name=name;
		this.age=age;
	}
	void display() {
		System.out.println("이름: "+name+" 나이는 "+age);
	}
	String getName(){
		return name;
	}
}
class Worker {
	String company;
	Man m; //주소가들어옴 
	Worker() {
	}
	Worker(String name, int age, String company){
//		this.name=name;
//		this.age=age;
		m=new Man(name, age);
		this.company=company;
	}
	void display() {
		System.out.println("이름: "+m.getName());
		System.out.println("나이: "+m.age);
		System.out.println("회사: "+company);
	}
}
public class Ex_06_04_포함 {
	public static void main(String[] args) {
		Man man = new Man();
		man.display();
		Worker w = new Worker("찬열", 22, "SM");
		w.display();
	}

}
