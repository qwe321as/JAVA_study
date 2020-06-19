//import java.util.Scanner;
import java.util.*;
import com.javastudy.Pro;
//import 패키지.패키지.클래스;
public class Ex06_06_import {
	public static void main(String[] args) {
		Pro p = new Pro("사이다",1300);
		p.show();
		Scanner sc = new Scanner(System.in);
		int result = Math.max(3, 4);
		System.out.println(result);
		Date d = new Date();
		System.out.println(d);
	}
}
