package ch03.sec07;

public class LogicalOperatorExample {
	public static void main(String[] args) {
		int charCode = 'A'; // ASCII 코드 값을 넣음
//		int charCode = 'a';
//		int charCode = '5';
		
		System.out.println("charCode => " + charCode + " <=");
		
		if( (65<=charCode) & (charCode<=90) ) {
			System.out.println("대문자이군요");
		}
		
		if( (97<=charCode) & (charCode<=112) ) {
			System.out.println("소문자이군요");
		}
		
		if( (48<=charCode) & (charCode<=57) ) {
			System.out.println("0~9 숫자이군요");
		}
		
		// -------------------------------------
		
		//int value = 6;
		int value =7;
		
		if( (value%2==0) | (value%3==0) ) {
			System.out.println("2 또는 3의 배수군요.");
		}
		
		boolean result = (value%2==0) || (value%3==0);
		if(!result) {
			System.out.println("2 또는 3의 배수가 아니군요.");
		}
		
		byte num1 = 45;
		byte num2 = 25;
//		byte result = num1 & num2; // error
		int result11 = num1 & num2;
		int result12 = num1 | num2;
		int result13 = num1 ^ num2;
		System.out.println("result11: " + result11+" result12: " + result12 +" result13: " + result13);
		
		
		
	}

}
