import java.util.ArrayList;
import java.util.Scanner;
//Object -> public String toString()
class Person{
	String id;
	String pw;
	
	public Person(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	} 
	public String toString() {
		return id+"/"+pw;
	}
}

public class Ex09_04_ArrayList {
	public static void main(String[] args) {

//		Person p1 = new Person("kim","1234");
//		Person p2 = new Person("park","5678");
//		Person p3 = new Person("choi","9999");
		
		Person[] p = {new Person("kim","1234"),
						new Person("park","5678"),
						new Person("choi","9999")
					};
		
		
		ArrayList<Person> list = new ArrayList<Person>();
//		list.add(p1);
//		list.add(p2);
//		list.add(new Person("choi","9999"));
		int i;
		for(i=0;i<p.length;i++) {
			list.add(p[i]);
		}
		
		System.out.println(list.toString());
		System.out.println(list.get(1));
		Person one = list.get(1);
		System.out.println("one:"+one.toString());
		
		for(i=0;i<p.length;i++) {
			System.out.println(list.get(i));
		}
		
		
		Scanner sc = new Scanner(System.in);
		
		String retry;
		while(true) {
			System.out.print("ID:");
			String id = sc.next();
			System.out.print("PW:");
			String pw = sc.next();
//			Person per = new Person(id,pw);
//			list.add(per);
			list.add(new Person(id,pw));
			System.out.print("계속?");
			retry = sc.next(); 
			if(!retry.equals("y"))
				break;
				
		}
		System.out.println(list.toString());
		System.out.println(list.size());
		for(i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//			Person imsi = list.get(i);
//			System.out.println(imsi); // imsi.toString()
//			System.out.println(imsi.id +":" + imsi.pw);
			
			System.out.println(list.get(i).id +"::" + list.get(i).pw);
			
		}
		
		
//		[kim/1234, park/5678, choi/9999]
//		park/5678
//		one:park/5678
//		kim/1234
//		park/5678
//		choi/9999
//		여기부터 과제시작
//		ID:jung
//		PW:1212
//		계속?y
//		ID:won
//		PW:9988
//		계속?n
//		[kim/1234, park/5678, choi/9999, jung/1212, won/9988]

						
	}
}








