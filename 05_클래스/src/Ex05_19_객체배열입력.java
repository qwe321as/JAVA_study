import java.util.Scanner;

class Man{
	private String name;
	private int age;	
	Man(String name, int age) {
		this.name = name;
		this.age=age;
	}
	String print() {
		return "�̸��� " +name+", ���̴� "+age;
	}
}
public class Ex05_19_��ü�迭�Է� {

	public static void main(String[] args) {
		String name1;
		int age1;
		Scanner sc = new Scanner(System.in);
//		System.out.print("�̸�: ");
//		name1 = sc.next();
//		System.out.print("����: ");
//		age1 = sc.nextInt();
		
//		Man m1 = new Man(name1,age1);
//		System.out.println(m1.print());
		
		Man[] m2= new Man[3];
		for (int i = 0; i < m2.length; i++) {
			System.out.print("�̸�: ");
			name1 = sc.next();
			System.out.print("����: ");
			age1 = sc.nextInt();
			m2[i]=new Man(name1,age1);
		}
		System.out.println("-----------------------");
		for (int i = 0; i < m2.length; i++) {
			System.out.println(m2[i].print());
			
		}
	}

}
