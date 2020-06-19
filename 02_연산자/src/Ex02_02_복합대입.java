
public class Ex02_02_복합대입 {
	public static void main(String[] args) {
		int a=10,b=20 ,c=30 ,d=40,e=50;
		System.out.println("a= "+a);
		//a=a+3
		a+=3;
		System.out.println("a= "+a);
		System.out.println("b= "+b);
//		b=b-5;
		b-=5;
		System.out.println("b= "+b);
		System.out.println("c= "+c);
		c*=3;
		System.out.println("c= "+c);
		System.out.println("d= "+d);
		d/=10;
		System.out.println("d= "+d);
		System.out.println("e= "+e);
//		e=e%7;
		e%=7;
		System.out.println("e= "+e);
		
		String fruit ="apple";
		fruit= fruit + "banana";
		System.out.println(fruit);
	}

}
