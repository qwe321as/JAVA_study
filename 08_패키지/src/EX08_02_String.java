import java.util.Scanner;

public class EX08_02_String {

	public static void main(String[] args) {
		int a =1, b=2;
		System.out.println(a==b);
		String st1= new String("Have a nice day"); //A는 65
		String st2= new String("Have a nice Day"); //a는 97
		//		String st1= "Have a nice day";
		//		String st2= "Have a nice day"; 주소 똑같음
		System.out.println("str: "+st1);
		System.out.println("str길이: "+st1.length());
		System.out.println(st1.equals(st2));//문자열비교
		if (st1.equals(st2)) {
			System.out.println("st1과 st2 문자열같음");
		}
		else {
			System.out.println("st1과 st2 문자열다름");
		}
		System.out.println(st1.equalsIgnoreCase(st2));//문자열비교 대소문자달라도 트루
		System.out.println(st1==st2);// 주소비교  new로 생성시 주소 다름
		System.out.println(st1.compareTo(st2));//st1과 st2 비교 같으면 0
		System.out.println();
		System.out.println(st1.concat(st2));//문자열연결 st1+st2
		System.out.println();
		System.out.println(st1.indexOf("nice"));//st1에서의 nice위치
		System.out.println(st1.indexOf("happy"));//없으면 -1
		System.out.println(st1.lastIndexOf("a"));//뒤에서부터 위치를찾을때
		System.out.println(st1.contains("nice"));//있으면 true
		System.out.println(st1.contains("happy"));//없으면 false
		System.out.println();
		System.out.println(st1.charAt(3));//문자열 3번째 출력
		char c = st1.charAt(3);
		System.out.println("c:"+c);
		System.out.println();
		System.out.println(st1.substring(7,11));//7부터 10까지출력
		System.out.println(st1.substring(7));//7부터 끝까지출력
		System.out.println(st1.replace("a", "x"));//a에서 x로 바꿈
		System.out.println();
		String s = "   abc De       gf  ";
		System.out.println("s: "+s);
		System.out.println(s.trim());//앞뒤 공백 제거
		s=s.trim();
		System.out.println(s);
		System.out.println();
		System.out.println(s.toUpperCase());//대문자
		System.out.println(s.toLowerCase());//소문자
		System.out.println();
		String fullName="Hello.java";
		System.out.println(fullName.indexOf("."));
		String fileName;
		int pos =fullName.indexOf("."); 
		fileName=fullName.substring(0, pos);
		String ext;
		ext = fullName.substring(pos+1);
		System.out.println("화일명: "+fileName);
		System.out.println("확장자: "+ext);
		String id= "Lee";
		String pw="1234";
		Scanner sc = new Scanner (System.in);
		System.out.print("아이디입력: ");
		String inputId = sc.next();
		System.out.print("비밀번호입력: ");
		String inputPw = sc.next();
//		int ID=id.compareTo(inputId); 
//		int PW=pw.compareTo(inputPw);
//		if (ID==0&&PW==0) {
		if(id.equals(inputId)&&pw.equals(inputPw)) {
			System.out.println("로그인가능");
		}
		else{
			System.out.println("로그인불가능");
		}
		}
}
