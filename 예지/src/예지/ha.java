package ����;

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
	System.out.print("�̸� :");
	name= sc.next();
	System.out.print("���� :");
	kor=sc.nextInt();
	System.out.print("���� :");
	eng=sc.nextInt();
	System.out.print("��� :");
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
	System.out.print("ã���̸� : ");
	name=sc.next();
	for (int i = 0; i < list.size(); i++) {	
		if (name.equals(list.get(i).getName())) {
			System.out.println("���� : "+list.get(i).getKor());
			System.out.println("���� : "+list.get(i).getEng());
			flag = true;
			break;
		}
		if (flag==false) {
			System.out.println("ã���̸� ����");
			break;
		}
	}
	System.out.println("���?");
	qn = sc.next();
	if (qn.equals("n")) {
		break;
	}
} while (true);
System.out.println("���α׷��� �����մϴ�.");
	}
}
