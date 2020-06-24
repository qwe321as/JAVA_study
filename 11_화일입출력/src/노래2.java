import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class 노래2 {
	public static void main(String[] args) throws Exception {
		String str,lyrics ="";
		int linecount=0;
		FileReader fr = new FileReader("lyrics.txt");
		BufferedReader br = new BufferedReader(fr);
		while ((str = br.readLine())!=null) {
			lyrics += str +" ";
			linecount++;
		}
		System.out.println(lyrics);
		System.out.println(linecount);
		String [] result = lyrics.split(" ");
		System.out.println(result.length);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < result.length; i++) {
			if (map.get(result[i])==null) 
				map.put(result[i],1); //한번도 안만나면 하나이다.
			
			else
				map.put(result[i], map.get(result[i])+1);
			}
		
		Set<String> s =map.keySet();
		System.out.println(s);
		System.out.println(s.size());
		Iterator<String> iter = s.iterator();
		while (iter.hasNext()) {
			String st = iter.next();
			System.out.println(st+" : "+map.get(st));
			
		}
	}
	

}
