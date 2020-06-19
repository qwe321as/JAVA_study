import java.util.HashSet;
import java.util.Iterator;

public class Ex09_08_sett {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();{//중복허용x
			hs.add("aa");
			hs.add("bb");
			hs.add("cc");
			hs.add("aa");
			System.out.println(hs.size());
			System.out.println(hs);
			System.out.println(hs.contains("bb"));
			System.out.println(hs.contains("dd"));
			System.out.println(hs.remove("bb"));
			System.out.println(hs.remove("dd"));
			System.out.println(hs);
			Iterator<String> iter = hs.iterator();
			while (iter.hasNext()) {
				System.out.println(iter.next());	//반복해서 출력	
			}

		}	

	}
}
