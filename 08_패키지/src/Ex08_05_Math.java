import static java.lang.Math.*;
public class Ex08_05_Math {
	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(Math.abs(-3));
		long a = round(3.856);
		long a1 = round(3.123);//�ݿø�
		System.out.println(a);
		System.out.println(a1);
		double b = ceil(4.32);
		System.out.println(b);//�ø�
		double c = Math.floor(5.66);
		System.out.println(c);//����
		int d = (int)(random()*100);//ex)0+30~49+30 30~79 79-30+1=50
		System.out.println(d);//0<=x<1   13~48-> (random*36 )+13
	}
}
