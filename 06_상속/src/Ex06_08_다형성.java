class Robot{ //비어있는 클래스에 값을 넣기위해 업캐스팅 다운캐스팅을한다.
	//	void sing() {
	//	}
}
class DanceRobot extends Robot{
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}
class SingRobot extends Robot{
	void sing() {
		System.out.println("노래를 합니다.");
	}
}
class DrawRobot extends Robot{
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}
public class Ex06_08_다형성 {
	public static void main(String[] args) {
		int a,b,c;
		int []list = {1,2,3};
		Robot dar = new DanceRobot(); //업캐스팅
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

	static void action(Robot r) { //다운캐스팅되는지 알기위한 if ans
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
