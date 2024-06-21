package ch06.sec08.exam01;

import java.util.Scanner;

public class CalculatorExample {
	public static void main(String[] args) {
		//Calculator 객체 생성
		Calculator myCalc = new Calculator();
		
		//리턴값이 없는 powerOn 메소드 호출
		myCalc.powerOn();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("x값 >> ");
		int x = sc.nextInt();
		System.out.print("y값 >> ");
		int y = sc.nextInt();

		//plus 메소드 호출시 5와 6을 매개값으로 제공하고, 
		//덧셈 결과를 리턴받아 result1 변수에 대입
		int plus = myCalc.plus(x, y);
		System.out.println("plus: " + plus);
		
		int minus = myCalc.minus(x, y);
		System.out.println("minus: " + minus);
		

		//divide 메소드 호출시 변수 x와 y의 값을 매개값으로 제공하고,
		//나눗셈 결과를 리턴받아 result2 변수에 대입
		double divide = myCalc.divide(x, y);
		System.out.println("divide: " + divide);
		
		int multi = myCalc.multi(x, y);
		System.out.println("multi: " + multi);

		//리턴값이 없는 powerOff 메소드 호출
		myCalc.powerOff();
	}
}

