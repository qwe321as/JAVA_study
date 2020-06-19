import java.util.Calendar;

public class Ex08_09_Calendar {
public static void main(String[] args) {
//	Calendar cal = new Calendar();//protected 여서같은패키지, 다른패키지의 자식 클래스만 접근가능하다.
 	Calendar cal = Calendar.getInstance();//객체리턴 
 	System.out.println(cal);//날짜에대한 온갖정보
 	System.out.print("오늘 날짜는 "+ cal.get(Calendar.YEAR)+"년");
 	System.out.print(cal.get(Calendar.MONTH)+1+"월");
 	System.out.print(cal.get(Calendar.DATE)+"일");
 	System.out.println(cal.get(Calendar.DAY_OF_WEEK)+"요일");
 	String [] week = {" ", "일", "월","화", "수","목", "금","토"};
 	System.out.println(week[cal.get(Calendar.DAY_OF_WEEK)]+"요일");
}

}
