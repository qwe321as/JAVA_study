import java.util.ArrayList;
import java.util.Scanner;

class Student{
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
		return name + " / " + kor + " / " + eng ;
	}
	public Student(String name, int kor, int eng) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}

}
public class hihi {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		Scanner sc= new Scanner(System.in);
		String name, qu;
		int kor,eng;
		while(true) {
			System.out.print("이름 : ");
			name = sc.next();
			System.out.println("국어 : ");
			kor = sc.nextInt();
			System.out.println("영어 : ");
			eng = sc.nextInt();
			Student st = new Student(name, kor, eng);
			list.add(st);
			System.out.print("계속?");
			qu= sc.next();
			if (qu.equals("n")) {
				System.out.println(list);
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}			
				break;
			}}
			do {
				boolean flag = true;
				System.out.print("찾는이름: ");
				name = sc.next();
				for (int i = 0; i < list.size(); i++) {
					if (name.equals(list.get(i).getName())) {
						System.out.println("국어 : "+list.get(i).getKor());
						System.out.println("영어 : "+list.get(i).getEng());
						flag = false;
						break;
					}
				}
				if (flag==true) {
					System.out.println("찾는이름이없습니다.");
				}
				System.out.print("계속? ");

				qu = sc.next();
				if (qu.equals("n")) {
					break;
				}
			} while (true);
			System.out.println("종료합니다.");
		}


	}



