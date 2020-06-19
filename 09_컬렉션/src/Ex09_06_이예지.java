import java.util.ArrayList;
import java.util.Scanner;

class Card{
	private String name;
	private String tel;
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
	Card(String name,String tel){
		this.name = name;
		this.tel = tel;
	}
	public String toString() {
		return "Card [name=" + name + ", tel=" + tel + "]";
	}

}
public class Ex09_06_이예지 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		ArrayList<Card> ca =new ArrayList<Card>();
		while (true) {
			System.out.println("1. 명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				System.out.print("이름을 입력하세요: ");
				String n = sc.next();
				System.out.println("전화번호를 입력하세요: ");
				String num =sc.next();
				ca.add(new Card(n,num));
				break;
			case 2:

				System.out.print("이름을 입력하세요: ");
				String fn = sc.next();
				System.out.println("전화번호를 입력하세요: ");
				String fnum =sc.next();
				ca.remove(new Card(fn,fnum));
				break;
			case 3:
				System.out.print("이름을 입력하세요: ");
				String cn = sc.next();
				System.out.println("전화번호를 입력하세요: ");
				String cnum =sc.next();
				System.out.print("이름을 입력하세요: ");
				String c1n = sc.next();
				System.out.println("전화번호를 입력하세요: ");
				String c1num =sc.next();
				if(ca.contains(cn))
					if (ca.contains(cnum)) {
						int ad= ca.indexOf(cn);
						System.out.println(ad);
						int ac= ca.indexOf(cnum);		
						for(int i=0;i<ca.size();i++) {
							if(c1n.equals(ca.get(i).getName())) {
								ca.set(ca.indexOf(ca.get(i)),new Card(cn,cnum));
							}
						}
						//		ca.set(ad, c1n);
						//		ca.set(ac, c1num);
					}
				//				ca.set(new Card(fn,fnum));
				//				ca.set(index, fn)

				//				if () {
				//					
				//				}
				break;
			case 4:
				System.out.println(ca.toString());
				break;
			case 5:
				System.out.println("종료합니다.");
				System.exit(0);

				break;

			default: 
				System.out.println("1-5의 숫자만입력하세요.");
				break;
			}
	

		}
	}
}
