package ¿¹Áö;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.StringTokenizer;

public class OutputSTreamEX {
	public static void main(String[] args) {
		int count = 0;
		try {
			OutputStream output = new FileOutputStream("Output.txt");
			String lyrics = "When I find myself"+
					"in times of trouble"+
					"Mother Mary comes to me"+
					"Speaking words of wisdom let it be"+
					"And in my hour of darkness"+
					"She is standing right in front of me"+
					"Speaking words of wisdom let it be"+
					"Let it be let it be"+
					"Let it be let it be"+
					"Whisper words of wisdom let it be"+
					"And when the broken hearted people"+
					"Living in the world agree"+
					"There will be an answer let it be"+
					"For though they may be parted"+
					"There is still a chance that"+
					"they will see"+
					"There will be an answer let it be"+
					"Let it be let it be"+
					"Let it be let it be"+
					"Yeah there will be an answer let it be"+
					"Let it be let it be"+
					"Let it be let it be"+
					"Whisper words of wisdom let it be"+
					"Let it be let it be"+
					"Ah let it be yeah let it be"+
					"Whisper words of wisdom let it be"+
					"And when the night is cloudy"+
					"There is still a light"+
					"that shines on me"+
					"Shine on until tomorrow let it be"+
					"I wake up to the sound of music"+
					"Mother Mary comes to me"+
					"Speaking words of wisdom let it be"+
					"Let it be let it be"+
					"Let it be yeah let it be"+
					"Oh there will be an answer let it be"+
					"Let it be let it be"+
					"Let it be yeah let it be"+
					"Whisper words of wisdom let it be";	    
			byte[] by=lyrics.getBytes();
			output.write(by);
			StringTokenizer tokens = new StringTokenizer(lyrics, " " );
			HashMap<String,Integer > map = new HashMap<String, Integer>();
			System.out.println(map);
			String[] array = lyrics.split(" ");
			for(int i=0;i<array.length;i++) {
//				System.out.println(array[i]);
				for (int j = 0; j < array.length; j++) {
					if (array[i].equals(array[j])) {
						count++;
						map.put(array[i], count);
					}
					System.out.println(map);
				}
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}