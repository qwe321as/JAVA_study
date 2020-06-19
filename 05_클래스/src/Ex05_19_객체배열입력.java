import java.util.Scanner;

class Man{
	private String name;
	private int age;	
	Man(String name, int age) {
		this.name = name;
		this.age=age;
	}
	String print() {
		return "이름은 " +name+", 나이는 "+age;
	}
}
public class Ex05_19_객체배열입력 {

	public static void main(String[] args) {
		String name1;
		int age1;
		Scanner sc = new Scanner(System.in);
//		System.out.print("이름: ");
//		name1 = sc.next();
//		System.out.print("나이: ");
//		age1 = sc.nextInt();
		
//		Man m1 = new Man(name1,age1);
//		System.out.println(m1.print());
		
		Man[] m2= new Man[3];
		for (int i = 0; i < m2.length; i++) {
			System.out.print("이름: ");
			name1 = sc.next();
			System.out.print("나이: ");
			age1 = sc.nextInt();
			m2[i]=new Man(name1,age1);
		}
		System.out.println("-----------------------");
		for (int i = 0; i < m2.length; i++) {
			System.out.println(m2[i].print());
			
		}
	}

}
