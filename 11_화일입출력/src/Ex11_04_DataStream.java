import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex11_04_DataStream {
public static void main(String[] args) {
	try {
		FileOutputStream fos = new FileOutputStream("datastream.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		FileInputStream fis = new FileInputStream("datastream.txt");
		DataInputStream dis = new DataInputStream(fis);
		
		dos.write(65);
		dos.writeInt(123);
		dos.writeDouble(10.23);
		int i = dis.read();
		System.out.println((char)i);
		int j = dis.readInt();
		double k =dis.readDouble();
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		fis.close();
		fos.close();
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}
