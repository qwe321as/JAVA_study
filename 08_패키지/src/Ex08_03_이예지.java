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
public class Ex08_03_�̿��� {
	public static void main(String[] args) {
		int i;
		//		Person2 p1 = new Person2("Lee","1234","�̿���");
		//		Person2 p2 = new Person2("Kim","5678","����");
		//		Person2 p3 = new Person2("han","9101","�Ѱ���");
		Person2[] pe={new Person2("Lee","1234","�̿���"),
				new Person2("Kim","5678","����"),
				new Person2("Han","9101","�Ѱ���")};
		Scanner sc = new Scanner(System.in);
		String id,pw,retry;
		boolean flag;
		do {
			flag=true;
			System.out.print("���̵� �Է��ϼ���: ");
			id =sc.next();
			if (id.length()<3 || id.length()>8) {
				System.out.println("id�� 3~8 �̻��Է��ϼ���");
				continue;
			}
			System.out.print("��й�ȣ�� �Է��ϼ���: ");
			pw =sc.next();
			for (i = 0; i < pe.length; i++) {
				if (pe[i].id.equals(id)) {
					flag=false;
					if (pe[i].pw.equals(pw)) {
						System.out.println(pe[i].name+"�� �ݰ����ϴ�.");
						break;
					}
					else {
						System.out.println("��й�ȣ�� �߸��Է��ϼ̽��ϴ�.");
					}
				}	
//				else  {
//					System.out.println("���̵� �߸��Է��ϼ̽��ϴ�.");
//					break;
//				}
			}
			if(flag==true) {
				System.out.println("���̵� �߸��Է��ϼ̽��ϴ�.");

			}

			System.out.print("����Ͻðڽ��ϱ�?");
			retry = sc.next();
			if (retry.equals("n")||retry.equals("N"))//.EqualsIgnoreCase
				break;

		}
		while (true);
		System.out.println("�����մϴ�.");

	}
}
/*
id�Է�: 
pw�Է�:
3����-8�����Է�
�������� �ݰ����ϴ�
���? y,n
��й�ȣ ���̵�*/
