import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex11_09_Scanner {
public static void main(String[] args) throws FileNotFoundException {
	File f = new File("data.txt");	
	Scanner sc = new Scanner(f);
	sc.useDelimiter(" ");
	int sum = 0 ,num;
	while(sc.hasNextInt()) {
		num = sc.nextInt();
		System.out.print(num+ " ");
		sum += num;
	}
	System.out.println(sum);
}
}
