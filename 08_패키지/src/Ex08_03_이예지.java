import java.util.Scanner;

class Person2{
	String id;
	String pw;
	String name;

	public Person2(String id, String pw, String name) {
		this.id=id;
		this.pw=pw;
		this.name=name;

	}
}
public class Ex08_03_이예지 {
	public static void main(String[] args) {
		int i;
		//		Person2 p1 = new Person2("Lee","1234","이예지");
		//		Person2 p2 = new Person2("Kim","5678","김우빈");
		//		Person2 p3 = new Person2("han","9101","한가인");
		Person2[] pe={new Person2("Lee","1234","이예지"),
				new Person2("Kim","5678","김우빈"),
				new Person2("Han","9101","한가인")};
		Scanner sc = new Scanner(System.in);
		String id,pw,retry;
		boolean flag;
		do {
			flag=true;
			System.out.print("아이디를 입력하세요: ");
			id =sc.next();
			if (id.length()<3 || id.length()>8) {
				System.out.println("id는 3~8 이상입력하세요");
				continue;
			}
			System.out.print("비밀번호를 입력하세요: ");
			pw =sc.next();
			for (i = 0; i < pe.length; i++) {
				if (pe[i].id.equals(id)) {
					flag=false;
					if (pe[i].pw.equals(pw)) {
						System.out.println(pe[i].name+"님 반갑습니다.");
						break;
					}
					else {
						System.out.println("비밀번호를 잘못입력하셨습니다.");
					}
				}	
//				else  {
//					System.out.println("아이디를 잘못입력하셨습니다.");
//					break;
//				}
			}
			if(flag==true) {
				System.out.println("아이디를 잘못입력하셨습니다.");

			}

			System.out.print("계속하시겠습니까?");
			retry = sc.next();
			if (retry.equals("n")||retry.equals("N"))//.EqualsIgnoreCase
				break;

		}
		while (true);
		System.out.println("종료합니다.");

	}
}
/*
id입력: 
pw입력:
3글자-8글자입력
ㅇㅇㅇ님 반갑습니다
계속? y,n
비밀번호 아이디*/
