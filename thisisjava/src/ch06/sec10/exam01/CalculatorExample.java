package ch06.sec10.exam01;

public class CalculatorExample {
	public static void main(String[] args) {
		double result1 = 10 * 10 * Calculator.pi;
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);

		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		
		Calculator calc = new Calculator(); // new 가능 but, 객체 내부에는 아무것도 없음
		
		int result4 = calc.plus(2, 3);
		System.out.println("result4 : " + result4);
		
		calc.pi = 5.14; // 값이 아예 바뀌어버림
		
		System.out.println("calc.pi : "+calc.pi);
		
		
		Calculator calc2 = new Calculator();
		System.out.println("calc2.pi : " + calc2.pi);
		
		
	}
}
