
public class Ex04_01_1차원 {
	public static void main(String[] args) {
		//같은 자료형 변수를 한묶음으로 관리하는것을 '배열'이라한다!
		int i=0, a =1, b=2, c=3;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		System.out.println();
		int[] arr1 = {1,2,3};

		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		//System.out.println(arr1[3]); ArrayIndexOutOfBoundsException

		System.out.println("방의갯수(length): "+arr1.length);
		System.out.println(arr1);
		System.out.println();

		for (i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println();

		int[] arry2 = new int[] {1,2,3,4,5};
		arry2[2]=22;
		for (i = 0; i < arry2.length; i++) {
			System.out.print(arry2[i]+" ");
		}
		System.out.println();

		int[] arry3 = new int[10];
		arry3[3]=3;
		arry3[4]=4;

		for (i = 0; i < arry3.length; i++) {
			System.out.print(arry3[i]+" ");
		}
		System.out.println();
		
		for(int temp : arry3 ) {
			System.out.println("temp: "+temp);
		}//전체 출력 단일 안됨 확장 for문
		int j;
		//double d1={1.1,2.2,3.3};
		double[] d1= {1.1,2.2,3.3};
		for (j = 0; j < d1.length; j++) {
			System.out.print(d1[j]+" ");
		}
		System.out.println();
		double[] d2=new double[] {1.1,2.2,3.3};
		for(j=0; j<d2.length; j++) {
			System.out.println(d2[j]+"" );
		}
		System.out.println();
		double [] d3=new double[5];
		d3[0]=1.1;		
		d3[1]=2.2;
		d3[2]=3.3;
		for(j=0; j<d3.length; j++) {
			System.out.println(d3[j]+"" );
		}
		System.out.println();
		for (double ddouble : d3) {
			System.out.println("double: "+ ddouble);
			System.out.printf("double:%.2f\n", ddouble);
		}
	}

}
