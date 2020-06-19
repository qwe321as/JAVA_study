import java.util.Scanner;
public class Ex08_06_이예지 {
	public static void main(String[] args) {
		int [] lotto = new int[6];
		int [] my = new int[6];
		int count= 0;
		for (int i = 0; i < lotto.length; i++) {
			lotto[i]=(int)(Math.random()*45)+1;
			for (int j = 0; j <i ; j++) {
				if (lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}		
		}
		System.out.println("번호을 입력하세요.");
		for (int i = 0; i < lotto.length; i++) {
			System.out.print("숫자"+(i+1)+": ");
			Scanner sc = new Scanner(System.in);
			my[i]=sc.nextInt();{
				for (int j = 0; j <i; j++) {
					if (my[i]==my[j]) {
						i--;
						System.out.println("다시입력하세요");
						break;
					}
				}
				if (my[i]<1||my[i]>45) {
					System.out.println("1~45사이의 수만 입력가능합니다.");
				}
			}
		}
		for (int i = 0; i < my.length; i++) {
			for (int j = 0; j < my.length; j++) {
				if (lotto[i]==my[j]) {
					count = count+1;}
			}
		}
		System.out.print("당첨번호 :");
		for (int i = 0; i < my.length; i++) {
			System.out.print(+lotto[i]+" ");
		}
		System.out.println();
		System.out.print( "내번호 :");
		for (int i = 0; i < my.length; i++) {
			System.out.print(my[i]+" ");
		}
		System.out.println();
		System.out.println("맞은번호: "+count);
		if (count ==6) {
			System.out.println("일등입니다.");
		}
		else if(count ==5) {
			System.out.println("이등입니다.");
		}
		else {
			System.out.println("꽝입니다.");
		}
	}
}

