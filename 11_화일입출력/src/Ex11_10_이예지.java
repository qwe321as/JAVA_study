import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Ex11_10_�̿��� extends Thread {
	public static void main(String[] args)  throws Exception  {
		Scanner sc = new Scanner(System.in);
		int num;
		String str, line;
		BufferedReader br2=null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		boolean flag = false;
		FileWriter fw =new FileWriter("voca.txt");//��������� ����������������� ������ �߻�����.
		while (true) {
			System.out.print("1.�ܾ��Է�  2.�ܾ�˻�  3.���� >> ");
			num = sc.nextInt();
			switch (num) {
			case 1:
				System.out.print("�ܾ� / ��  �Է�");
				 br = new BufferedReader(new InputStreamReader(System.in));
				str = br.readLine();
				System.out.println(str);
				 bw = new BufferedWriter(new FileWriter("voca.txt"));				
				bw.write(str);
				bw.newLine();
				bw.flush();
				break;
			case 2:
				System.out.println("�˻��� �ܾ�");
				 br = new BufferedReader(new InputStreamReader(System.in));
				str = br.readLine();
				 br2 = new BufferedReader(new FileReader("voca.txt"));
				while ((line=br2.readLine())!=null) {
					flag = false;
					String[] token = line.split("/");
					if (token[0].equals(str)) {
						System.out.println("�ܾ� >"+str);
						System.out.println("�� >"+token[1]);
						flag = true;
						break;
					}
				}
				if (flag==false) {
					System.out.println("ã�´ܾ����");
				}
		break;
			case 3:
				System.out.println("���α׷�����");
				if (br!=null) {
					br.close();
				}
				if (bw!=null) {
					bw.close();
				}
				System.exit(0);
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
