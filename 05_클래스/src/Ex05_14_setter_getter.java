//private, default, protected,public (����������)
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

//	void setColor(String c){//setter �޼���
//		color = c;
//	}
//	String getClolor(){//getter �޼���
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
		//		System.out.println("������ :"+tv.color);
		//		System.out.println("ä�� :"+tv.channel);
//		System.out.println("���� :"+tv.power);
	}

}
