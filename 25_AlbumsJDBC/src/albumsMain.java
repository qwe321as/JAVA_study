import java.util.ArrayList;
import java.util.Scanner;

public class albumsMain {
	Scanner sc= new Scanner(System.in);
	albumsDao dao = new albumsDao();
	albumsMain(){
		init();
	}
	private void init() {
		while (true) {

		System.out.println("=======�޴������ϱ�=======");
		System.out.println("1.��� ���� ��ȸ");
		System.out.println("2.���� �˻�");
		System.out.println("3.���� �������� �˻�(����:��������, ����:��������)");
		System.out.println("4.�ٹ� ����");
		System.out.println("5.�ٹ� ����");
		System.out.println("6.�ٹ� �߰�");
		System.out.println("7.����");
		System.out.println("8.���α׷� ����");
		System.out.print("�޴� ���� >>" );
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
			System.out.println("�����մϴ�.");
			System.exit(0);
			break;

		default:
			System.out.println("1~8 ������ ���ڸ� �Է°����մϴ�.");
		}
		}
	}
	private void jogunalbums() {
		String column = null;
		System.out.println("����˻�:1\t�����˻�:2\tȸ��˻�:3\t");
		System.out.print("�˻��� �׸��� ���� :");
		int snum = sc.nextInt();
		switch (snum) {
		case 1:
			System.out.print("�˻��� �����Է� :");
			column = "song";
			break;
		case 2:
			System.out.print("�˻��� �����Է� :");
			column = "singer";
			break;
		case 3:
			System.out.print("�˻��� ȸ���Է� :");
			column = "company";
			break;
		default:
			System.out.println("1~3������ ���ڸ� �Է��ϼ���.");
		}
		String ssnum = sc.next();
		ArrayList<albumsBean>list = dao.jogunalbums(column,ssnum);
		System.out.println("�˻��� �׸��� "+list.size()+"�� �Դϴ�.");
		showalbums(list);
	}
	public void jungalbums() {
		String column = null;
		String adsc=null;
		System.out.println("������ �׸� �����ϼ���.");
		System.out.println("��ȣ:1\t�뷡����:2\t������:3\t");
		System.out.print("��ȣ�Է�>>");
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
			System.out.println("1~3���� �Է�");
		}
		System.out.println("������ �׸� �����ϼ���.");
		System.out.println("��������:1\t��������:2\t");
		System.out.print("��ȣ�Է�>>");
		int snum = sc.nextInt();
		switch (snum) {
		case 1:
			adsc = "asc";
			break;
		case 2:
			adsc = "desc";
			break;
	default:
			System.out.println("1~2���� �Է�");
		}
		ArrayList<albumsBean>list = dao.jungalbums(column,adsc);
		showalbums(list);
	}
	public void pricealbums() {
		System.out.print("���۵�� �Է�: ");
		int start = sc.nextInt();
		System.out.print("����� �Է�: ");
		int last = sc.nextInt();
		ArrayList<albumsBean>list = dao.pricealbums(start,last);
		showalbums(list);
	}
	public void updatealbums() {
		System.out.print("������ ��ȣ: ");
		int num = sc.nextInt();
		System.out.print("�뷡���� :");
		String song = sc.next();
		System.out.print("���� :");
		String singer = sc.next();
		System.out.print("ȸ�� :");
		String company =sc.next();
		System.out.print("���� :");
		int price = sc.nextInt();
		System.out.print("�߸��� :");
		String pub_day = sc.next();
		albumsBean bean = new albumsBean(num,song,singer,company,price,pub_day);
		int cnt = dao.updatealbums(bean);
	}
	public void deletealbums() {
		System.out.print("������ �뷡���� :");
		String song = sc.next();
		int cnt = dao.deletealbums(song);
	}
	public void insertalbums() {
		System.out.println("��ȣ�� �ڵ����� �ۼ��˴ϴ�.");
		System.out.print("�뷡���� :");
		String song = sc.next();
		System.out.print("���� :");
		String singer = sc.next();
		System.out.print("ȸ�� :");
		String company =sc.next();
		System.out.print("���� :");
		int price = sc.nextInt();
		System.out.print("�߸��� :");
		String pub_day = sc.next();
		
		albumsBean bean = new albumsBean(0,song,singer,company,price,pub_day);
		int cnt = dao.insertalbums(bean);
	}
	public void showalbums(ArrayList<albumsBean> list) {
		System.out.println("��ȣ\t�뷡 ����\t����\tȸ��\t����\t�߸���");
		for (int i = 0; i < list.size(); i++) {
			String result =list.get(i).getNum()+"\t"+list.get(i).getSong()+"\t"+
					list.get(i).getSinger()+"\t"+list.get(i).getCompany()+"\t"+
					list.get(i).getPrice()+"\t"+list.get(i).getPub_day();
			System.out.println(result);
		}
		
	}
	public static void main(String[] args) {
		new albumsMain();
	}

}
