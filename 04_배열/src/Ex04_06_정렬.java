
public class Ex04_06_Á¤·Ä {

	public static void main(String[] args) {
		int[] arr = {8,3,5,2,9};
		int a=10, b=20, te;
		te = b;
		b=a;
		a=te;

		int t;
		System.out.println(a+", "+b);

				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i]+" ");
					}
		for (int i = 0; i <arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					t=arr[j];
					arr[j]= arr[i];
					arr[i]=t;
				}
			}
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}

