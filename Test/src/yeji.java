import java.util.ArrayList;
import java.util.Scanner;

class Student1{
	private String name;
	private int kor;
	private int eng;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public String toString() {
		return  name +"/" + kor + "/" + eng ;
	}
	public Student(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}

}
public class yeji {
	public static void main(String[] args) {
		String name,qu;
		int kor,eng;
		Scanner sc=new Scanner(System.in);
		ArrayList<Student> list =new ArrayList<Student>();
		while (true) {
			System.out.print("�̸�: ");
			name = sc.next();
			System.out.print("����: ");
			kor = sc.nextInt();
			System.out.print("����: ");
			eng = sc.nextInt();
			Student st = new Student(name,kor,eng);
			list.add(st);
			System.out.print("���? ");
			qu = sc.next();
			if (qu.equals("n")) 
				break;
		}
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		do {
			System.out.println("ã�� �̸� :");
			name = sc.next();
			boolean flag = true;
				for (int i = 0; i < list.size(); i++) {
					if (name.equals(list.get(i).getName())) {
						System.out.println("���� : "+list.get(i).getKor());
						System.out.println("���� : "+list.get(i).getEng());
						flag = false;
						break;
					}}
			if(flag = false)
			{
				System.out.println("ã���̸�����");
			}

			System.out.println("���?");
			qu = sc.next();
			if (qu.equals("n")) 
				break;
		} while (true);
		System.out.println("���α׷��� �����մϴ�.");

	}
}
