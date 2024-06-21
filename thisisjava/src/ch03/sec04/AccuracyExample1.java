package ch03.sec04;

public class AccuracyExample1 {
	public static void main(String[] args) {
		int apple = 1;
//		double pieceUnit = 0.1;
		int totalPiece = apple * 10; // 가능하면 정수연산을 하면 정확한 값을 얻을 수 있음
		int number = 7;
		
		int result = totalPiece - number;
//		double result = apple - number*pieceUnit; 
		// 부동소수점 연산때문에 값이 0.29999999999999993으로 나옴
		// float 으로 바꾸면 정확히 나옴
		System.out.println("사과 1개에서 남은 양: " + result);
		System.out.println("사과 10조각에서 남은 조각: " + result/10.0);
	}
}
