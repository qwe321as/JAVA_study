import java.util.ArrayList;
import java.util.Scanner;

class Students{
	private String name;
	private int kor;
	private int eng;
	@Override
	public String toString() {
		return "Students [name=" + name + ", kor=" + kor + ", eng=" + eng + "]";
	}
	public Students(String name, int kor, int eng) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
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

}
public class hello {
	public static void main(String[] args) {
		String name, qn;
		int kor, eng;
		ArrayList<Students> list = new ArrayList<Students>();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("이름");
			name = sc.next();
			System.out.println("국어");
			kor = sc.nextInt();
			System.out.println("영어");
			eng = sc.nextInt();
			Students st= new Students(name, kor, eng);
			list.add(st);
			System.out.println("계속? ");
			qn= sc.next();
			if (qn.equals("n")) 
				break;
		}
		System.out.println(list);
		for (int i = 0; i < list.size() ; i++) {
			System.out.println(list.get(i));}
		do {
			boolean flag= true;
			System.out.println("찾는이름");
			name = sc.next();
			for (int i = 0; i < list.size(); i++) {
				if (name.equals(list.get(i).getName())) {
					System.out.println(list.get(i).getKor());
					System.out.println(list.get(i).getEng());
					flag = false;
					break;
				}
			}
			if(flag == true) 
				System.out.println("찾는이름없음");
			System.out.println("계속?");
			qn= sc.next();
			if (qn.equals("n")) {
				break;}
		}
		while (true);
		System.out.println("종료");
	}
}

