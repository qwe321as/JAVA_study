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
			System.out.println("\n======�޴������ϱ�=======");
			System.out.println("1.��� ��ǰ ��ȸ");
			System.out.println("2.Ư�� ��ǰ ��ȸ(id �̿�)");
			System.out.println("3.Ư�� ��ǰ ��ȸ(ī�װ� �̿�)");
			System.out.println("4.��ǰ ����");
			System.out.println("5.��ǰ ����");
			System.out.println("6.��ǰ �߰�");
			System.out.println("7.���α׷� ����");
			System.out.print("��ȣ �Է� >>>");
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
				System.out.println("���α׷� ����");
				System.exit(0);
				break ;
			default:
		
				System.out.println("1~7 ���ڸ� �Է��ϼ���");
			}
		}
	}
	public void deleteData() {
		System.out.print("������ id �Է� : ");
		int id = sc.nextInt();
		int cnt = dao.deleteData(id);
		if(cnt<=0)
			System.out.println("���ǿ� �´� �����Ͱ� ����.");
		else
			System.out.println("cnt :"+cnt);
		
	}
	//4
	public void updateData() {
		System.out.print("������ id �Է� : ");
		int id = sc.nextInt();
		System.out.print("�̸� �Է� : ");
		String name = sc.next();
		System.out.print("���� �Է� : ");
		int stock = sc.nextInt();
		System.out.print("���� �Է� : ");
		int price = sc.nextInt();
		System.out.print("ī�װ� �Է� : ");
		String category = sc.next();
		System.out.print("�԰����� �Է� : ");
		String inputdate = sc.next();
		ProductBean bean = new ProductBean(id, name, stock, price, category, inputdate);
		int cnt = dao.updateData(bean);
		if(cnt>0)
			System.out.println("���� ����");
		else if(cnt == 0)
			System.out.println("���ǿ� �´� ������ ����");
		else
			System.out.println("���� ����");
	}
	//6
	public void insertData() {
		System.out.println("id�� �������� �ڵ� �ԷƵ˴ϴ�.");
		System.out.print("�̸��� �Է��ϼ���.");
		String name = sc.next();
		System.out.print("���� �Է��ϼ���.");
		int stock = sc.nextInt();
		System.out.print("���ݸ� �Է��ϼ���.");
		int price = sc.nextInt();
		System.out.print("ī�װ��� �Է��ϼ���.");
		String category = sc.next();
		System.out.print("�԰������� �Է��ϼ���.");
		String inputdate = sc.next();
//		ProductBean bean = new ProductBean();
//		bean.setName();
//		int cnt =dao.insertData(name,stock,price,category,inputdate);
//		if (cnt<0) 
//			System.out.println("insert ����");
//		else 
//			System.out.println("insert ����");
		ProductBean bean = new ProductBean(0, name, stock, price, category, inputdate);
		int cnt = dao.insertData(bean);
	}
	//3
	public void inputcate() {
		System.out.print("ã�� ī�װ� �Է�:");
		String fcate = sc.next();
		ArrayList<ProductBean> lists = dao.getproductcate(fcate);

		if(lists.size()==0) {
			System.out.println("�ش� ī�װ� �����ϴ�.");
		}
		else {
			showProducts(lists);
		}
	}
	//2
	public void inputid() {
		System.out.print("ã�� ���̵� �Է� :");
		int fid = sc.nextInt();
		ProductBean pb =dao.getproductfid(fid);
		if (pb == null) {
			System.out.println("�ش� ���̵� ã�� �� �����ϴ�.");
		}
		else {
			String title = "���̵�\t�̸�\t����\t����\tī�װ�\t�԰�����\t";
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
		String title = "���̵�\t�̸�\t����\t����\tī�װ�\t�԰�����\t";
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
