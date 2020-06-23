package 예지;

import java.util.ArrayList;
import java.util.Scanner;

class Card1{
	private String name;
	private String num;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return   name + "/" + num ;
		
	}
	public Card1(String name, String num) {
		super();
		this.name = name;
		this.num = num;
	}
	}
	
public class 명함 {
public static void main(String[] args) {
	String name,num;
	int nb;
	boolean a=true;
	Scanner sc = new Scanner(System.in);
	ArrayList<Card1> list = new ArrayList<Card1>();
	while(true) {
		System.out.println("1.추가 2.삭제 3.수정 4.보기5.종료");
		nb= sc.nextInt();
		switch (nb) {
		case 1:
			System.out.println("이름을 입력하세요");
			name = sc.next();
			System.out.println("전화번호 입력하세요");
			num = sc.next();
			Card1 ca = new Card1(name, num);
			list.add(ca);
			break;
		case 2:
			System.out.println("이름을 입력하세요");
			name = sc.next();
			for (int i = 0; i < list.size(); i++) {
				if (name.equals(list.get(i).getName())) {
					list.remove(i);
					System.out.println("삭제됨");
					a = false;
					break;
				}}
			if(a=true)
				 {
					System.out.println("존재하지않는 이름입니다.");
				}
			
			break;
		case 3:
			System.out.println("이름을 입력하세요");
			name =sc.next();
			for (int i = 0; i < list.size(); i++) {
				if (name.equals(list.get(i).getName())) {
				System.out.println("수정하실 전화번호는 ");
				num = sc.next();
				list.set(list.indexOf(list.get(i)), new Card1(name,num));
				a=false;
				}
				}
			if (a==true) {
				System.out.println("존재하지않는 이름입니다.");
			}
			break;
		case 4:
			System.out.println(list);
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).getName()+", "+list.get(i).getNum());
			}
			break;
		case 5:
			System.out.println("종료합니다.");
			System.exit(0);
		default:
			System.out.println("잘못입력하였습니다.");
		
		}
	
	} 
	

	
	
	
	
}
}
