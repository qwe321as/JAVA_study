import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//map Ű�� ����
public class Ex09_11_HashMap {

	public static void main(String[] args) {
		Map<String , String> dic = new HashMap<String, String>();
		dic.put("pencil", "����");
		dic.put("sky", "�ϴ�");
		dic.put("desk", "å��");
		dic.put("face", "��");
		System.out.println(dic.toString());
		System.out.println(dic.keySet());
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("ã�� �ܾ��? (q �Է½� ����) ");
			String a = sc.next();
			if (dic.containsKey(a)) {
				System.out.println("�� :"+dic.get(a));
			}

			else if (a.equals("q")) {
				break;
			}
			else {
//				if (dic.get(a)==null) {
//				if(dic.containsKey(a==false) {
				System.out.println("�߸��Է�");
			}			
		}
		System.out.println("�ý�������");
	}
}
