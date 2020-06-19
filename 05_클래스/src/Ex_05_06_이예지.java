class Pay{
	String name;
	int bonbong;
	int tex;
	int silsu;
//	int set_silsu(int a,int b) {
//		 return a-b;
//	 }
	void set_silsu() {
		silsu=bonbong-tex;
		//return;
	}
	double set_tex(int a)  {
		if (a>=3000000) {
		return a*0.03;
}
		else if (a>=2000000) {
			return a*0.02;
}
		else if (a>=1000000){
			return a*0.01;
			}
		else{
			return 0;
			} 
}
	void print() {
		System.out.println("이름: " + name);
		System.out.println("급여: " + bonbong);
		System.out.println("세금: " + tex);
		System.out.println("수령액: " + silsu);

	}

}

//	세금설정함수(본봉받기) 
//	본봉 300만원 이상 세금 3%
//	본봉 200만원 이상 세금 2%
//	본봉 100만원 이상 세금 1%
//	실수령액계산
//	silsu=본봉 -세금


public class Ex_05_06_이예지 {

	public static void main(String[] args) {
		Pay p1 = new Pay();	
		Pay p2 = new Pay();	
		Pay p3 = new Pay();	

		p1.name = "하늘";
		p1.bonbong = 2000000;
		p2.name = "땅";
		p2.bonbong = 1000000;
		p3.name = "별";
		p3.bonbong = 5000000;

		p1.tex = (int)p1.set_tex(p1.bonbong);
//		p1.silsu = p1.set_silsu(p1.bonbong, p1.tex);
		p1.set_silsu();
		p1.print();
		p2.tex = (int)p2.set_tex(p2.bonbong);
//		p2.silsu = p2.set_silsu(p2.bonbong, p2.tex);
		p2.set_silsu();
		p2.print();
		p3.tex = (int)p3.set_tex(p3.bonbong);
		p3.set_silsu();
//		p3.silsu = p3.set_silsu(p3.bonbong, p3.tex);
		p3.print();
	
		}

}
