import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex08_8_Date {
public static void main(String[] args) {
	Date now = new Date();
//	Date now = new Date(120,1,17);//1900더한게 년도 월은 0부터시작 
//	Date now = new Date("2020/06/17");//문자열일떈 상관없음
	System.out.println(now);
	System.out.println(now.toString());//참조변수
	System.out.println(now.getMonth());
	System.out.println(now.getDay()); //요일정보
	System.out.println(now.getDate());
	System.out.println(now.getMinutes());
	
	SimpleDateFormat sdf1, sdf2,sdf3; //원하는대로 날자 포멧설정하고싶을때 사용
	sdf1 = new SimpleDateFormat("yy-MM-d일 E요일");
	System.out.println(sdf1.format(now));
	sdf2 = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss a");
	System.out.println(sdf2.format(now));
	sdf3 = new SimpleDateFormat("yyyy년 MM월 dd일 a hh시 mm분 ss초 ");
	System.out.println(sdf3.format(now));

}
}
