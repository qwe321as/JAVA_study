
public class Bean {
	private int id;
	private int likenum;
	private String name;
	private String email;
	private int fcode;
	private String food;
	
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public int getFcode() {
		return fcode;
	}
	public void setFcode(int fcode) {
		this.fcode = fcode;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getLikenum() {
		return likenum;
	}
	public void setLikenum(int likenum) {
		this.likenum = likenum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Bean(int id, int likenum, String name, String email, int fcode) {
		super();
		this.id = id;
		this.likenum = likenum;
		this.name = name;
		this.email = email;
		this.fcode = fcode;
	}

	public Bean() {
	}

}
