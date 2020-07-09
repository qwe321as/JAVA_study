import java.util.ArrayList;
import java.util.Scanner;

public class bookMain {
	bookDao dao = new bookDao();
	Scanner sc = new Scanner(System.in);
	bookMain(){
		init();
	}

	public void init() {
		while (true) {
			System.out.println("\n=====메뉴 선택======");
			System.out.println("1.전체 정보 조회");
			System.out.println("2.조건 조회");
			System.out.println("3.정보 수정");
			System.out.println("4.정보 삭제");
			System.out.println("5.정보 추가");
			System.out.println("6.프로로그램 종료");
			System.out.print("번호입력>>>>>");
			int key = sc.nextInt();
			switch (key) {
			case 1:
				ArrayList<bookBean> list = dao.getbook();
				showbook(list);
				break;
			case 2: searchbook();
				break;
			case 3: updatebook();
				break;
			case 4: deletebook();
				break;
			case 5: insertbook();
				break;
			case 6:
				System.out.println("종료합니다.");
				System.exit(0);
				break;
			default:
				System.out.println("1~6사이의 숫자만 입력");
			}

		}
	}
	public void searchbook() {
		String column=null;
		System.out.println("제목 ->1  저자 ->2  출판사 ->3");
		System.out.print("번호입력>>>>");
		int search_num =sc.nextInt();
		switch (search_num) {
		case 1: 
			System.out.print("조회할 제목 :");
			column = "title";
			break;
		case 2:
			System.out.print("조회할 저자 :");
			column = "author";
			break;
		case 3:
			System.out.print("조회할 출판사 :");
			column ="publisher";
			break;

		default:
			System.out.println("1~3 사이의 숫자만 입력");
		}
		String search_word = sc.next();
		ArrayList<bookBean>list=dao.searchbook(column,search_word);
		showbook(list);
	}

	public void updatebook() {
		System.out.print("변경할 번호 입력: ");
		int no = sc.nextInt();
		System.out.print("제목 입력:");
		String title = sc.next();
		System.out.print("작가 입력:");
		String author = sc.next();
		System.out.print("출판사 입력:");
		String publisher = sc.next();
		System.out.print("가격 입력:");
		int price = sc.nextInt();
		System.out.print("출판일자 입력:");
		String pu_day = sc.next();
		bookBean bean = new bookBean(no,title, author, publisher,price, pu_day);
		int cnt = dao.updatebook(bean);
}

	public void deletebook() {
		System.out.print("삭제할 책의 이름 입력: ");
		String title = sc.next();
		int cnt = dao.deleteData(title);
		if(cnt<=0)
			System.out.println("조건에 맞는 데이터가 없다.");
		else
			System.out.println("cnt :"+cnt);
	}

	public void insertbook() {
				System.out.println("no는 자동 입력됩니다.");
				System.out.print("제목 입력:");
				String title = sc.next();
				System.out.print("작가 입력:");
				String author = sc.next();
				System.out.print("출판사 입력:");
				String publisher = sc.next();
				System.out.print("가격 입력:");
				int price = sc.nextInt();
				System.out.print("출판일자 입력:");
				String pu_day = sc.next();
				bookBean bean = new bookBean(0,title, author, publisher,price, pu_day);
				
				int cnt = dao.insertbook(bean);
	}

	public void showbook(ArrayList<bookBean> list) {
		System.out.println("총"+list.size()+"권입니다.");
		String title = "번호\t제목\t작가\t출판사\t가격\t생성일자";
		System.out.println(title);
		//		for (int i = 0; i < list.size(); i++) {
		//			String result =list.get(i).getNo()+
		//					"\t"+list.get(i).getTitle()+
		//					"\t"+list.get(i).getAuthor()+
		//					"\t"+list.get(i).getPublisher()+
		//					"\t"+list.get(i).getPrice()+
		//					"\t"+list.get(i).getPu_day();
		//			System.out.println(result);
		//		}

		for (bookBean bb : list) {
			String result = bb.getNo()+"\t"+bb.getTitle()+"\t"+
					bb.getAuthor()+"\t"+bb.getPublisher()+"\t"+bb.getPrice()+"\t"+bb.getPu_day() ;
			System.out.println(result);
		}

	}
	public static void main(String[] args) {
		new bookMain();
	}

}
