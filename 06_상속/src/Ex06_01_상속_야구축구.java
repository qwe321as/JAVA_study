class Sports{
	String name;
	int inwon;
	Sports(){
		System.out.println("��");
	}
	Sports(String name, int inwon) {
		this.name=name;
		this.inwon=inwon;
	}
	void display() {
		System.out.println("�����̸�: "+name);
		System.out.println("�ο���: "+inwon);
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
//		System.out.println("�����̸�: "+name);
//		System.out.println("�ο���: "+inwon);
		System.out.println();
		super.display();
		System.out.println("Ÿ��: "+ta);
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
//		System.out.println("�����̸�: "+name);
//		System.out.println("�ο���: "+inwon);
		System.out.println("��: "+goal);
	}
	
}
public class Ex06_01_���_�߱��౸ {

	public static void main(String[] args) {
		Sports s = new Sports("������",1);
		s.display();
//		Baseball b = new Baseball("�߱�",9,0.25);
//		b.display();
//		Football f = new Football("�౸",11,5);
//		f.display();
		Sports b = new Baseball("�߱�",9,0.25);
		b.display(); //�θ𿡰� �޼��� �ִ��� Ȯ���� �ڽ��� �޼��� ���
		Sports f = new Football("�౸",11,5);
		f.display();
		System.out.println("==========");
		Sports[] sp= {new Sports("������",1),
				(Sports)new Baseball("�߱�",9,0.25),new Football("�౸",11,5)};
		for (int i = 0; i < sp.length; i++) {
			sp[i].display();;
		}

	}

}
