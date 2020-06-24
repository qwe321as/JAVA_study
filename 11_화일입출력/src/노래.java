import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class ³ë·¡ {
	public static void main(String[] args)throws Exception  {
//		String lyrics = "When I find myself"+
//				"in times of trouble"+
//				"Mother Mary comes to me"+
//				"Speaking words of wisdom let it be"+
//				"And in my hour of darkness"+
//				"She is standing right in front of me"+
//				"Speaking words of wisdom let it be"+
//				"Let it be let it be"+
//				"Let it be let it be"+
//				"Whisper words of wisdom let it be"+
//				"And when the broken hearted people"+
//				"Living in the world agree"+
//				"There will be an answer let it be"+
//				"For though they may be parted"+
//				"There is still a chance that"+
//				"they will see"+
//				"There will be an answer let it be"+
//				"Let it be let it be"+
//				"Let it be let it be"+
//				"Yeah there will be an answer let it be"+
//				"Let it be let it be"+
//				"Let it be let it be"+
//				"Whisper words of wisdom let it be"+
//				"Let it be let it be"+
//				"Ah let it be yeah let it be"+
//				"Whisper words of wisdom let it be"+
//				"And when the night is cloudy"+
//				"There is still a light"+
//				"that shines on me"+
//				"Shine on until tomorrow let it be"+
//				"I wake up to the sound of music"+
//				"Mother Mary comes to me"+
//				"Speaking words of wisdom let it be"+
//				"Let it be let it be"+
//				"Let it be yeah let it be"+
//				"Oh there will be an answer let it be"+
//				"Let it be let it be"+
//				"Let it be yeah let it be"+
//				"Whisper words of wisdom let it be";
		FileReader fr= new FileReader("lyrics.txt");
		BufferedReader br = new BufferedReader(fr);
		String str,lyrics = "";
		int lineCount =0;
		while ((str =br.readLine())!=null) {
//			System.out.println(str);
			lyrics +=str+" ";
			lineCount++;
		}
		System.out.println(lyrics);
		System.out.println(lineCount);
		String[] result =lyrics.split(" ");
		System.out.println(result.length);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < result.length; i++) {
			if (map.get(result[i])==null) {
				map.put(result[i],1);
			}
			else
//				Integer n =map.get(result[i]);
			map.put(result[i], map.get(result[i])+1);		
			
	}
		Set<String> s =map.keySet();
		System.out.println(s);
		System.out.println(s.size());
		Iterator<String> iter = s.iterator();
		while(iter.hasNext()) {
			String st = iter.next();
			System.out.println(st+" : "+map.get(st));
		}
		}
	

}
