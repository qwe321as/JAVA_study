
class Big extends Thread{ //순차적->동시에
	Big() {
		System.out.println("big ()"); //생성자는 클래스와 이름이 같고 리턴타입없음
	}
	public void run() { //run은 start로 호출함 
		for (char i = 'A'; i <='Z' ; i++) {
			System.out.print(i+" ");//for 문에 char 사용가능
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//sleep은 예외 有, 스테틱 메서드 Thread.이지만상속받아 생략 1000은1초
			//interruptedException

		}
		System.out.println();
	}
}
class Small implements Runnable { //인터페이스 상속시 implements
	Small(){
		
	}
	public void run() {
	for(char i ='a'; i<='z'; i++) {
		System.out.print(i +" ");
		try {
			Thread.sleep(100);
		} catch (Exception e) {
		}
	}
	}
}
public class Ex10_01_thread { //프로그램에서 독립적으로 실행되는 메서드
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		Big b = new Big(); 
		b.start();
		Small s = new Small();
		Thread th = new Thread(s);
		th.start();
		System.out.println("프로그램 끝");

	}
}
