class Robot{ //����ִ� Ŭ������ ���� �ֱ����� ��ĳ���� �ٿ�ĳ�������Ѵ�.
	//	void sing() {
	//	}
}
class DanceRobot extends Robot{
	void dance() {
		System.out.println("���� ��ϴ�.");
	}
}
class SingRobot extends Robot{
	void sing() {
		System.out.println("�뷡�� �մϴ�.");
	}
}
class DrawRobot extends Robot{
	void draw() {
		System.out.println("�׸��� �׸��ϴ�.");
	}
}
public class Ex06_08_������ {
	public static void main(String[] args) {
		int a,b,c;
		int []list = {1,2,3};
		Robot dar = new DanceRobot(); //��ĳ����
		//		Robot dar = (Robot)new DanceRobot();
		//		((DanceRobot) dar).dance();
		//		dar.dance();
		Robot sr = new SingRobot();
		//		sr.sing();
		Robot dr = new DrawRobot();
		//		dr.draw();

		Robot[]arr = {new DanceRobot(),new SingRobot(),new DrawRobot()};
		for (int i = 0; i < arr.length; i++) {
			action(arr[i]);
		}
	}

	static void action(Robot r) { //�ٿ�ĳ���õǴ��� �˱����� if ans
		if(r instanceof DanceRobot) {
			DanceRobot dar=(DanceRobot)r;
			dar.dance();}
		else if(r instanceof SingRobot) {
			SingRobot sr=(SingRobot)r;
			sr.sing();
		}
		else if(r instanceof DrawRobot) {
			DrawRobot sr=(DrawRobot)r;
			sr.draw();
		}
	}

}
