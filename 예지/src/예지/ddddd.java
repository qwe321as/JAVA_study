import java.util.*;

class Card{
	private String name;
	private int tel;

	Card(String name, int tel){
		this.name = name;
		this.tel = tel;
	}

	String getName() {
		return name;
	}
	int getTel() {
		return tel;
	}


}

public class ddddd {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String inName;
		int inTel;
		int select;
		int i;
		boolean flag;

		ArrayList<Card> list = new ArrayList<Card>();

		while(true) {

			System.out.println("1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료");
			System.out.print("선택>>>>");
			//select = sc.nextInt();
			select = chkInt("숫자를 입력하세요.");
			flag = false;
			switch(select) {
			case 1 :
				System.out.print("이름을 입력하세요 : ");
				inName = sc.next();
				//inName = chkString("문자를 입력하세요");
				System.out.print("전화번호를 입력하세요 : ");
				//inTel = sc.nextInt();
				inTel = chkInt("숫자를 입력하세요.");
				list.add(new Card(inName,inTel));
				System.out.println("추가 되었습니다.");
				break;

			case 2 : 
				System.out.print("이름을 입력하세요 : ");
				inName = sc.next();
				for(i=0;i<list.size();i++) {
					if(inName.equals(list.get(i).getName())){
						list.remove(list.get(i));
						flag = true;
					}
				}
				if(!flag) System.out.println("해당 이름이 없습니다.");
				else System.out.println("삭제 되었습니다.");
				break;
			case 3 :
				System.out.print("이름을 입력하세요 : ");
				inName = sc.next();
				for(i=0;i<list.size();i++) {
					if(inName.equals(list.get(i).getName())) {
						flag = true;
					}
				}
				if(!flag)System.out.println("해당 이름이 없습니다.");
				else {
					System.out.print("수정할 전화번호를 입력하세요 : ");
					//inTel = sc.nextInt();
					inTel = chkInt("숫자를 입력하세요.");
					for(i=0;i<list.size();i++) {
						if(inName.equals(list.get(i).getName())) {
							list.set(list.indexOf(list.get(i)),new Card(inName,inTel));
						}
					}
				}
				break;
			case 4 :
				System.out.println("이름		전화번호");
				for(i=0; i<list.size();i++) {
					System.out.println(list.get(i).getName()+"		"+list.get(i).getTel());
				}
				break;
			case 5 :
				System.out.println("종료합니다.");
				break;
			default : System.out.println("1~5 중 입력하세요.");
			}
			if(select==5)break;
		}
	}// main
	// 문자입력 중에 숫자? 체크
	/*
	static String chkString(String s) {
		Scanner sc = new Scanner(System.in);
		
	}*/
	
	// 숫자 입력 중에 문자? 체크
	static int chkInt(String s) {
		Scanner sc = new Scanner(System.in);
		int st = 0;
		boolean flag = false;
		while(!flag) {
			try {
				st = sc.nextInt();
				break;
			}
			catch(Exception e) {
				System.out.print(s);
				sc = new Scanner(System.in);
			}
		}
		return st;
	}
}//class
