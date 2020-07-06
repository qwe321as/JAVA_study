package 예지;

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
		return  name + "/" + kor + "/" + eng ;
	}
	public Student(String name, int kor, int eng) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	
}
public class ha {
	public static void main(String[] args) {
String name, qn;
int kor,eng;
Scanner sc = new Scanner (System.in);
ArrayList<Student> list = new ArrayList<Student>();
while (true) {
	System.out.print("이름 :");
	name= sc.next();
	System.out.print("국어 :");
	kor=sc.nextInt();
	System.out.print("영어 :");
	eng=sc.nextInt();
	System.out.print("계속 :");
	qn=sc.next();
	Student st = new Student(name, kor, eng);
	list.add(st);
	if (qn.equals("n")) {
		System.out.println(list);
		for (int i = 0; i < list.size() ; i++) {
			System.out.println(list.get(i));
		}
		break;
	}
}
do {boolean flag = false;
	System.out.print("찾는이름 : ");
	name=sc.next();
	for (int i = 0; i < list.size(); i++) {	
		if (name.equals(list.get(i).getName())) {
			System.out.println("국어 : "+list.get(i).getKor());
			System.out.println("영어 : "+list.get(i).getEng());
			flag = true;
			break;
		}
		if (flag==false) {
			System.out.println("찾는이름 없음");
			break;
		}
	}
	System.out.println("계속?");
	qn = sc.next();
	if (qn.equals("n")) {
		break;
	}
} while (true);
System.out.println("프로그램을 종료합니다.");
	}
}
