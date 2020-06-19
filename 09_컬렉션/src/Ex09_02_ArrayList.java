import java.util.ArrayList;

public class Ex09_02_ArrayList {

	public static void main(String[] args) {
		String s ="hello";
		System.out.println("s"+s.toString());
		ArrayList<String> al =new ArrayList<String>();
		System.out.println(al);
		al.add("윤아");
		al.add("태연");
		al.add("수영");
		al.add("효연");
		al.add("수영");// 중복허용
		
		System.out.println("a1 : "+al.toString()); //참조변수민, tostring 같음
		System.out.println("al.size"+al.size());
		System.out.println("al.get"+al.get(1));
		al.add(1,"서현");
		System.out.println(al);
//		length :배열의 방의갯수
//		length() :문자배열의 방의갯수
//		size():컬렉션의 저장공간크기
		ArrayList<String> add = new ArrayList<String>();
		add.add("아이유");
		add.add("수지");
		al.addAll(add);
		System.out.println(al.toString());
		String str = al.remove(1);
		boolean b = al.remove("수영");//지울떄 위치번호나요소
		al.add("수영");
		System.out.println(al.toString());
		ArrayList<String> rm = new ArrayList<String>();
		rm.add("수영");
		al.removeAll(rm);
		System.out.println(str+b);
		System.out.println(al.toString());
		System.out.println(al.size());
		int pos = al.indexOf("효연");
		System.out.println(pos);
		pos = al.indexOf("웬디");
		System.out.println(pos);
		boolean isEx=al.contains("효연");
		System.out.println(isEx);
		isEx = al.contains("웬디");
		System.out.println(isEx);
		al.set(1, "유리");
		System.out.println(al);
		al.clear();
		System.out.println(al.toString());
		System.out.println(al.size());
	
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(10);
		al2.add(20);
		al2.add(30);
		System.out.println(al2.toString());
		System.out.println(al2.size());
		System.out.println(al2.get(1));
		pos = al.indexOf("효연");
		System.out.println(pos);

	}
}
