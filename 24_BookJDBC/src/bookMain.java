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
			System.out.println("\n=====�޴� ����======");
			System.out.println("1.��ü ���� ��ȸ");
			System.out.println("2.���� ��ȸ");
			System.out.println("3.���� ����");
			System.out.println("4.���� ����");
			System.out.println("5.���� �߰�");
			System.out.println("6.���ηα׷� ����");
			System.out.print("��ȣ�Է�>>>>>");
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
				System.out.println("�����մϴ�.");
				System.exit(0);
				break;
			default:
				System.out.println("1~6������ ���ڸ� �Է�");
			}

		}
	}
	public void searchbook() {
		String column=null;
		System.out.println("���� ->1  ���� ->2  ���ǻ� ->3");
		System.out.print("��ȣ�Է�>>>>");
		int search_num =sc.nextInt();
		switch (search_num) {
		case 1: 
			System.out.print("��ȸ�� ���� :");
			column = "title";
			break;
		case 2:
			System.out.print("��ȸ�� ���� :");
			column = "author";
			break;
		case 3:
			System.out.print("��ȸ�� ���ǻ� :");
			column ="publisher";
			break;

		default:
			System.out.println("1~3 ������ ���ڸ� �Է�");
		}
		String search_word = sc.next();
		ArrayList<bookBean>list=dao.searchbook(column,search_word);
		showbook(list);
	}

	public void updatebook() {
		System.out.print("������ ��ȣ �Է�: ");
		int no = sc.nextInt();
		System.out.print("���� �Է�:");
		String title = sc.next();
		System.out.print("�۰� �Է�:");
		String author = sc.next();
		System.out.print("���ǻ� �Է�:");
		String publisher = sc.next();
		System.out.print("���� �Է�:");
		int price = sc.nextInt();
		System.out.print("�������� �Է�:");
		String pu_day = sc.next();
		bookBean bean = new bookBean(no,title, author, publisher,price, pu_day);
		int cnt = dao.updatebook(bean);
}

	public void deletebook() {
		System.out.print("������ å�� �̸� �Է�: ");
		String title = sc.next();
		int cnt = dao.deleteData(title);
		if(cnt<=0)
			System.out.println("���ǿ� �´� �����Ͱ� ����.");
		else
			System.out.println("cnt :"+cnt);
	}

	public void insertbook() {
				System.out.println("no�� �ڵ� �Էµ˴ϴ�.");
				System.out.print("���� �Է�:");
				String title = sc.next();
				System.out.print("�۰� �Է�:");
				String author = sc.next();
				System.out.print("���ǻ� �Է�:");
				String publisher = sc.next();
				System.out.print("���� �Է�:");
				int price = sc.nextInt();
				System.out.print("�������� �Է�:");
				String pu_day = sc.next();
				bookBean bean = new bookBean(0,title, author, publisher,price, pu_day);
				
				int cnt = dao.insertbook(bean);
	}

	public void showbook(ArrayList<bookBean> list) {
		System.out.println("��"+list.size()+"���Դϴ�.");
		String title = "��ȣ\t����\t�۰�\t���ǻ�\t����\t��������";
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
