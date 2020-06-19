
public class Ex02_03_Αυ°¨ {

	public static void main(String[] args) {
		int a= 5,b=5,c,d;
		System.out.println("a="+a);
//		a=a+1;
//		a +=1;
//		a++;
		++a;
		System.out.println("a="+a);
//		c =++a;
		c =a++;
		System.out.println("a="+a);
		System.out.println("c="+c);
//		c =++a;
		b=5;
		d =b++;
		System.out.println("b="+b);
		System.out.println("d="+d);
		
		System.out.println();
		a=6;
		System.out.println("a="+a);
		System.out.println(++a);
		System.out.println(a++);
		System.out.println(a);
		System.out.println();
		a=7;
		System.out.println("a="+a);
		System.out.println(--a);
		System.out.println(a--);
		System.out.println(a);

	}

}
