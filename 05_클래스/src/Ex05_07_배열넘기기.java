
public class Ex05_07_배열넘기기 {

	public static void main(String[] args) {

		int a = 1;
		double b=2.3;

		int[] arr = {3,4,5};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		print(a,b);
		arr1(arr[0],arr[1],arr[2]);
		arr2(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ? ");
		}
	}
	
	static void arr1(int a, int b, int c) {
		System.out.println(a+","+b+","+c);
		
	}
	
	static void arr2(int [] ar) {
		System.out.println("♪♪♪♪♪♪arr2♪♪♪♪♪♪");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
		ar[1]=10;
		System.out.println();
		System.out.println("♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪");
	}

	static void print(int a, double b) {
		System.out.println();
		System.out.println(a+", "+b);
	}

}
