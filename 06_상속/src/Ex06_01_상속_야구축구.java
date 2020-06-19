class Sports{
	String name;
	int inwon;
	Sports(){
		System.out.println("☆");
	}
	Sports(String name, int inwon) {
		this.name=name;
		this.inwon=inwon;
	}
	void display() {
		System.out.println("종목이름: "+name);
		System.out.println("인원수: "+inwon);
	}
}
class Baseball extends Sports {
	
//	String name;
//	int inwon;
	double ta;
	Baseball(String name, int inwon, double ta){
		super(name, inwon);
		
		this.name=name;
		this.inwon = inwon;
		this.ta=ta;
	}
	void display() {
//		System.out.println("종목이름: "+name);
//		System.out.println("인원수: "+inwon);
		System.out.println();
		super.display();
		System.out.println("타율: "+ta);
		System.out.println();
	}
}
class Football extends Sports {
//	String name;
//	int inwon;
	int goal;
	Football(String name, int inwon, int goal){
		super(name, inwon);
		this.name=name;
		this.inwon = inwon;
		this.goal=goal;
	}
	void display() {
		super.display();
//		System.out.println("종목이름: "+name);
//		System.out.println("인원수: "+inwon);
		System.out.println("골: "+goal);
	}
	
}
public class Ex06_01_상속_야구축구 {

	public static void main(String[] args) {
		Sports s = new Sports("스포츠",1);
		s.display();
//		Baseball b = new Baseball("야구",9,0.25);
//		b.display();
//		Football f = new Football("축구",11,5);
//		f.display();
		Sports b = new Baseball("야구",9,0.25);
		b.display(); //부모에게 메세드 있는지 확인후 자신의 메서드 출력
		Sports f = new Football("축구",11,5);
		f.display();
		System.out.println("==========");
		Sports[] sp= {new Sports("스포츠",1),
				(Sports)new Baseball("야구",9,0.25),new Football("축구",11,5)};
		for (int i = 0; i < sp.length; i++) {
			sp[i].display();;
		}

	}

}
