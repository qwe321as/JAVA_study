//private, default, protected,public (접근지정자)
class Tv{
	private String color;
	private int channel;
	private boolean power;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}

//	void setColor(String c){//setter 메서드
//		color = c;
//	}
//	String getClolor(){//getter 메서드
//		return color;
//	}
//	void setChannel(int c){
//		channel = c;}
//	int getChannel() {
//		return channel;
//	} 
//
//	void setPower(boolean p) {
//		power=p;
//	}
//	boolean getPower() {
//		return power;
//	} 
//	

}
public class Ex05_14_setter_getter {

	public static void main(String[] args) {
		Tv tv=new Tv();
		//		tv.color="black";
		//		tv.setColor;
		//		tv.channel=11;
		//			tv.power=true;
		tv.setColor("red");
		tv.setChannel(5);
		tv.setPower(true);
		System.out.println(tv.getColor());
		System.out.println(tv.getChannel());
		System.out.println(tv.isPower());
		//		System.out.println("색상은 :"+tv.color);
		//		System.out.println("채널 :"+tv.channel);
//		System.out.println("전원 :"+tv.power);
	}

}
