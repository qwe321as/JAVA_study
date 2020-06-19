interface Copymachine{
	public abstract void copy();//인터페이스 안에는 추상메서드만 可 , 객체 만들수 없음. 기본형
	int abc = 1; //자동으로 final 변수 x 상수 o
}
interface Printmachine{
	void print();
}
interface Faxmachine{
	void fax();
}
class Ex{
	
}
class Compound extends Ex implements Copymachine,Printmachine,Faxmachine{ 
	//상속받을떄 implements 사용, 한번에 다중 상속가능, 클래스 상속부터
	public void copy() {
		System.out.println("복사한다.");
	}
	public void print() {
		System.out.println("프린트한다.");
	}
	public void fax() {
		System.out.println("팩스보낸다.");
	}
}
public class Ex06_11_인터페이스 {

	public static void main(String[] args) {
		final int a=1;
		Compound c = new Compound();
		c.copy();
		c.print();
		c.fax();
		Printmachine p = new Compound(); //업캐스팅
		p.print();
		Copymachine copy = new Compound();
		copy.copy();
	}

}
