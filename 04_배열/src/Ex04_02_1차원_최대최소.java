
public class Ex04_02_1����_�ִ��ּ� {

	public static void main(String[] args) {
		int i,max,min;
		int sum=0;
		int[] score = {79,88,91,33,100,55,95};
		for (i = 0; i < score.length; i++) {
			System.out.print(score[i]+" ");
			sum+=score[i];
			//sum = sum+score[i]
		}
		System.out.println();
		System.out.println("����: "+sum);
		System.out.println("�����: "+sum/score.length);
		System.out.printf("�����: %.2f\n",(double)sum/score.length);

		max=score[0];
		min=score[0];
		
		for (i = 1; i < score.length; i++) {
			if(max<score[i])
				max=score[i];
			if(min>score[i])
				min=score[i];
		}
		System.out.println("����ū��   : "+max );
		System.out.println("����������: "+min );
	}

}
