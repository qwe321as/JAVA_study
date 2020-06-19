import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//map 키와 벨류
public class Ex09_11_HashMap {

	public static void main(String[] args) {
		Map<String , String> dic = new HashMap<String, String>();
		dic.put("pencil", "연필");
		dic.put("sky", "하늘");
		dic.put("desk", "책상");
		dic.put("face", "얼굴");
		System.out.println(dic.toString());
		System.out.println(dic.keySet());
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("찾는 단어는? (q 입력시 종료) ");
			String a = sc.next();
			if (dic.containsKey(a)) {
				System.out.println("뜻 :"+dic.get(a));
			}

			else if (a.equals("q")) {
				break;
			}
			else {
//				if (dic.get(a)==null) {
//				if(dic.containsKey(a==false) {
				System.out.println("잘못입력");
			}			
		}
		System.out.println("시스템종료");
	}
}
