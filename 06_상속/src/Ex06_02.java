class Sports2{
	String name;
	int inwon;
	Sports2(String name, int inwon ) {
		this.name=name;
		this.inwon=inwon;
	}
	void show(){
		System.out.println("이름은: "+name);
		System.out.println("인원수: "+inwon);
	}
}
class Baseball2 extends Sports2{
	double ta;
	Baseball2(String name, int inwon, double ta) {
		super(name, inwon);
		this.ta=ta;
	}
	void show() {
		System.out.println();
		super.show();
		System.out.println("타율: "+ta);
		System.out.println();
	}
}
class Football2 extends Sports2{
	int goal;
	Football2(String name, int inwon, int goal){
	super(name,inwon);
	this.goal=goal;
}
	void show() {
		super.show();
		System.out.println("골: "+goal);
	}
	}
public class Ex06_02 {
	public static void main(String[] args) {
		Sports2 a = new Sports2("운동",100);
		Baseball2 b = new Baseball2("야구", 6, 0.025);
		Football2 f = new Football2("축구",11,7);
		a.show();
		b.show();
		f.show();
	}

}
