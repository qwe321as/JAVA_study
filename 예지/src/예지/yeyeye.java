package 예지;

import org.graalvm.compiler.core.common.alloc.Trace;

//class nnnnn extends Thread{
//	public void run() {
//		int i =0;
//		while (i<10) {
//			System.out.println(i+"회 : "+System.currentTimeMillis()+"\t");
//			i=i+1;
//			try {
//				this.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//}
//	public static void main(String[] args) {
//		nnnnn n = new nnnnn();
//		n.start();
//	}
//class Sm extends Thread{
//	private long sum;
//	long getSum() {
//		return sum;
//	}
//	public void setSum(long sum) {
//		this.sum=sum;
//
//	}
//	public void run() {
//		for (int i = 0; i < 100;  i++) {
//			sum +=i;
//
//		}
//	}
//}
//
//	public static void main(String[] args) {
//		Sm sm = new Sm();
//		sm.start();
//		try {
//		sm.join();
//		}
//		catch (Exception e) {
//		}
//		System.out.println(sm.getSum());
//	}
//}
class AAA extends Thread{
public void save() {
	System.out.println("작업내용을 저장함.");
}
public void run() {
	while (true) {
		try {
			Thread.sleep(900);
		} catch (Exception e) {
			break;
		}
		save();
	}
}
}
public class yeyeye {
public static void main(String[] args) {
	AAA aaa= new AAA();
	aaa.setDaemon(true);
	aaa.start();
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	System.out.println("메인 스레드 종료");
}
}