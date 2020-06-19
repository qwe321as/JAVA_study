interface RemoteControl{
	void turnOn();
	void turnOff();
}
//class Tv implements RemoteControl{
//	public void turnOn() {
//		System.out.println("티비를 켭니당");
//	}
//	public void turnOff() {
//		System.out.println("티비를 끕니당");
//	}
//}
public class Ex07_03_익명 {

	public static void main(String[] args) {
		//		Tv t = new Tv();
		//		t.turnOff();
		//		t.turnOn();
		RemoteControl rc=new RemoteControl(){
			public void turnOn() {
				System.out.println("티비를 켭니당");
			}
			public void turnOff() {
				System.out.println("티비를 끕니당");
			}
		};
		rc.turnOn();
		rc.turnOff();
	}

}
