import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex11_03_BufferedStream {
	public static void main(String[] args) {
		
		int  num;
		try {
			FileOutputStream fos = 
					new FileOutputStream("data.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			FileInputStream fis = 
					new FileInputStream("data.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);//임시저장소

			for(int i=1;i<9;i++) {
				//			1~8까지 화일 출력
				//			출력한 내용 읽어와서 콘솔창에 출력
				System.out.print(i);
				fos.write(i+48); // 1:1(49), 2:2(50) A:65

			} // for
			
			System.out.println();
			
			while( (num=fis.read())!=-1) {
				System.out.print((char)num+" ");
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





