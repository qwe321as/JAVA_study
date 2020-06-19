import java.util.ArrayList;

public class Ex09_03_ArrayList {
	public static void main(String[] args) {
		ArrayList<String> fr = new ArrayList<String>();
		fr.add("banana");
		fr.add("Orange");
		fr.add("apple");
		System.out.println(fr.toString());
		fr.add(2, "melon");
		System.out.println(fr.toString());
	}
}

