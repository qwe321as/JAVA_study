package db¿¬½À;

public class Bean {
 private int id;
 private String name;
 private int likenum;
public Bean(int id, String name, int likenum) {
	super();
	this.id = id;
	this.name = name;
	this.likenum = likenum;
}
public Bean() {
	
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getLikenum() {
	return likenum;
}
public void setLikenum(int likenum) {
	this.likenum = likenum;
}

 
}
