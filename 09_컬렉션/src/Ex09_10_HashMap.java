import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
public class Ex09_10_HashMap {
	public static void main(String[] args) {
		HashMap<String, Integer>hm = new HashMap<String, Integer>();
		hm.put("����", 24); //����ڽ�
		hm.put("���̸�",new Integer(28));
		hm.put("����",new Integer(26));
		hm.put("����",new Integer(26));
		hm.put("����",new Integer(27));
		hm.put("����",new Integer(25));//���� Ű�ϰ�� ������������ ��
		System.out.println(hm.size());
		System.out.println(hm);
		System.out.println(hm.get("����"));
		System.out.println(hm.get("������"));
		System.out.println(hm.get("26"));
		System.out.println(hm.containsKey("����"));	
		System.out.println(hm.containsKey("����"));	
		System.out.println(hm.containsValue("26"));	
		System.out.println(hm.containsValue("����"));	
		System.out.println(hm.containsValue("����"));	
		System.out.println(hm.containsValue(26));	
		System.out.println(hm.keySet());
		Set key = hm.keySet();
		System.out.println(hm.values());
		Collection<Integer>values = hm.values();
		System.out.println(values);
		//for (int i = 0; i < key.size(); i++) {
		//	System.out.println();
		//}
		Iterator<String> iter = key.iterator();
		Iterator<Integer> iter1 = values.iterator();
		while (iter.hasNext()) {
			String name = iter.next();
//			System.out.println(iter.next()+"�� "+iter1.next()+"���̴�.");	//�ݺ��ؼ� ���	
			System.out.println(name +hm.get(name));
		}
	}
}
 