public class Ex07_04_NullError {
	public static void main(String[] args) {
		int a;
		try {
			String str="yejizzang";
			System.out.println(str.length());
			a=3/1;
			System.out.println(a);
			System.out.println("try ��");
			int[] arr={1,2,3};
			System.out.println(arr[3]);
		}
		catch(NullPointerException e) {
			System.out.println("null�� �ʱ�ȭ�� ���� ���Ұ�");
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e4) {
			System.out.println("�迭������");
			System.out.println(e4.toString());
			System.out.println(e4.getMessage());
		}
		catch(ArithmeticException e2) {
			System.out.println("0���γ���");
			System.out.println(e2.toString());
			System.out.println(e2.getMessage());
		}
		catch(Exception e) {//������ ��ĳ����
			System.out.println(e.toString());
		}
		finally {
			System.out.println("finally ����");
		}
		System.out.println("����ó��");
	}
}

