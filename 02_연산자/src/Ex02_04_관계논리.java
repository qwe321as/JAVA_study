
public class Ex02_04_관계논리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10, b=20;
		boolean c=a<b;
		System.out.println("c: "+c);
		c=a==b;
		System.out.println("c: "+c);
		c=a!=b;
		System.out.println("c: "+c);
		System.out.println();
		//and 두개다 참이여야 참
		c=a>10&&b>10;
		System.out.println("c: "+c);
		//or 하나도 참이면 참
		c=a>10||b>10;
		System.out.println("c: "+c);
		//not 
		System.out.println("c: "+!c);

	}

}
