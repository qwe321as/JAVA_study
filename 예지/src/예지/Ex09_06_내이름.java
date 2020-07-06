package 예지;
import java.util.ArrayList;
import java.util.Scanner;

class Card{
	private String name;
	private String tel;
	
	public Card(String name, String tel) {
		super();
		this.name = name;
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
}

public class Ex09_06_내이름 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		ArrayList<Card> list = new ArrayList<Card>();
		int i;
		
		while(true) {
			System.out.println();
			System.out.print("1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료 : "); 
			
			int select = sc.nextInt();
			String name,tel;
			boolean flag =false;
			
			switch(select) {
			case 1: // 명함추가
				System.out.print("이름을 입력하세요 :");
				name = sc.next();
				System.out.print("전화번호를 입력하세요 :");
				tel = sc.next();
				Card input = new Card(name,tel);
				list.add(input);
				break;
				
			case 2:
				System.out.print("삭제할 이름을 입력하세요 :");
				name = sc.next();
				for(i=0;i<list.size();i++) {
					Card c = list.get(i);
					if(c.getName().equals(name)) {
						list.remove(i);
//						list.remove(list.get(i));
						flag = true;
						System.out.println("삭제되었습니다.");
						break;
					}
				}
				if(flag == false)
					System.out.println("이름을 잘못 입력하셨습니다.");
				
					break;
					
			case 3:
				System.out.print("수정할 이름을 입력하세요 :");
				name = sc.next();
				for (i = 0; i < list.size(); i++) {
					Card c =list.get(i);
					if (c.getName().equals(name)) {
						System.out.print("수정할 전화번호를 입력하세요 :");
						tel = sc.next();
						c.setTel(tel);
//						Card edit = new Card(name,tel);
//						list.set(i,edit);
						System.out.println("수정되었습니다.");
						flag=true;
						break;
					}
				}
				if (flag==false) {
					System.out.println("이름을 잘못입력하였습니다.");
				}
					break;
			case 4: // 명함보기
					System.out.println("이름\t전화번호");
					for(i=0;i<list.size();i++) {
						Card c = list.get(i);
						System.out.println(c.getName()+"\t"+c.getTel());
					}
					break;		
			case 5:
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
					break;
			default:
					System.out.println("1~5사이의 번호만 입력가능함");
					break;
			}
			
		}
	}

}


//1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:1
//이름을 입력하세요 : kim
//전화번호를 입력하세요 : 1234
//
//1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:1
//이름을 입력하세요 : park
//전화번호를 입력하세요 : 3333
//
//1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:4
//이름		전화번호
//kim		1234
//park		3333
//
//1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:3
//이름을 입력하세요 : park
//수정하실 전화번호는 : 7777
//수정되었습니다.
//
//1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:4
//이름		전화번호
//kim		1234
//park		7777
//
//1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:3
//이름을 입력하세요 : choi
//이름을 잘못입력하셨습니다.
//
//1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:2
//이름을 입력하세요 : park
//삭제되었습니다.
//
//1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:4
//이름		전화번호
//kim		1234
//
//1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:2
//이름을 입력하세요 : hong
//이름을 잘못입력하셨습니다.
//
//1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:4
//이름		전화번호
//kim		1234
//
//1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:5
//프로그램을 종료합니다.








