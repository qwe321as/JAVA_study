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
		return name +"/"+  kor +"/"+eng ;
	}
	public Student(String name, int kor, int eng) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}

}
public class �ѹ����غ��� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> list = new ArrayList<Student>() ;
		String qu, name;
		int kor,eng;
		while (true) {
			System.out.print("�̸� :");
			name = sc.next();
			System.out.print("���� :");
			kor = sc.nextInt();
			System.out.print("���� :");
			eng = sc.nextInt();
			Student stu = new Student(name, kor, eng);
			list.add(stu);
			System.out.print("��� ? (y/n)");
			qu = sc.next();
			if (qu.equals("n")) {
				System.out.println(list);
				for (int i = 0; i < list.size(); i++) {
					stu = list.get(i);
					System.out.println(stu);
					}
				break;
			}}
		do {
			boolean flag = false;
			System.out.print("ã���̸�: ");
			name = sc.next();
			for (int i = 0; i < list.size(); i++) {
				if (name.equals(list.get(i).getName())) {	
					System.out.println("���� : "+list.get(i).getKor());
					System.out.println("���� : "+list.get(i).getEng());
					flag = true;
					break;
					}
				}
			if(flag == false)
				System.out.println("ã���̸�����");
			System.out.print("��� ? ");
			qu = sc.next();
			if (qu.equals("n")) {
				break;
				
			}
		} while (true);
		System.out.println("�ý�������");
			
			
			
			
			
			
			
		
			
			
			
			
			
			
			
			
			
			
			
//		do {
//			boolean flag = false;
//			System.out.print("ã���̸� : ");
//			name = sc.next();
//			for (int i = 0; i < list.size(); i++) {
//				if (name.equals(list.get(i).getName())) {
//					System.out.println("�������� : "+list.get(i).getKor());
//					System.out.println("�������� : "+list.get(i).getEng());
//					flag =true;
//					break;
//				}}
//			if(flag==false)
//				System.out.println("ã���̸�����");
//			
//			System.out.println("���?");
//			qu=sc.next();
//			if (qu.equals("n")) {
//				break;
//			}
//		}while(true);
//		System.out.println("���α׷�����");
	}
}






//�̸�:kim
//����:33
//����:44
//���?(y/n) : y
//�̸�:park
//����:77
//����:88
//���?(y/n) : n
//[kim/33/44, park/77/88]
//
//kim/33/44
//park/77/88
//
//ã�� �̸� : park
//����:77
//����:88
//���?y
//ã�� �̸� : choi
//ã�� �̸� ����
//���?n
//���α׷��� �����մϴ�.
