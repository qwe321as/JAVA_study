import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Scanner;

public class �ܾ�2 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner (System.in);
		int input;
		boolean flag = false;
		String str,line;
		BufferedReader br = null,br2;
		BufferedWriter bw = null;
		while (true) {
			System.out.print("�ܾ��Է� �ܾ�˻� ����");
			input = sc.nextInt();
			switch (input) {
			case 1:
				br= new BufferedReader(new InputStreamReader(System.in));
				str =br.readLine();
				System.out.println(str);
				bw = new BufferedWriter(new FileWriter("dan.txt", true));
				bw.write(str);
				bw.flush();
				break ;
			case 2:
				System.out.println("ã�´ܾ�");
				br= new BufferedReader(new InputStreamReader(System.in));
				str = br.readLine();
				br2 = new BufferedReader(new FileReader("dan.txt"));
				while ((line=br2.readLine())!=null) {
					flag = false;
					String[] token = line.split("/");
					if (token [0].equals(str)) {
						System.out.println("�ܾ� "+str);
						System.out.println("��"+token[1]);
						flag = true;
						break;
					}
				}
				if (flag==false) {
					System.out.println("ã�´ܾ����");
				}
				break;
			case 3:
				if (bw!=null) {
					bw.close();
				}
				if(br!=null) {
					br.close();
				}
				System.exit(0);
				break;


			default:
				System.out.println("1-3���ڸ� �Է�");
			}
		}
	}
}
