
public class Ex02_05_���� {

	public static void main(String[] args) {
//		���׿����� : 3+4,-,*,/
//		���׿����� : ++ ,--,!
//		���׿�����: ���ǹ� ? ��: ����
		
		int a= 11, b=20;
		String result;
		result = a%2==1? "Ȧ��":"¦��";
		System.out.println("result: "+result);
		
		if(a%2==0)
		{
			System.out.println("a�� ¦���Դϴ�.");
		}
		else
		{
			System.out.println("a�� Ȧ���Դϴ�.");
		}
		
		switch (a%2) {
		case 0 :
			System.out.println("a�� ¦���Դϴ�.");
			break ;

		default:
			System.out.println("a�� Ȧ���Դϴ�.");
		}
	}

}
