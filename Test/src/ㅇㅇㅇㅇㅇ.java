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
	@Override
	public String toString() {
		return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + "]";
	}
	public Student(String name, int kor, int eng) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
}
public class ���������� {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		ArrayList<Student> list = new ArrayList<Student>();
		int kor,eng;
		String name, qn;
		while (true) {
			System.out.println("�̸�:");
			name = sc.next();
			System.out.println("����: ");
			kor = sc.nextInt();
			System.out.println("����: ");
			eng = sc.nextInt();
			System.out.println("���?");
			qn = sc.next();
			if(qn.equals("n")) {
				break;}}
System.out.println(list);
for (int i = 0; i < args.length; i++) {
System.out.println(list.get(i));
}
do {boolean flag = true;
	System.out.println("ã���̸� : ");
	name= sc.next();
	for (int i = 0; i < args.length; i++) {
		if (name.equals(list.get(i).getName())) {
		System.out.println("���� :"+ list.get(i).getKor());
		System.out.println("���� :"+list.get(i).getEng());
		flag=false;
		}
	}
	if (flag==true) 
		System.out.println("ã�� �̸��� �����ϴ�.");
	
	System.out.println("���?");
	qn= sc.next();
	if (qn.equals("n")) {
		break;
	}
} while (true);

System.out.println("�����մϴ�.");


	}

}
