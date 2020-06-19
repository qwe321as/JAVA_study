package ¿¹Áö;
class Parent{
	//	String name;
	//	Parent(String name){
	//		this.name = name;
	//	}
	String nation;
	Parent(){
		this("´ëÇÑ¹Î±¹");
		System.out.println("Parent() call");		
	}
	Parent(String nation){
		this.nation = nation;
		System.out.println("Parent(string nation) call");
	}
}
class Child extends Parent{
	private String name;
	Child(){
		this("È«±æµ¿");
		System.out.println("child() call");
	}
	Child(String name){
		this.name = name;
		System.out.println("Child(String name) call");		
	}
}
public class Ex {
	public static void main(String[] args) {
		Child child = new Child();
	}
}
