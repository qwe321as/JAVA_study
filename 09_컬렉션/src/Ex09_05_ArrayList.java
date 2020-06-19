import java.util.ArrayList;
import java.util.Scanner;

class Music{
	private String title;
	private String singer;
	private int price;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	Music(String title,String singer,int price){
		this.title = title;
		this.singer = singer;
		this.price = price;
	}
	public String toString() {
		return title+"/"+singer+"+"+price;
	}
}
public class Ex09_05_ArrayList {
	public static void main(String[] args) {
		ArrayList<Music> list = new ArrayList<Music>();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("����: ");
			String a = sc.next();
			System.out.print("����: ");
			String b = sc.next();
			System.out.print("����: ");
			int c = sc.nextInt();
			list.add(new Music(a,b,c));
			System.out.print("���? ");
			String retry = sc.next(); 
			if(!retry.equals("y"))
				break;
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getTitle() +" " + list.get(i).getSinger()+" "+list.get(i).getPrice());
			System.out.println(list.toString());
		}
		String search;
		boolean flag =false;
		while(true){
			flag=false;
			System.out.print("ã�� ���� �Է�: ");
			search= sc.next();
			for (int i = 0; i < list.size(); i++) {
				if(search.equals(list.get(i).getTitle())) {
					System.out.println("������ :"+list.get(i).getSinger());
					flag=true;
					break;}
			}
			if (flag==false) {			
				System.out.println("�������� �ʴ� �����Դϴ�.");
			}
			System.out.print("���?");
			String retry = sc.next(); 
			if(!retry.equals("y")) {
				System.out.println("�����մϴ�.");
				break;}
		}
	}

}
