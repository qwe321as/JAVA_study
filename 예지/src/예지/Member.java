package 예지;
class Member1{
String nema;
String id;
String password;
int age;
public Member1(String name, String id) {
	System.out.println(name + id);
}

}
public class Member {

	public static void main(String[] args) {

Member1 user1 = new Member1("홍길동", "hong");
Member1 user2 = new Member1("강자바", "java");

	}
}
