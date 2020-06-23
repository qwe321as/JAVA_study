import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex11_06_FileReader {
public static void main(String[] args) {
	FileWriter fw = null;
	FileReader fr = null ;
	try {
		fw = new FileWriter("write.txt");
		fw.write("즐거운 자바수업");
		fw.flush();
	    fr = new FileReader("write.txt");
		int i;
		while ((i=fr.read())!=-1) {
			System.out.print((char)i);				
		}
		fr.close();
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	finally {
		try {
			fw.close();
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
}
