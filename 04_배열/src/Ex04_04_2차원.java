public class Ex04_04_2차원 {

	public static void main(String[] args) {
		//일차원 int[] a = {1,2,3};
		int[][] score = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		System.out.println(score[0][0]);
		System.out.println(score[0][1]);
		System.out.println(score[0][2]);
		System.out.println(score[1][2]);
		System.out.println(score[3][1]);
		int[][] score2 = new int [][] {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		int[][] score3 = new int [4][3];
		score3[0][0] =11;
		score3[0][1] =22;
		score3[0][2] =33;
		for (int a = 0; a < 3; a++) {
			System.out.print(score[0][a]+"♥ ");
		}
		System.out.println();
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <=2; j++) {
				System.out.print(score2[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(score.length); //행의갯수
		System.out.println(score[0].length); //열의갯수
		System.out.println(score[1].length);
		System.out.println(score[2].length);
		System.out.println(score[3].length);
		
	}

}
