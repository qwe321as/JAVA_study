class Car{
	String color="Pink";
	int door = 4;
	void drive() {
		System.out.println("cardrive");
	}
	void stop() {
		System.out.println("stop");
	}
}
class FireEngine extends Car{
	int door = 6;
	int wheel=10;
	void drive() {
		System.out.println("FEdrive");
	}
	void water() {
		System.out.println("water!");
	}
}
public class Ex06_07_다형성 {

	public static void main(String[] args) {
		double a = (double)1;//double 생략가능
		int b =(int)3.2;// int 생략 불가능
		Car c = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2= null;
		fe.water();
		c=(Car)fe;//(Car)생략가능 업캐스팅(자식-> 부모타입
		if (c instanceof FireEngine) {
			System.out.println("다운캐스팅가능");
		}
		else {
			System.out.println("다운캐스팅불가능");
		}
		System.out.println(c.door);
		System.out.println(c.color);
		System.out.println(fe.door);
		System.out.println(fe.wheel);
		System.out.println(fe.color);
		c.drive();
		fe.drive();
		fe2=(FireEngine)c;//(FireEngine)생략불가능 다운캐스팅(부모->자식
		fe2.water();
		fe2.drive();
		
	}

}
