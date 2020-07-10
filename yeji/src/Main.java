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
			System.out.println("1. ��ü ��ȸ");
			System.out.println("2. ���� ����");
			System.out.println("3. ã��");
			System.out.println("4. ����");
			System.out.println("5. ������ ����");
			System.out.println("6. �߰�");
			System.out.println("7. ����");
			System.out.println("8. ����");
			System.out.println("9. �����ڵ� ���ĸ�ġ");
			System.out.print("��ȣ ���� >>");
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
				System.out.println("����");
				System.exit(0);	
				break;
			case 9: 
				ArrayList<Bean>lists = d.match();
				match(lists);
			
			break;

			default:
				System.out.println("1~7 ������ ���ڸ� �Է��ϼ���.");
			}
		}
	}


	public void match(ArrayList<Bean> lists) {
		System.out.println("��ȣ"+"\t"+"\t"+"�̸�"+"\t"+"�����ڵ�"+"\t"+"����"+"\t");
		for (Bean b : lists) {
			String result = b.getId()+"\t"+b.getName()+"\t"+b.getFcode()+"\t"+b.getFood();
			System.out.println(result);
		}

	}

	public void sunupdate() {
		int cnt;
		System.out.print("������ id �Է� >>>> ");
		int upid = sc.nextInt();
		System.out.println("������ Į���� �����ϼ���.");
		System.out.print("1.�����ϴ� ��ȣ 2.�̸� 3.�̸���  >>  ");
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
			System.out.println("1~3 �˻�����");
		}
		System.out.print("������ ���� �Է��ϼ��� >>");
		String upval = sc.next();
		cnt=d.sunupdate(upid,col,upval);
		System.out.println(cnt);
		if (cnt <=0)
			System.out.println("����");
		
	}

	public void delete() {
		System.out.print("������ �̸��� �Է� :");
		String name = sc.next();
		int cnt = d.delete(name);
		if (cnt<=0)
			System.out.println("����");
		else 
			System.out.println("����");
	}

	public void insert() {
		System.out.println("��ȣ�� �ڵ��Էµ˴ϴ�.");
		System.out.print("�����ϴ� ��ȣ :");
		int num = sc.nextInt();
		System.out.print("�̸� :");
		String name = sc.next();
		System.out.print("�̸��� :");
		String email = sc.next();
		System.out.print("�����ڵ� :");
		int fcode = sc.nextInt();
		Bean bean =new Bean(0,num,name,email,fcode);
		int cnt = d.insert(bean);
		if (cnt<=0) {
			System.out.println("����");
		}


	}

	public void update() {
		System.out.print("������ ��ȣ �Է�>>");
		int fid = sc.nextInt();
		System.out.print("������ �����ϴ� ��ȣ:");
		int likenum = sc.nextInt();
		System.out.print("������ �̸�:");
		String name = sc.next();
		System.out.print("������ �̸���: ");
		String email = sc.next();
		System.out.print("������ �����ڵ�: ");
		int fcode= sc.nextInt();
		Bean bean =new Bean(fid,likenum,name,email,fcode);
		int cnt = d.update(bean);
		if (cnt <=0)
			System.out.println("����");

	}

	public void find() {
		System.out.println("��� ã���Ƿ���?");
		System.out.print("1.�����ϴ� ��ȣ 2.�̸� 3.�̸���  >>  ");
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
			System.out.println("1~3���ڸ� �Է��ϼ���.");
		}
		System.out.print("ã�� �ܾ ���ڸ� �Է�  >>  ");
		String find= sc.next();
		ArrayList<Bean> list = d.find(col,find);
		show(list);
	}

	public void sun() {
		System.out.println("��ȸ�� Į���� �����ϼ���");
		System.out.println("1. �����ϴ� ��ȣ 2.�̸� 3. �̸���");
		System.out.print("��ȣ����>> ");
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
			System.out.println("1~3������ ��ȣ�� �Է°���");		}
		System.out.print("1. �������� 2. ��������>> ");
		int key1 = sc.nextInt();	
		switch (key1) {
		case 1:
			asc = "asc";
			break ;
		case 2:
			asc = "desc";
			break ;

		default:
			System.out.println("1,2���߿� �����ϼ���.");
		}
		ArrayList<Bean> list = d.sun(col, asc);
		show(list);
	}

	public void show(ArrayList<Bean> list) {
		System.out.println("��ȣ"+"\t"+"like��ȣ"+"\t"+"�̸�"+"\t"+"�����ڵ�"+"\t"+"�̸���"+"\t");
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
