import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class albumsMain {
	Scanner sc= new Scanner(System.in);
	albumsDao dao = new albumsDao();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	albumsMain() throws IOException{
		init();
	}
	private void init() throws IOException {

		while (true) {
			System.out.println("=======메뉴선택하기=======");
			System.out.println("1.모든 정보 조회");
			System.out.println("2.조건 검색");
			System.out.println("3.가격 범위조건 검색(가격:내림차순, 가수:오름차순)");
			System.out.println("4.앨범 수정");
			System.out.println("5.앨범 삭제");
			System.out.println("6.앨범 추가");
			System.out.println("7.정렬");
			System.out.println("8.프로그램 종료");
			System.out.print("메뉴 선택 >>" );

			int num = sc.nextInt();
			
			switch (num) {
			case 1:
				ArrayList<albumsBean> list = dao.getalbums();
				showalbums(list);
				break;
			case 2:jogunalbums();

			break;
			case 3: pricealbums();

			break;
			case 4: updatealbums();

			break;
			case 5:deletealbums();

			break;
			case 6: insertalbums();

			break;
			case 7: jungalbums();

			break;
			case 8:
				System.out.println("종료합니다.");
				System.exit(0);
				break;
			default:
				System.out.println("1~8 까지의 숫자만 입력가능합니다.");
			}
		}
		}
	private void jogunalbums() {
		String column = null;
		System.out.println("제목검색:1\t가수검색:2\t회사검색:3\t");
		System.out.print("검색할 항목을 선택 :");
		try {
			int snum = sc.nextInt();
			switch (snum) {
			case 1:
				System.out.print("검색할 제목입력 :");
				column = "song";
				break;
			case 2:
				System.out.print("검색할 가수입력 :");
				column = "singer";
				break;
			case 3:
				System.out.print("검색할 회사입력 :");
				column = "company";
				break;
			default:
				System.out.println("1~3사이의 숫자만 입력하세요.");
				return;
			}}
		catch(InputMismatchException e) {
			System.out.println("숫자만 입력하세요.");
		}

		String ssnum = sc.next();
		ArrayList<albumsBean>list = dao.jogunalbums(column,ssnum);
		if (list.size()==0) {
			System.out.println("해당 단어가 존재하지 않음");
		}
		else {
			System.out.println("검색한 항목은 "+list.size()+"건 입니다.");
			showalbums(list);
		}
		
	}
	public void jungalbums() {
		String column = null;
		String adsc=null;
		System.out.println("정렬할 항목 선택하세요.");
		System.out.println("번호:1\t노래제목:2\t가수명:3\t");
		System.out.print("번호입력>>");
		int fnum = sc.nextInt();
		switch (fnum) {
		case 1:
			column = "num";
			break;
		case 2:
			column = "song";
			break;
		case 3:
			column = "singer";
			break;
		default:
			System.out.println("1~3까지 입력");
		}
		System.out.println("정렬할 항목 선택하세요.");
		System.out.println("오름차순:1\t내림차순:2\t");
		System.out.print("번호입력>>");
		int snum = sc.nextInt();
		switch (snum) {
		case 1:
			adsc = "asc";
			break;
		case 2:
			adsc = "desc";
			break;
		default:
			System.out.println("1~2까지 입력");
			return;
		}
		ArrayList<albumsBean>list = dao.jungalbums(column,adsc);
		showalbums(list);
	}
	public void pricealbums() {
		System.out.print("시작등수 입력: ");
		int start = sc.nextInt();
		System.out.print("끝등수 입력: ");
		int last = sc.nextInt();
		ArrayList<albumsBean>list = dao.pricealbums(start,last);
		showalbums(list);
	}
	public void updatealbums() {
		System.out.print("변경할 번호: ");
		int num = sc.nextInt();
		System.out.print("노래제목 :");
		String song = sc.next();
		System.out.print("가수 :");
		String singer = sc.next();
		System.out.print("회사 :");
		String company =sc.next();
		System.out.print("가격 :");
		int price = sc.nextInt();
		System.out.print("발매일 :");
		String pub_day = sc.next();
		albumsBean bean = new albumsBean(num,song,singer,company,price,pub_day);
		int cnt = dao.updatealbums(bean);
	}
	public void deletealbums() {
		System.out.print("삭제한 노래제목 :");
		String song = sc.next();
		int cnt = dao.deletealbums(song);
	}
	public void insertalbums()throws IOException {
		System.out.println("번호는 자동으로 작성됩니다.");
		System.out.print("노래제목 :");
		String song = br.readLine();
//		String song = sc.next();
		System.out.print("가수 :");
		String singer = br.readLine();
//		String singer = sc.next();
		System.out.print("회사 :");
		String company = br.readLine();
//		String company =sc.next();
		System.out.print("가격 :");
		int price = Integer.parseInt(br.readLine());
//		int price = sc.nextInt();
		System.out.print("발매일 :");
		String pub_day = br.readLine();
//		String pub_day = sc.next();

//		albumsBean bean = new albumsBean(0,song,singer,company,price,pub_day);
//		int cnt = dao.insertalbums(bean);
		do {
			try {
				System.out.print("가격 입력 : ");
				price = Integer.parseInt(br.readLine()); // 문자열=>정수
				break;
			}catch(NumberFormatException e) {
				System.out.println("숫자로 입력하세요");
			}
		}while(true);
		
		System.out.print("입고일자 입력 : ");
		pub_day = br.readLine();

		albumsBean bean = new albumsBean(0,song,singer,company,price,pub_day);
		int cnt = dao.insertalbums(bean);

		if (cnt<=0) {
			System.out.println("실패");
		}
		else {
			System.out.println("성공");
		}
	}
	public void showalbums(ArrayList<albumsBean> list) {
		System.out.println("번호\t노래 제목\t가수\t회사\t가격\t발매일");
//		for (int i = 0; i < list.size(); i++) {
//			String result =list.get(i).getNum()+"\t"+list.get(i).getSong()+"\t"+
//					list.get(i).getSinger()+"\t"+list.get(i).getCompany()+"\t"+
//					list.get(i).getPrice()+"\t"+list.get(i).getPub_day();
//			System.out.println(result);
//		}

		for( albumsBean album : list ){
			System.out.printf("%d\t %s\t %s\t %s\t %d\t %s\n", 
					album.getNum(),album.getSong(),
					album.getSinger(),album.getCompany(),
					album.getPrice(),album.getPub_day() );
		}		

	}
	public static void main(String[] args) throws IOException {
		new albumsMain();
	}

}
