package db����;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	Dao d = new Dao();
	Bean b = new Bean();
	Main(){
		init();
	}
	public void init() {
		while (true) {
			System.out.println("=======�޴������ϱ�=======");
			System.out.println("1.��� ���� ��ȸ");
			System.out.println("2.���� �˻�");
			System.out.println("4.����");
			System.out.println("5.����");
			System.out.println("6.�߰�");
			System.out.println("7.����");
			System.out.println("8.���α׷� ����");
			System.out.print("�޴� ���� >>" );
			int num = sc.nextInt();	
			switch (num) {
			case 1: 
			ArrayList<Bean> list = d.select();
			showmain(list);
				break;
			case 2: 
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:System.out.println("����");
			System.exit(0);
				break;

			default:
				System.out.println("1~8");
			}
		}
	}
	public void showmain(ArrayList<Bean> list) {
		System.out.println("���̵�\t�̸�\t�����ϴ¼���\t");
		for (int i = 0; i < list.size(); i++) {
			String result ="list";
		}

	}
	public static void main(String[] args) {
		new Main();
	}

}
