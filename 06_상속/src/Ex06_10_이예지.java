abstract class Employee0{
	private String empno;
	private String name;
	int pay; // ���� ������ public(�������� x) private(�ڱ� �� ��Ŭ���� �������� ���ٰ���) 
	//protected(������ ��Ű�� ���������ϴ� �ǻ�Ŭ����) default(������ ��Ű�� ������ ���� ����)
	Employee0(String empno, String name, int pay) {
		this.empno=empno;
		this.name=name;
		this.pay=pay;		
	}

	abstract double getMonthPay();

	void show() {
		System.out.println("���: "+empno+"�̸� : "+name+"�ݾ�: "+pay);
		System.out.println(getMonthPay());
	}
}
class FullTime extends Employee0{
	int bonus;
	public FullTime(String empno, String name, int pay, int bonus) {
		super(empno, name, pay);
		this.bonus=bonus;
	}
	void Full(){
	}
	double getMonthPay() {
		return(pay/(double)12)+(bonus/(double)12);
	}
}
class Contract extends Employee0{
	private int hireYear;
	public Contract(String empno, String name, int pay, int hireYear) {
		super(empno, name, pay);
		this.hireYear=hireYear;
	}
	void Con(){
	}
	double getMonthPay() {
		return pay/(double)12*hireYear;
		//		pay/(double)12*hireYear
	}
}
class PartTime extends Employee0{
	int workDay;
	public PartTime(String empno, String name, int pay, int workDay) {
		super(empno, name, pay);
		this.workDay=workDay;
	}
	double getMonthPay() {
		return pay*workDay;
		//		pay*workDay
	}
	void Part(){
	}

}
public class Ex06_10_�̿��� {

	public static void main(String[] args) {
		Employee0 f = new FullTime("F001","������",50000000,30);
		Employee0 c = new Contract("C001","��ȿ��",4000000,3); //������ ��ĳ����
		PartTime p = new PartTime("P001","����",50000,10);
		//		System.out.println(getMonthPay());
		f.show();
		c.show();
		p.show();
		p.getMonthPay();
		Employee0 [] emp= {new FullTime("F001","������",50000000,30),
				new Contract("C001","��ȿ��",4000000,3),new PartTime("P001","����",50000,10)};
		for (int i = 0; i < emp.length; i++) {
//			action(emp[i]);
			System.out.println();
			emp[i].show();
//			System.out.println(emp[i].getMonthPay());
		}
	}
//	double e;
//	static void action(Employee0 e) { //�ٿ�ĳ���õǴ��� �˱����� if ans
//		if(e instanceof FullTime) {
//			FullTime f=(FullTime)e;
//			f.Full();}
//		else if(e instanceof Contract) {
//			Contract c=(Contract)e;
//			c.Con();
//		}
//		else if(e instanceof PartTime) {
//			PartTime p=(PartTime)e;
//			p.Part();
//		}
//	}
//
}


