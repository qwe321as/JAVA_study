interface RemoteControl{
	void turnOn();
	void turnOff();
}
//class Tv implements RemoteControl{
//	public void turnOn() {
//		System.out.println("Ƽ�� �մϴ�");
//	}
//	public void turnOff() {
//		System.out.println("Ƽ�� ���ϴ�");
//	}
//}
public class Ex07_03_�͸� {

	public static void main(String[] args) {
		//		Tv t = new Tv();
		//		t.turnOff();
		//		t.turnOn();
		RemoteControl rc=new RemoteControl(){
			public void turnOn() {
				System.out.println("Ƽ�� �մϴ�");
			}
			public void turnOff() {
				System.out.println("Ƽ�� ���ϴ�");
			}
		};
		rc.turnOn();
		rc.turnOff();
	}

}
