class Music{
	private String title;
	private String singer;
	private String genre;
	private int price;

	public Music() {
		title="bang";
		singer="�����ͽ���";
		genre="��";
		price=20000;
	}

	public Music(String title, String singer, String genre, int price) {
		super();
		this.title = title;
		this.singer = singer;
		this.genre = genre;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	//	Music(){
	//		title="bang";
	//		singer="�����ͽ���";
	//		genre="��";
	//		price=20000;
	//	}
	//	Music(String title,String singer,String g,int p){
	//		this.title=title;
	//		this.singer=singer;
	//		genre=g;
	//		price=p; //m2�����ʱ�ȭ
	//	}

	//	void setTitle(String title){
	//		this.title=title;
	//	}
	//	String getTitle() {
	//		return title;
	//	}
	//	void setSinger(String singer){
	//		this.singer=singer;
	//	}
	//	String getSinger() {
	//		return singer;
	//	}
	//	void setGenre(String g) {
	//		genre=g;
	//	}
	//	String getGenre() {
	//		return genre;
	//	}
	//	void setPrice(int p) {
	//		price=p;
	//	}
	//	int getPrice() {
	//		return price;
	//	}
	void display () {
		System.out.println(title);
		System.out.println(singer);
		System.out.println(genre);
		System.out.println(price);
	}
	String show() {

		return title+", "+singer+", "+genre+", "+price;
	}

}
public class Ex05_17_�̿��� {

	public static void main(String[] args) {

		Music m1=new Music();// �����ڸ� ���� �ʱ�ȭ>> getter ���� ��� 


		System.out.println(m1.getTitle());
		System.out.println(m1.getSinger());
		System.out.println(m1.getGenre());
		System.out.println(m1.getPrice());

		System.out.println();

		Music m2=new Music("���̾�","��Ź","Ʈ��Ʈ",3000);
		m2.display();

		System.out.println();

		Music m3=new Music();//setter ���� �ʱ�ȭ

		m3.setTitle("�������");
		m3.setSinger("����");
		m3.setGenre("����");
		m3.setPrice(18000);
		System.out.println(m3.show());
		System.out.println();
		
		Music [] mu = new Music[3];
		mu[0]=new Music();
		mu[1]=new Music("���̾�","��Ź","Ʈ��Ʈ",3000);
		mu[2]=new Music();
		mu[2].setTitle("�������");
		mu[2].setSinger("����");
		mu[2].setGenre("����");
		mu[2].setPrice(18000);
		for (int i = 0; i < mu.length; i++) {
			System.out.println("-------------");
			System.out.println(mu[i].show());
			System.out.println("-------------");
		}

		//	m1:getter ���� ���
		//	m2: �޼��� �ȿ��� ���
		//	m3: �޼��忡�� ������� 4�� �ѹ��� ���Ϲ޾� ���
	}

}
