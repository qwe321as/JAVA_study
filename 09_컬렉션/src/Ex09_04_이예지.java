import java.util.ArrayList;
import java.util.Scanner;

class Person{
	String id;
	String pw;
	public Person(String id, String pw) {
		this.id=id;
		this.pw=pw;

	}
	public String toString() {
		return id+" & "+pw;
	}
}
public class Ex09_04_�̿��� {
	public static void main(String[] args) {
		//		Person p1 = new Person("Kim","1234");
		//		Person p2 = new Person("lee","5678");
		//		Person p3 = new Person("han","9999");
		//		
		ArrayList<Person> list = new ArrayList<Person>();
		//		list.add(p1);
		//		list.add(p2);
		//		list.add(p3);
		//		System.out.println(list.toString());
		Person[] Pe = {new Person("Kim","1234"),new Person("lee","5678"),new Person("han","9999")}; 
		ArrayList<Person> list1 = new ArrayList<Person>();
		System.out.println(list.toString());
		for (int i = 0; i < Pe.length; i++) {
			System.out.println(Pe[i]);
			list1.add(Pe[i]);
		}
		System.out.println(list1.toString());
		System.out.println(list1.get(1));
		Person one = list.get(1);
		System.out.println("one: "+one.toString());
		String c;
		Scanner sc = new Scanner(System.in);
		while (true) {
		System.out.print("���̵� �Է��ϼ��� :");
		String id = sc.next();
		System.out.print("��й�ȣ�� �Է��ϼ��� :");
		String pw = sc.next();
		list.add(new Person(id,pw));
		System.out.print("����Ͻðڽ��ϱ�? :");
		c = sc.next();
//		if (c.equals("n")||c.equals("N")) {
//			break;}
		if(!c.equals("y"))
			break;
		}
		System.out.println(list.toString());
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
			Person imsi = list.get(i);
			System.out.println(imsi.toString());
			System.out.println(imsi.id+":"+imsi.pw);
			System.out.println(imsi.get(i).id+":"+imsi.get(i).pw);
		}
		//tostring���� �ȸ���� �ּҰ� ���
		//�������°� size
}



}
