import java.util.ArrayList;
import java.util.Scanner;

class Student1{
	private  String name;
	private  int kor;
	private  int eng;
	public Student (String name,int kor,int eng){
		this.name=name;
		this.kor=kor;
		this.eng=eng;
	}
	public  String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public  int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public  int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	@Override
	public String toString() {
		return  name + kor + eng ;
	}
	
}
public class Test_�̿��� {

	public static void main(String[] args) {
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> st = new ArrayList<Student>();
		while (true) {
			System.out.print("�̸�: ");
			String name = sc.next();
			System.out.print("��������: ");
			int kor = sc.nextInt();
			System.out.print("��������: ");
			int eng = sc.nextInt();
			Student s = new Student(name,kor,eng);
			System.out.print("���? (y/n) : ");
			String qu = sc.next();
			st.add(s);
			System.out.println(st.toString());
			if (qu.equals("n")) {
				System.out.println("�����մϴ�.");
				break;			}
			System.out.println(st);
				for (int i = 0; i < st.size(); i++) {
					Student s =st.get(i);
					System.out.println(s);
			}
		}
			
			System.out.println("ã���̸� :");
			String name = sc.next();
			for (int i = 0; i < args.length; i++) {
				if (name.equals(st.get(i).getName())) {
				System.out.println("���� :");
				System.out.println("���� :");
			}
				else {
					System.out.println("ã���̸�����");
					flag =false;
					break;
					}
				
			System.out.println("�����մϴ�.");
		}

	

	}

	}


