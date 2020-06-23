package 예지1;

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
	public Student1(String name, int kor, int eng) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	@Override
	public String toString() {
		return "Student1 [name=" + name + ", kor=" + kor + ", eng=" + eng + "]";
	}
	}
public class ye {
	public static void main(String[] args) {
		int kor,eng;
		String name,qn;
		boolean flag= true;
		Scanner sc = new Scanner (System.in);
		ArrayList<Student1> list = new ArrayList<Student1>();
		while (true) {
			System.out.println("이름 :");
			name = sc.next();
			System.out.println("국");
			kor = sc.nextInt();
			System.out.println("영");
			eng = sc.nextInt();
			Student1 st =new Student1(name, kor, eng);
			list.add(st);
			System.out.println("계속?");
			qn = sc.next();
			if (qn.equals("n")) {
				break;
			}
		}
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		do {
			System.out.println("찾는이름 :");
			name = sc.next();
			for (int i = 0; i < list.size(); i++) {
				if (name.equals(list.get(i).getName())) {
					System.out.println(list.get(i).getKor());
					System.out.println(list.get(i).getEng());
				flag=false;
				}
			}	
			if (flag = true) {
				System.out.println("찾는이름없음");
			}
			System.out.println("계속?");
			qn = sc.next();
			if (qn.equals("n")) {
				break;
			}
		} while (true);
		System.out.println("종료");
	}

}
