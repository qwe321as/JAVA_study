import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex08_8_Date {
public static void main(String[] args) {
	Date now = new Date();
//	Date now = new Date(120,1,17);//1900���Ѱ� �⵵ ���� 0���ͽ��� 
//	Date now = new Date("2020/06/17");//���ڿ��ϋ� �������
	System.out.println(now);
	System.out.println(now.toString());//��������
	System.out.println(now.getMonth());
	System.out.println(now.getDay()); //��������
	System.out.println(now.getDate());
	System.out.println(now.getMinutes());
	
	SimpleDateFormat sdf1, sdf2,sdf3; //���ϴ´�� ���� ���伳���ϰ������ ���
	sdf1 = new SimpleDateFormat("yy-MM-d�� E����");
	System.out.println(sdf1.format(now));
	sdf2 = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss a");
	System.out.println(sdf2.format(now));
	sdf3 = new SimpleDateFormat("yyyy�� MM�� dd�� a hh�� mm�� ss�� ");
	System.out.println(sdf3.format(now));

}
}
