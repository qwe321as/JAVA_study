package db연습;

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
			System.out.println("=======메뉴선택하기=======");
			System.out.println("1.모든 정보 조회");
			System.out.println("2.조건 검색");
			System.out.println("4.수정");
			System.out.println("5.삭제");
			System.out.println("6.추가");
			System.out.println("7.정렬");
			System.out.println("8.프로그램 종료");
			System.out.print("메뉴 선택 >>" );
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
			case 8:System.out.println("종료");
			System.exit(0);
				break;

			default:
				System.out.println("1~8");
			}
		}
	}
	public void showmain(ArrayList<Bean> list) {
		System.out.println("아이디\t이름\t좋아하는숫자\t");
		for (int i = 0; i < list.size(); i++) {
			String result ="list";
		}

	}
	public static void main(String[] args) {
		new Main();
	}

}
