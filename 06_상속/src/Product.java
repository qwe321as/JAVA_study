class Product{
	int price;
	String name;
	Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	void show() {
		System.out.println("��ǰ��1: "+name+" ���� :"+price);
	}
}