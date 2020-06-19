import java.util.HashSet;

public class Ex09_09_set {
	public static void main(String[] args) {
		int [] arr= new int [6];
//		1~10정수 난수 6개 발생
		for (int i = 0; i < arr.length; i++) {
			arr [i] = (int)(Math.random()*10)+1;
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		HashSet<Integer> hs =new HashSet<Integer>();
		int c=0;
		while (true) {
		hs.add((int)( Math.random()*10)+1);
		c++;
		if (hs.size()==6) 
			break;
		
		}
		System.out.println(hs.toString());
		System.out.println(c);
		
		Integer [] arr1 = new Integer[hs.size()];
		hs.toArray(arr1);
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
	}
}
