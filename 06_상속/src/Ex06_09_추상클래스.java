abstract class Shape {//추상클래스
	Shape(){
		System.out.println("shape 객체");
	}
	void make() {
		System.out.println("도형그리기");
	}
	abstract void draw();	//미완성메서드
	abstract void delete();
}
class Circle extends Shape{
	Circle() {//눈에 안보이지만 있음 ㅇㅇ
		super();
	}

	void draw() {
		System.out.println("원을 그린다.");
	}
//	void draw() {
//		System.out.println("원을 그린다.");
//	}
//	
	void delete() {
		System.out.println("원을 지운다.");
	}
}
class Triangle extends Shape{
	void draw() {
		System.out.println("삼각형을 그린다.");
	}
	void delete() {
		System.out.println("삼각형을 지운다.");
	}
	
}
public class Ex06_09_추상클래스 {

	public static void main(String[] args) {
		
//		Shape s= new Shape(); <- 추상클래스는 객체 생성 불가
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
