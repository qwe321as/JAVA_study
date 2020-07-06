package 예지;
class movie extends Thread{
	public void  run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("동영상을 재생합니다.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class music extends Thread{
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("음악을 재생합니다.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
public class haer {

	public static void main(String[] args) {
		Thread thr = new movie(); 
		thr.start();
		Thread thr1 = new Thread(new music());
		thr1.start();

	}
}
