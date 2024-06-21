package ch06.sec08.exam01;

// 여기 생성자는 적어주지 않았기때문에, 기본생성자가 자동으로 만들어짐!!
public class Calculator {
	//리턴값이 없는 메소드 선언
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	//리턴값이 없는 메소드 선언
	void powerOff() {
		System.out.println("전원을 끕니다");
	}
	
	//호출시 두 정수 값을 전달 받고,	
	//호출한 곳으로 결과값 int를 리턴하는 메소드 선언
	int plus(int x, int y) {
		int result = x + y;
		return result;   //리턴값 지정;
	}
	
	int minus(int x, int y) {
		int result = x-y;
		return result;
	}
	
	//호출시 두 정수 값을 전달 받고,
	//호출한 곳으로 결과값 double을 리턴하는 메소드 선언
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;   //리턴값 지정;
	}
	
	int multi(int x, int y) {
		int result = x*y;
		return result;
	}
	
}

