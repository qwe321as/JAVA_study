class Var{
	static int a;//static ���� ��������� ����
	int b; //instance ���� ��ü�� ����
	
	void increment() {
		int c = 0;//��������
		a++; b++; c++;
		System.out.println("static ���� : "+a);
		System.out.println("instance ���� : "+b);
		System.out.println("���� ���� : "+c);
		System.out.println();
	}
}
public class Ex05_08_���� {
	public static void main(String[] args) {
		System.out.println("��ü 1 ����");
		Var v1=new Var();
		v1.increment();
		v1.increment();
		
		System.out.println("��ü 2 ����");
		Var v2=new Var();
		v2.increment();
		v2.increment();
		
		System.out.println("��ü 3 ����");
		Var v3=new Var();
		v3.increment();
		v3.increment();
	}
}
