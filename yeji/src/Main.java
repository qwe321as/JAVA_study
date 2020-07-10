import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	Dao d = new Dao();
	Bean b = new Bean();
	Main(){
		start();
	}

	public void start() {
		while (true) {
			System.out.println("1. 전체 조회");
			System.out.println("2. 선택 정렬");
			System.out.println("3. 찾기");
			System.out.println("4. 수정");
			System.out.println("5. 선택적 수정");
			System.out.println("6. 추가");
			System.out.println("7. 삭제");
			System.out.println("8. 종료");
			System.out.println("9. 음식코드 음식매치");
			System.out.print("번호 선택 >>");
			int key = sc.nextInt();
			switch (key) {
			case 1: 
				ArrayList<Bean>list = d.select();
				show(list);
				break;
			case 2: sun();
			break;
			case 3: find();

			break;
			case 4: update();
			
			break;
			case 5: sunupdate();

			break;
			case 6: insert();

			break;
			case 7: delete();

			break;
			case 8:
				System.out.println("종료");
				System.exit(0);	
				break;
			case 9: 
				ArrayList<Bean>lists = d.match();
				match(lists);
			
			break;

			default:
				System.out.println("1~7 사이의 숫자를 입력하세요.");
			}
		}
	}


	public void match(ArrayList<Bean> lists) {
		System.out.println("번호"+"\t"+"\t"+"이름"+"\t"+"음식코드"+"\t"+"음식"+"\t");
		for (Bean b : lists) {
			String result = b.getId()+"\t"+b.getName()+"\t"+b.getFcode()+"\t"+b.getFood();
			System.out.println(result);
		}

	}

	public void sunupdate() {
		int cnt;
		System.out.print("변경할 id 입력 >>>> ");
		int upid = sc.nextInt();
		System.out.println("변경할 칼럼을 선택하세요.");
		System.out.print("1.좋아하는 번호 2.이름 3.이메일  >>  ");
		int key = sc.nextInt();
		String col = null;
		switch (key) {
		case 1:
			col = "likenum";
			break;
		case 2:
			col = "name";
			break;
		case 3:
			col = "email";
			break;
		default:
			System.out.println("1~3 검색가능");
		}
		System.out.print("변경할 값을 입력하세요 >>");
		String upval = sc.next();
		cnt=d.sunupdate(upid,col,upval);
		System.out.println(cnt);
		if (cnt <=0)
			System.out.println("실패");
		
	}

	public void delete() {
		System.out.print("삭제할 이름를 입력 :");
		String name = sc.next();
		int cnt = d.delete(name);
		if (cnt<=0)
			System.out.println("실패");
		else 
			System.out.println("성공");
	}

	public void insert() {
		System.out.println("번호는 자동입력됩니다.");
		System.out.print("좋아하는 번호 :");
		int num = sc.nextInt();
		System.out.print("이름 :");
		String name = sc.next();
		System.out.print("이메일 :");
		String email = sc.next();
		System.out.print("음식코드 :");
		int fcode = sc.nextInt();
		Bean bean =new Bean(0,num,name,email,fcode);
		int cnt = d.insert(bean);
		if (cnt<=0) {
			System.out.println("실패");
		}


	}

	public void update() {
		System.out.print("변경할 번호 입력>>");
		int fid = sc.nextInt();
		System.out.print("변경할 좋아하는 번호:");
		int likenum = sc.nextInt();
		System.out.print("변경할 이름:");
		String name = sc.next();
		System.out.print("변경할 이메일: ");
		String email = sc.next();
		System.out.print("변경할 음식코드: ");
		int fcode= sc.nextInt();
		Bean bean =new Bean(fid,likenum,name,email,fcode);
		int cnt = d.update(bean);
		if (cnt <=0)
			System.out.println("실패");

	}

	public void find() {
		System.out.println("어디서 찾으실래요?");
		System.out.print("1.좋아하는 번호 2.이름 3.이메일  >>  ");
		int key = sc.nextInt();
		String col = null;
		switch (key) {
		case 1:
			col = "likenum";
			break ;
		case 2:
			col="name";
			break ;
		case 3:
			col="email";
			break ;
		default:
			System.out.println("1~3숫자만 입력하세요.");
		}
		System.out.print("찾을 단어난 숫자를 입력  >>  ");
		String find= sc.next();
		ArrayList<Bean> list = d.find(col,find);
		show(list);
	}

	public void sun() {
		System.out.println("조회할 칼럼을 선택하세요");
		System.out.println("1. 좋아하는 번호 2.이름 3. 이메일");
		System.out.print("번호선택>> ");
		int key = sc.nextInt();
		String col = null;
		String asc = null;
		switch (key) {
		case 1:
			col = "likenum";
			break ;
		case 2:
			col = "name";
			break ;
		case 3:
			col= "email";
			break ;
		default:
			System.out.println("1~3사이의 번호만 입력가능");		}
		System.out.print("1. 오름차순 2. 내림차순>> ");
		int key1 = sc.nextInt();	
		switch (key1) {
		case 1:
			asc = "asc";
			break ;
		case 2:
			asc = "desc";
			break ;

		default:
			System.out.println("1,2둘중에 선택하세요.");
		}
		ArrayList<Bean> list = d.sun(col, asc);
		show(list);
	}

	public void show(ArrayList<Bean> list) {
		System.out.println("번호"+"\t"+"like번호"+"\t"+"이름"+"\t"+"음식코드"+"\t"+"이메일"+"\t");
		for (Bean b : list) {
			String result = b.getId()+"\t"+b.getLikenum()+"\t"+
					b.getName()+"\t"+b.getFcode()+"\t"+b.getEmail() ;
			System.out.println(result);
		}

	}

	public static void main(String[] args) {
		new Main();

	}
}
