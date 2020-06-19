class Book{
	private String title; 
	private int price; 
	Book(String title, int price){
		this.title= title;
		this.price =price;

	}
	public Book() {
		// TODO Auto-generated constructor stub
	}
	void display() {
		System.out.println("title: " + title);
		System.out.println("price: " + price);
	}
	void setTitle(String title) {
		this.title=title;
	}
	void setPrice(int price) {
		this.price=price;
	}
	String getTitle() {
		return title;
	}
	int getPrice() {
		return price;
	}
}


public class Ex05_18_객체배열 {

	public static void main(String[] args) {
		int a=1,b=2, c=3;
		int[] arr = {a,b,c};
		int[] arr1=new int[] {a,b,c};
		int[] arr2=new int [3];
		arr2[0]=a;
		arr2[1]=b;
		arr2[2]=c;

		Book b1 = new Book("자바",1000);
		Book b2 = new Book("HTML",2000);
		b1.display();
		b2.display();
		System.out.println();
//		Book[]bk=new Book[3];
//		bk[0]=new Book("자바",1000);
//		bk[1]=new Book("HTML",2000);
//		bk[2]=new Book();
		Book[]bk= {
				new Book("자바",1000),
				new Book("HTML",2000),
				new Book()
		};
		bk[2].setTitle("PHP");
		bk[2].setPrice(3000);
		bk[0].display();
		bk[1].display();
		bk[2].display();
		System.out.println();
		int i;
		for (i = 0; i < bk.length; i++) {
			bk[i].display();
		}
		System.out.println(bk[2].getPrice());


	}

}
