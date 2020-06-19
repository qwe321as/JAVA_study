import javax.swing.JOptionPane;

public class Ex10_02_Thread {
	public static void main(String[] args) {

		NumberPrint n = new NumberPrint();
		n.start();
		String input = JOptionPane.showInputDialog("아무값이나 입력하세요");
		System.out.println("입력한 값은 "+input+"입니다.");
		System.out.println("main 끝");
		

//		for(int i=10;i>0;i--) {
//			System.out.println(i);
//			try {
//				Thread.sleep(1000);
//			}catch(Exception e) {
//
//			}
//		}
	}
}
class NumberPrint  extends Thread{
	public void run() {
		for(int i=10;i>0;i--) {
			System.out.println(i);
			try {
				sleep(1000);
			}catch(Exception e) {

			}
		}
	}
}













