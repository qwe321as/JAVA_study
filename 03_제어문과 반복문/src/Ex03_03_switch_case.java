
public class Ex03_03_switch_case {

	public static void main(String[] args) {
		int i=1;
		switch(i) {
		case 1 : System.out.println("1입니다.");
		break;
		case 2 : System.out.println("2입니다.");
		break;
		case 3 : System.out.println("3입니다.");
		break;
		default : System.out.println("1~3사이의 수가 아닙니다.");
		}
		if(i==1) {
			System.out.println("1입니다.");
			}
		else if(i==2) {
			System.out.println("2입니다.");
		}
		else if(i==3) {
			System.out.println("3입니다.");
		}
		else {
			System.out.println("1~3사이의 수가 아닙니다."
					);
		}
		System.out.println("스위치 케이스 공부중입니다.");
	}

}
