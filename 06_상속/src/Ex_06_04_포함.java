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
		System.out.println("�̸�: "+name+" ���̴� "+age);
	}
	String getName(){
		return name;
	}
}
class Worker {
	String company;
	Man m; //�ּҰ����� 
	Worker() {
	}
	Worker(String name, int age, String company){
//		this.name=name;
//		this.age=age;
		m=new Man(name, age);
		this.company=company;
	}
	void display() {
		System.out.println("�̸�: "+m.getName());
		System.out.println("����: "+m.age);
		System.out.println("ȸ��: "+company);
	}
}
public class Ex_06_04_���� {
	public static void main(String[] args) {
		Man man = new Man();
		man.display();
		Worker w = new Worker("����", 22, "SM");
		w.display();
	}

}
