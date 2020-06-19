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
		return name +"/"+  kor +"/"+eng ;
	}
	public Student(String name, int kor, int eng) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}

}
public class 한번더해보자 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> list = new ArrayList<Student>() ;
		String qu, name;
		int kor,eng;
		while (true) {
			System.out.print("이름 :");
			name = sc.next();
			System.out.print("국어 :");
			kor = sc.nextInt();
			System.out.print("영어 :");
			eng = sc.nextInt();
			Student stu = new Student(name, kor, eng);
			list.add(stu);
			System.out.print("계속 ? (y/n)");
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
			System.out.print("찾는이름: ");
			name = sc.next();
			for (int i = 0; i < list.size(); i++) {
				if (name.equals(list.get(i).getName())) {	
					System.out.println("국어 : "+list.get(i).getKor());
					System.out.println("영어 : "+list.get(i).getEng());
					flag = true;
					break;
					}
				}
			if(flag == false)
				System.out.println("찾는이름없음");
			System.out.print("계속 ? ");
			qu = sc.next();
			if (qu.equals("n")) {
				break;
				
			}
		} while (true);
		System.out.println("시스템종료");
			
			
			
			
			
			
			
		
			
			
			
			
			
			
			
			
			
			
			
//		do {
//			boolean flag = false;
//			System.out.print("찾는이름 : ");
//			name = sc.next();
//			for (int i = 0; i < list.size(); i++) {
//				if (name.equals(list.get(i).getName())) {
//					System.out.println("국어점수 : "+list.get(i).getKor());
//					System.out.println("영어점수 : "+list.get(i).getEng());
//					flag =true;
//					break;
//				}}
//			if(flag==false)
//				System.out.println("찾는이름없음");
//			
//			System.out.println("계속?");
//			qu=sc.next();
//			if (qu.equals("n")) {
//				break;
//			}
//		}while(true);
//		System.out.println("프로그램종료");
	}
}






//이름:kim
//국어:33
//영어:44
//계속?(y/n) : y
//이름:park
//국어:77
//영어:88
//계속?(y/n) : n
//[kim/33/44, park/77/88]
//
//kim/33/44
//park/77/88
//
//찾는 이름 : park
//국어:77
//영어:88
//계속?y
//찾는 이름 : choi
//찾는 이름 없음
//계속?n
//프로그램을 종료합니다.
