import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex11_11_WordCount_이예지 {
public static void main(String[] args) throws Exception {
	FileReader fr = new FileReader("lyrics.txt");
	BufferedReader br = new BufferedReader(fr);
	String str,lyrics = "";
	int lineCount=0;
	while ((str = br.readLine())!=null) {
		lyrics +=str+" "; //문단 합쳐질떄 한칸뛰기
		lineCount ++;
	}
	System.out.println(lyrics);
	System.out.println(lineCount);
	String[] result = lyrics.split(" ");
	System.out.println(result.length);
	HashMap<String,Integer> map = new HashMap<String, Integer>();
	for (int i = 0; i < result.length; i++) {
		if (map.get(result[i])==null) {
			map.put(result[i],1);
		}
		else 
			map.put(result[i], map.get(result[i])+1);
	}
	Set<String> s = map.keySet();
	System.out.println(s);
	System.out.println(s.size());
	Iterator<String> iter = s. iterator();
	while(iter.hasNext()) {
		String st = iter.next();
		System.out.println(st+" : "+ map.get(st));
	}
	
   }
}
