package ch06.sec09;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car("포르쉐");
		Car yourCar = new Car("벤츠");
		Car myCar2 = new Car();
		
		myCar2.setModel("현미차");
		
		myCar2.run();
		myCar.run();
		yourCar.run();
	}
}
