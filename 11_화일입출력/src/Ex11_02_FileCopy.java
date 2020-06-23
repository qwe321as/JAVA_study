import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex11_02_FileCopy {
	public static void main(String[] args) {

		try {
			FileInputStream fis = 
					new FileInputStream("from.txt");
			FileOutputStream fos = new FileOutputStream("to.txt");
			
			// false : 없으면 하나 생성됨, 있으면 화일안의 내용 다 지우고 새로 만들어진다.
			// true : 없으면 하나 생성됨, 있으면 기존 내용뒤에 추가된다.
			
			
			while(true) {
				int i = fis.read(); // H:72
				if (i==-1) {
					break;
				}
				System.out.print((char)i);
				fos.write(i);
				
			}
			
			fis.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}











