class Data1{
	public int i = 0;
	}//인스턴스변수
class AA extends Thread{
	public void run() {
		for (int i = 0; i <100000; i++) {//지역변수
			Ex10_04_Sync.d.i++;
			synchronized (Ex10_04_Sync.d) {
				Ex10_04_Sync.d.i++;				
			}
		}
		System.out.println("AA"+Ex10_04_Sync.d.i);
	}
}
class BB extends Thread{
	public void run() {
		for (int i = 0; i <100000; i++) {//지역변수
			Ex10_04_Sync.d.i++;
			synchronized (Ex10_04_Sync.d) {
				Ex10_04_Sync.d.i++;				
			}
		}
		System.out.println("BB"+Ex10_04_Sync.d.i);
	}
}
public class Ex10_04_Sync {
	public static Data1 d = new Data1();
	public static void main(String[] args) {
		System.out.println("main시작");
		AA a = new AA();
		BB b = new BB();
		a.start();
		b.start();
		System.out.println("main종료");
		

	}
}
