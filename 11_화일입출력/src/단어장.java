import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Scanner;

public class �ܾ��� {
	
public static void main(String[] args) throws Exception {
	Scanner sc = new Scanner(System.in);
	int input;
	String str,line;
	BufferedReader br2=null;
	BufferedReader br = null;
	BufferedWriter bw = null;
	boolean flag = false;
	while (true) {
System.out.print("1.�ܾ��Է� 2.�ܾ� �˻� 3. ����>>");
input = sc.nextInt();
switch (input) {
case 1: //���۵帮���� ������� �о���̴� ��
	System.out.print("�ܾ�/�� �Է�>>");
	br = new BufferedReader(new InputStreamReader(System.in));
	str = br.readLine();
	System.out.println(str);
	bw = new BufferedWriter(new FileWriter("c:\\sun\\voca.txt",true));
	bw.write(str);
	bw.newLine();
//	bw.close();
	bw.flush();
	break;
case 2:
	System.out.println("�˻��� �ܾ� �Է� >>");
	br = new BufferedReader(new InputStreamReader(System.in));
	str = br.readLine();
	br2 = new BufferedReader(new FileReader("c:\\sun\\voca.txt"));
	while ((line=br2.readLine())!=null){
		flag = false;
//		System.out.println(line);
		String[] token = line.split("/"); //token[0]:apple token[1]:���
		if (token[0].equals(str)) {
			System.out.println("�ܾ�>"+str);
			System.out.println("��>"+token[1]);
			flag = true;
			break;
		}
		
	}
	if (flag==false) 
		System.out.println("ã�� �ܾ� ����");
		break;
case 3:
	System.out.println("���α׷� ����");
	if(br!=null) //�ʱⰪ�̶� �ٸ��� ���������� ����ٸ� �����Ȱ��̴�.
	br.close();
	if(bw!=null)
	bw.close();
	System.exit(0);

default:
	throw new IllegalArgumentException("Unexpected value: " + input);
}
	}
}
}
