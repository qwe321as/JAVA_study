class Parent{
	int x= 2;
	void display() {
		System.out.println("P_x: "+x);
	}
}
class Child extends Parent{
	void display() {
		System.out.println("C_x: "+x*x);
	}
}
class Car2{
	void drive() {
		System.out.println("�θ��θ�");
	}
}
public class Ex07_02_�͸� {
	public static void main(String[] args) {
//		Parent p = new Parent();
//		p.dispaly();

		Child c= new Child();
		c.display();
		c.x=7;
		c.display();
		new Parent() {
			void show() {
				System.out.println(x*x*x);
			}
		}.show(); //�͸�Ŭ���� (����Ŭ����������)
		Parent p = new Parent();
		p.display();
		System.out.println();
		new Car2(){
			void drive() {
				System.out.println("����");
			}
		}.drive();

	}

}
