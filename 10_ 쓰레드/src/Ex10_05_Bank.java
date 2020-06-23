class Bank{
	private int money=10000;
	public int getMoney(){
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public synchronized void saveMoney(int save) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		money = money+save;
	}
}
class Park extends Thread{
	public void run() {
		Ex10_05_Bank .b.saveMoney(3000);
		System.out.println("kim saveMoney(3000): "+Ex10_05_Bank.b.getMoney());
	}
}
class Kim extends Thread{
	public void run() {
		Ex10_05_Bank .b.saveMoney(5000);
		System.out.println("kim saveMoney(5000): "+Ex10_05_Bank.b.getMoney());
	}
}
public class Ex10_05_Bank {

	public static Bank b = new Bank();
	public static void main(String[] args) {
		System.out.println("¿ø±Ý"+b.getMoney());
		Park p =new Park();
		Kim k = new Kim();
		p.start();
		k.start();

	}
}

