import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
public class Ex09_10_HashMap {
	public static void main(String[] args) {
		HashMap<String, Integer>hm = new HashMap<String, Integer>();
		hm.put("예지", 24); //오토박싱
		hm.put("아이린",new Integer(28));
		hm.put("슬기",new Integer(26));
		hm.put("웬디",new Integer(26));
		hm.put("조이",new Integer(27));
		hm.put("조이",new Integer(25));//같은 키일경우 마지막값으로 들어감
		System.out.println(hm.size());
		System.out.println(hm);
		System.out.println(hm.get("조이"));
		System.out.println(hm.get("아이유"));
		System.out.println(hm.get("26"));
		System.out.println(hm.containsKey("슬기"));	
		System.out.println(hm.containsKey("수지"));	
		System.out.println(hm.containsValue("26"));	
		System.out.println(hm.containsValue("슬기"));	
		System.out.println(hm.containsValue("수지"));	
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
//			System.out.println(iter.next()+"는 "+iter1.next()+"살이다.");	//반복해서 출력	
			System.out.println(name +hm.get(name));
		}
	}
}
 