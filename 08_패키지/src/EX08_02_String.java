import java.util.Scanner;

public class EX08_02_String {

	public static void main(String[] args) {
		int a =1, b=2;
		System.out.println(a==b);
		String st1= new String("Have a nice day"); //A�� 65
		String st2= new String("Have a nice Day"); //a�� 97
		//		String st1= "Have a nice day";
		//		String st2= "Have a nice day"; �ּ� �Ȱ���
		System.out.println("str: "+st1);
		System.out.println("str����: "+st1.length());
		System.out.println(st1.equals(st2));//���ڿ���
		if (st1.equals(st2)) {
			System.out.println("st1�� st2 ���ڿ�����");
		}
		else {
			System.out.println("st1�� st2 ���ڿ��ٸ�");
		}
		System.out.println(st1.equalsIgnoreCase(st2));//���ڿ��� ��ҹ��ڴ޶� Ʈ��
		System.out.println(st1==st2);// �ּҺ�  new�� ������ �ּ� �ٸ�
		System.out.println(st1.compareTo(st2));//st1�� st2 �� ������ 0
		System.out.println();
		System.out.println(st1.concat(st2));//���ڿ����� st1+st2
		System.out.println();
		System.out.println(st1.indexOf("nice"));//st1������ nice��ġ
		System.out.println(st1.indexOf("happy"));//������ -1
		System.out.println(st1.lastIndexOf("a"));//�ڿ������� ��ġ��ã����
		System.out.println(st1.contains("nice"));//������ true
		System.out.println(st1.contains("happy"));//������ false
		System.out.println();
		System.out.println(st1.charAt(3));//���ڿ� 3��° ���
		char c = st1.charAt(3);
		System.out.println("c:"+c);
		System.out.println();
		System.out.println(st1.substring(7,11));//7���� 10�������
		System.out.println(st1.substring(7));//7���� ���������
		System.out.println(st1.replace("a", "x"));//a���� x�� �ٲ�
		System.out.println();
		String s = "   abc De       gf  ";
		System.out.println("s: "+s);
		System.out.println(s.trim());//�յ� ���� ����
		s=s.trim();
		System.out.println(s);
		System.out.println();
		System.out.println(s.toUpperCase());//�빮��
		System.out.println(s.toLowerCase());//�ҹ���
		System.out.println();
		String fullName="Hello.java";
		System.out.println(fullName.indexOf("."));
		String fileName;
		int pos =fullName.indexOf("."); 
		fileName=fullName.substring(0, pos);
		String ext;
		ext = fullName.substring(pos+1);
		System.out.println("ȭ�ϸ�: "+fileName);
		System.out.println("Ȯ����: "+ext);
		String id= "Lee";
		String pw="1234";
		Scanner sc = new Scanner (System.in);
		System.out.print("���̵��Է�: ");
		String inputId = sc.next();
		System.out.print("��й�ȣ�Է�: ");
		String inputPw = sc.next();
//		int ID=id.compareTo(inputId); 
//		int PW=pw.compareTo(inputPw);
//		if (ID==0&&PW==0) {
		if(id.equals(inputId)&&pw.equals(inputPw)) {
			System.out.println("�α��ΰ���");
		}
		else{
			System.out.println("�α��κҰ���");
		}
		}
}
