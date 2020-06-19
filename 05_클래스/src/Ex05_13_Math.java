
public class Ex05_13_Math {

	public static void main(String[] args) {
		int a= 30, b=40, c;
		c = Math.max(a, b);// 메서드 호출방법 1.클래스이름.메서드이름(static) 2.참조변수.메서드이름
		System.out.println(c);
		c = Math.min(a, b);
		System.out.println(c);
		System.out.println(Math.max(1.1,2.2));
	}

}
