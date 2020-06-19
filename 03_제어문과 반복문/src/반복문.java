public class ¹Ýº¹¹® {

	public static void main(String[] args) {
		int i,j;
		int sum=0;

		for (i = 0; i < 5; i++) {
			for (j =5; j>i; j--) {	
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		for(i=1; i<=100; i++) {
			sum=sum+i;
			if(i%10==0) {
				System.out.println(1+"~"+i+"="+sum);
			}
		}
		System.out.println();

		sum=0;
		for(i=1; i<100; i++) {
			
			sum=sum+i;
			if(i%10==0) {
				System.out.println(i-9+"~"+i+"="+sum);
				sum=0;
			}
		}

	}
}
