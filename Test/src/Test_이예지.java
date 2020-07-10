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
public class Test_이예지 {

	public static void main(String[] args) {
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> st = new ArrayList<Student>();
		while (true) {
			System.out.print("이름: ");
			String name = sc.next();
			System.out.print("국어점수: ");
			int kor = sc.nextInt();
			System.out.print("영어점수: ");
			int eng = sc.nextInt();
			Student s = new Student(name,kor,eng);
			System.out.print("계속? (y/n) : ");
			String qu = sc.next();
			st.add(s);
			System.out.println(st.toString());
			if (qu.equals("n")) {
				System.out.println("종료합니다.");
				break;			}
			System.out.println(st);
				for (int i = 0; i < st.size(); i++) {
					Student s =st.get(i);
					System.out.println(s);
			}
		}
			
			System.out.println("찾는이름 :");
			String name = sc.next();
			for (int i = 0; i < args.length; i++) {
				if (name.equals(st.get(i).getName())) {
				System.out.println("국어 :");
				System.out.println("영어 :");
			}
				else {
					System.out.println("찾는이름없음");
					flag =false;
					break;
					}
				
			System.out.println("종료합니다.");
		}

	

	}

	}


