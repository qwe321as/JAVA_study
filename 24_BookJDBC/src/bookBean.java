public class bookBean {
int no;
String title;
String author;
String publisher;
int price;
String pu_day;
public bookBean() {
	
}


public bookBean(int no, String title, String author, String publisher, int price, String pu_day) {
	super();
	this.no = no;
	this.title = title;
	this.author = author;
	this.publisher = publisher;
	this.price = price;
	this.pu_day = pu_day;
}


public int getNo() {
	return no;
}
public void setNo(int no) {
	this.no = no;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getPublisher() {
	return publisher;
}
public void setPublisher(String publisher) {
	this.publisher = publisher;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getPu_day() {
	return pu_day;
}
public void setPu_day(String pu_day) {
	this.pu_day = pu_day;
}

}
