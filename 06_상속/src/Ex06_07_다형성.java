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
public class Ex06_07_������ {

	public static void main(String[] args) {
		double a = (double)1;//double ��������
		int b =(int)3.2;// int ���� �Ұ���
		Car c = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2= null;
		fe.water();
		c=(Car)fe;//(Car)�������� ��ĳ����(�ڽ�-> �θ�Ÿ��
		if (c instanceof FireEngine) {
			System.out.println("�ٿ�ĳ���ð���");
		}
		else {
			System.out.println("�ٿ�ĳ���úҰ���");
		}
		System.out.println(c.door);
		System.out.println(c.color);
		System.out.println(fe.door);
		System.out.println(fe.wheel);
		System.out.println(fe.color);
		c.drive();
		fe.drive();
		fe2=(FireEngine)c;//(FireEngine)�����Ұ��� �ٿ�ĳ����(�θ�->�ڽ�
		fe2.water();
		fe2.drive();
		
	}

}
