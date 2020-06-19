public class Ex07_04_NullError {
	public static void main(String[] args) {
		int a;
		try {
			String str="yejizzang";
			System.out.println(str.length());
			a=3/1;
			System.out.println(a);
			System.out.println("try 안");
			int[] arr={1,2,3};
			System.out.println(arr[3]);
		}
		catch(NullPointerException e) {
			System.out.println("null로 초기화된 변수 사용불가");
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e4) {
			System.out.println("배열값없음");
			System.out.println(e4.toString());
			System.out.println(e4.getMessage());
		}
		catch(ArithmeticException e2) {
			System.out.println("0으로나눔");
			System.out.println(e2.toString());
			System.out.println(e2.getMessage());
		}
		catch(Exception e) {//다형성 업캐스팅
			System.out.println(e.toString());
		}
		finally {
			System.out.println("finally 구문");
		}
		System.out.println("예외처리");
	}
}

