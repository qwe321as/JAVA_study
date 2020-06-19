
public class Ex04_실수형 {
	public static void main(String[] args) {
		float f1 = 1.234f;
		double d1= 24.55;
		double d2= 2.55f;
		System.out.println("f1= "+f1);
		System.out.println("d1= "+d1);
		System.out.println("d2= "+d2);
		
		float f2 = 123;
		System.out.println("f2= "+f2);
		int i1 = (int)123.4f;
		System.out.println("i1= "+i1);
		double d3 =.789E3;
		System.out.println("d3= "+d3);
		
		d3= .789E3-3;
		System.out.println("d3= "+d3);
		
		System.out.println();
		
		int a=100;
		char b='A';
		float c=123.456f;
		String d="아이유";
		/*
		 * 정수:%d
		 * char:%c
		 * String:%s
		 * 실수:%f
		 */ 
		 
		System.out.printf("a= "+a);
		System.out.println();
		System.out.printf("a= %d 입니다.",a);
		System.out.println();
		System.out.printf("b= %c 입니다.\n" ,b);
		System.out.printf("b= %d 입니다.\n", (int)b);
		System.out.printf("c= %f 입니다. \n",c);
		System.out.printf("c= %.2f 입니다. \n",c);
		System.out.printf("c= %8.2f 입니다. \n",c);
		System.out.printf("d= %s 입니다. \n",d);
	}

}
