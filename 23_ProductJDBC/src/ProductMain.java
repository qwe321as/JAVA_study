import java.util.ArrayList;
import java.util.Scanner;

public class ProductMain {
	ProductDao dao = new ProductDao();
	Scanner sc = new Scanner(System.in);
	ProductMain(){
		init();
	}
	public void init() {
		while (true) {
			System.out.println("\n======메뉴선택하기=======");
			System.out.println("1.모든 상품 조회");
			System.out.println("2.특정 상품 조회(id 이용)");
			System.out.println("3.특정 상품 조회(카테고리 이용)");
			System.out.println("4.상품 수정");
			System.out.println("5.상품 삭제");
			System.out.println("6.상품 추가");
			System.out.println("7.프로그램 종료");
			System.out.print("번호 입력 >>>");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:	ArrayList<ProductBean> lists =dao.getAllproducts();
			showProducts(lists);
			break ;
			case 2:	inputid();	
			break ;
			case 3: inputcate();
			break ;
			case 4:	updateData();	
				break ;
			case 5:	deleteData();
				break ;
			case 6:	insertData();	
			break ;
			case 7:
				System.out.println("프로그램 종료");
				System.exit(0);
				break ;
			default:
		
				System.out.println("1~7 숫자만 입력하세요");
			}
		}
	}
	public void deleteData() {
		System.out.print("삭제할 id 입력 : ");
		int id = sc.nextInt();
		int cnt = dao.deleteData(id);
		if(cnt<=0)
			System.out.println("조건에 맞는 데이터가 없다.");
		else
			System.out.println("cnt :"+cnt);
		
	}
	//4
	public void updateData() {
		System.out.print("변경할 id 입력 : ");
		int id = sc.nextInt();
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("제고 입력 : ");
		int stock = sc.nextInt();
		System.out.print("가격 입력 : ");
		int price = sc.nextInt();
		System.out.print("카테고리 입력 : ");
		String category = sc.next();
		System.out.print("입고일자 입력 : ");
		String inputdate = sc.next();
		ProductBean bean = new ProductBean(id, name, stock, price, category, inputdate);
		int cnt = dao.updateData(bean);
		if(cnt>0)
			System.out.println("수정 성공");
		else if(cnt == 0)
			System.out.println("조건에 맞는 데이터 없음");
		else
			System.out.println("수정 실패");
	}
	//6
	public void insertData() {
		System.out.println("id는 시퀀스로 자동 입렵됩니다.");
		System.out.print("이름을 입력하세요.");
		String name = sc.next();
		System.out.print("제고를 입력하세요.");
		int stock = sc.nextInt();
		System.out.print("가격를 입력하세요.");
		int price = sc.nextInt();
		System.out.print("카테고리을 입력하세요.");
		String category = sc.next();
		System.out.print("입고일자을 입력하세요.");
		String inputdate = sc.next();
//		ProductBean bean = new ProductBean();
//		bean.setName();
//		int cnt =dao.insertData(name,stock,price,category,inputdate);
//		if (cnt<0) 
//			System.out.println("insert 실패");
//		else 
//			System.out.println("insert 성공");
		ProductBean bean = new ProductBean(0, name, stock, price, category, inputdate);
		int cnt = dao.insertData(bean);
	}
	//3
	public void inputcate() {
		System.out.print("찾는 카테고리 입력:");
		String fcate = sc.next();
		ArrayList<ProductBean> lists = dao.getproductcate(fcate);

		if(lists.size()==0) {
			System.out.println("해당 카테고리 없습니다.");
		}
		else {
			showProducts(lists);
		}
	}
	//2
	public void inputid() {
		System.out.print("찾는 아이디 입력 :");
		int fid = sc.nextInt();
		ProductBean pb =dao.getproductfid(fid);
		if (pb == null) {
			System.out.println("해당 아이디를 찾을 수 없습니다.");
		}
		else {
			String title = "아이디\t이름\t제고\t가격\t카테고리\t입고일자\t";
			System.out.println(title);
			String result= pb.getId() +"\t"+
					pb.getName() +"\t"+
					pb.getStock() +"\t"+
					pb.getPrice() +"\t"+
					pb.getCategory() +"\t"+
					pb.getInputdate();
			System.out.println(result);}
	}
	//1
	public void showProducts(ArrayList<ProductBean> lists) {
		String title = "아이디\t이름\t제고\t가격\t카테고리\t입고일자\t";
		System.out.println(title);
		for (ProductBean pb:lists) {
			String result= pb.getId() +"\t"+
					pb.getName() +"\t"+
					pb.getStock() +"\t"+
					pb.getPrice() +"\t"+
					pb.getCategory() +"\t"+
					pb.getInputdate();
			System.out.println(result);
		}
	}
	public static void main(String[] args) {
		new ProductMain();


	}

}
