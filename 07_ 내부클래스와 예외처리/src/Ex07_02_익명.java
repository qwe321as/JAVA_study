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
		System.out.println("부릉부릉");
	}
}
public class Ex07_02_익명 {
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
		}.show(); //익명클래스 (기존클래스재정의)
		Parent p = new Parent();
		p.display();
		System.out.println();
		new Car2(){
			void drive() {
				System.out.println("빵빵");
			}
		}.drive();

	}

}
