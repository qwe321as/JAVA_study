class Product{
	int price;
	String name;
	Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	void show() {
		System.out.println("제품명1: "+name+" 가격 :"+price);
	}
}