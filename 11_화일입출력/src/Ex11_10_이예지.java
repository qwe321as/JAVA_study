import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Ex11_10_�̿��� extends Thread {
	public static void main(String[] args)  throws Exception  {
		Scanner sc = new Scanner(System.in);
		int num;
		String dan,kdan ,fdan;

		FileWriter fw =new FileWriter("voca.txt");//��������� ����������������� ������ �߻�����.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(fw); //fw�� 1�� ��Ʈ���������� -1 �ƴ� null��					while(true) {
		while (true) {
			System.out.print("1.�ܾ��Է�  2.�ܾ�˻�  3.���� >> ");
			num = sc.nextInt();
			switch (num) {
			case 1:{
				System.out.print("�ܾ� / ��  �Է�");
				while ((fdan=br.readLine())!=null) {
					bw.write(fdan);//��Ʈ����Ʈ
					bw.newLine();
				}
				System.out.println("�Է��� ��Ĩ�ϴ�.");
				bw.close();
				br.close();
				break;
				}
			case 2:

				break;
			case 3:

				break;
			default:
				System.out.println("1~3�Է�");
			}


		}
	}
}

//�Է��� �ܾ�/���� voca.txt�� ����
//1.�ܾ��Է� 2.�ܾ�˻� 3.���� >> 1
//�ܾ�/�� �Է�>>apple/���
//
//1.�ܾ��Է� 2.�ܾ�˻� 3.���� >> 1
//�ܾ�/�� �Է�>>blue sky/�Ķ� �ϴ�
//
//1.�ܾ��Է� 2.�ܾ�˻� 3.���� >> 2
//�˻� �ܾ� �Է�>>apple
//�ܾ�>apple
//�ܾ��� ��>���
//
//1.�ܾ��Է� 2.�ܾ�˻� 3.���� >> 2
//�˻� �ܾ� �Է�>>summer
//ã�� �ܾ� ����
//
//1.�ܾ��Է� 2.�ܾ�˻� 3.���� >> 3
//���α׷� �����մϴ�.
