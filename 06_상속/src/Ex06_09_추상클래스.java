abstract class Shape {//�߻�Ŭ����
	Shape(){
		System.out.println("shape ��ü");
	}
	void make() {
		System.out.println("�����׸���");
	}
	abstract void draw();	//�̿ϼ��޼���
	abstract void delete();
}
class Circle extends Shape{
	Circle() {//���� �Ⱥ������� ���� ����
		super();
	}

	void draw() {
		System.out.println("���� �׸���.");
	}
//	void draw() {
//		System.out.println("���� �׸���.");
//	}
//	
	void delete() {
		System.out.println("���� �����.");
	}
}
class Triangle extends Shape{
	void draw() {
		System.out.println("�ﰢ���� �׸���.");
	}
	void delete() {
		System.out.println("�ﰢ���� �����.");
	}
	
}
public class Ex06_09_�߻�Ŭ���� {

	public static void main(String[] args) {
		
//		Shape s= new Shape(); <- �߻�Ŭ������ ��ü ���� �Ұ�
		Circle c = new Circle();
		c.make();
		c.draw();
		c.delete();
		Triangle t = new Triangle();
		t.make();
		t.draw();
		t.delete();
	}

}
