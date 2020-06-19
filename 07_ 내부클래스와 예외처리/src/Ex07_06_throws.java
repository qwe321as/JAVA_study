public class Ex07_06_throws {
	public static void main(String[] args) {
		try {
			call2();
			System.out.println("정상실행");
		} catch (Exception e) {
			System.out.println(e);
//			System.out.println(e.toString());
			System.out.println("처리중 에러발생");
			}
	}
	static void call2() throws Exception{
		int i =1/0;
	}
//	static void call() {
//		try {
//			int i = 1/0;
//		} catch (Exception e) {
//			System.out.println("call: "+e.toString());
//			throw e;
//		}
//		return;
//	}
}
