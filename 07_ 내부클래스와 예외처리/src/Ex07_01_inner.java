class Car{
	CarInfo info; //포함관계로 사용
	String color;

	class CarInfo{
		String model;
		int year;
		CarInfo(String model, int year){
			this.model = model;
			this.year = year;
		}
		void CarInfoPrint() {
			System.out.println(model+","+year);
		}
	} //내부클래스 멤버변수처럼.
	Car (String model, int year, String color){
		info = new CarInfo(model,year);
		this.color = color;
	}
	void CarPrint() {
		System.out.println(info.model+","+info.year+","+color);
		info.CarInfoPrint();
	}
}
public class Ex07_01_inner {
	public static void main(String[] args) {
		Car pride = new Car("프라이드", 2020,"파랑");
		pride.CarPrint();
		pride.info.CarInfoPrint();
	}

}
