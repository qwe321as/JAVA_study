interface Camera{
	void takePhoto();
}
interface MP3{
	void playMp3();
}
interface DMB{
	void viewTv();
}
class Shape2{
	private int size;
	private String color;
}
class Phone extends Shape2 implements Camera, MP3,DMB {
	public void takePhoto(){
		System.out.println("사진찍기");
	}
	public void playMp3(){
		System.out.println("음악감상");
	}

	public void viewTv() {
		System.out.println("TV보기");		
	}
	public Phone(int size, String color) {
		System.out.println(size);
		System.out.println(color);
	}
}
public class Ex06_12_이예지 {
	public static void main(String[] args) {
	Phone p = new Phone(7,"blule");
	p.takePhoto();
	p.playMp3();
	p.viewTv();
	
	}
}
