class Car{
	CarInfo info; //���԰���� ���
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
	} //����Ŭ���� �������ó��.
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
		Car pride = new Car("�����̵�", 2020,"�Ķ�");
		pride.CarPrint();
		pride.info.CarInfoPrint();
	}

}
