import java.util.Scanner;

public class Ex_04_07_이예지 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num,sutNum,i,sum=0,t,j,max,min;
		int[] snum = null;
		while(true) {
			System.out.println("-------------------------------------");		
			System.out.println("1.학생수|2.점수입력|3.점수목록|4.분석|5.종료|");		
			System.out.println("-------------------------------------");		
			System.out.print("번호를 입력>> ");
			num= sc.nextInt();
			if(num==1){
				System.out.print("학생수 입력>> ");
				sutNum=sc.nextInt();
				snum=new int[sutNum];
			}
			else if(num==2) {
				if(snum==null){
					System.out.println("1번부터 입력해주세요.");	
					//continue; (이거쓰면 else안써도됨)
				}
				else {
					System.out.println("점수입력 ");
					for (i = 0; i < snum.length; i++) {
						System.out.print(i+1+"번 학생점수: ");
						snum[i]=sc.nextInt();
					}
				}
			}
			else if(num==3) {
				if(snum==null){
					System.out.println("1번부터 입력해주세요.");	
					continue; 
				}
				System.out.println("--점수목록--");
				for (i= 0; i < snum.length; i++) {
					System.out.println(i+1+"번 학생 "+snum[i]+"점");
				}
			}
			else if(num==4) {
				System.out.println("4.분석");
				if(snum==null){
					System.out.println("1번부터 입력해주세요.");	
					continue; 
				}
				for(i=0; i<snum.length;i++) {
					
				}
				//총점, 평균, 최댓값, 최솟값, 정렬(오름차순)
				for (i = 0; i < snum.length; i++) {
					sum+=snum[i];					
				}
				System.out.println("합은: "+sum);
				double avg = (double)sum/snum.length;
				System.out.printf("평균은: %.2f\n",avg);
				min =max = snum[0];
				for (i = 0; i < snum.length; i++) {
					if(max<snum[i])
						max=snum[i];
					if(min>snum[i])
						min=snum[i];
					
				}
						System.out.println("최솟값: "+min);
						System.out.println("최대값: "+max);
				
//				for (i = 0; i < snum.length; i++) {
//					for (j = i+1; j < snum.length; j++) {
//						if (snum[i]>snum[j]) {
//							t=snum[i];
//							snum[i]=snum[j];
//							snum[j]=t;
//						}
//						System.out.println("최솟값: "+snum[i]);}
//					}
//					for (i = 0; i < snum.length-1; i++) {
//						for (j = i+1; j < snum.length; j++) {
//							if (snum[i]>snum[j]) {
//								t=snum[i];
//								snum[i]=snum[j];
//								snum[j]=t;
//							}
//						}
//					}
//					System.out.println("최댓값: "+snum[i]);
//
//					System.out.print("오름차순: ");
//					for (i = 0; i < snum.length-1; i++) {
//						for (j = i+1; j < snum.length; j++) {
//							if (snum[i]>snum[j]) {
//								t=snum[i];
//								snum[i]=snum[j];
//								snum[j]=t;
//							}
//						}
//					}
//					for (i = 0; i < snum.length; i++) {
//						System.out.print(snum[i]+" ");
//					}
//					System.out.println();
//					System.out.print("내림차순: ");
//					for (i = 0; i < snum.length-1; i++) {
//						for (j = i+1; j < snum.length; j++) {
//							if (snum[i]>snum[j]) {
//								t=snum[i];
//								snum[i]=snum[j];
//								snum[j]=t;
//							}
//						}
//					}
//					for (i = 0; i > snum.length; i++) {
//						System.out.print(snum[i]+" ");
//					}
//					System.out.println();
//				}			
				}
			else if(num==5) {
				break;
			}
			else {
				System.out.println("1-5사이의 번호만 입력가능합니다.");
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}
}
