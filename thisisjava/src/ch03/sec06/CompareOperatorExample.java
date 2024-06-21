package ch03.sec06;

public class CompareOperatorExample {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);
		
		char char1 = 'A';
		char char2 = 'B';
		boolean result4 = (char1 < char2); // 65 < 66
		System.out.println("result4: " + result4);
		
		int num3 = 1;
		double num4 =1.0;
		boolean result5 = (num3 == num4); // int 가 double 로 바뀌어서 연산
		System.out.println("result5: " + result5);
		
		float num5 = 0.1f;
		double num6 = 0.1;
		boolean result6 = (num5 == num6); // false : float 이 double 로 형변환 됨
		// : 부동 소수점 방식을 사용하는 실수타입은 0.1을 정확히 표현할 수 없음 + float 타입과 double 타입의 정밀도 차이
		boolean result7 = (num5 == (float)num6);
		System.out.println("result6: " + result6);
		System.out.println("result7: " + result7);
		
		String str1 = "자바";
		String str2 = "Java";
		boolean result8 = (str1.equals(str2));
		boolean result9 = (!str1.equals(str2));
		System.out.println("result8: " + result8);
		System.out.println("result9: " + result9);
		
		boolean result10 = (str1 == str2);
		System.out.println("result10: " + result10); // 오류없고 값도 맞지만, 이렇게 하면 나중에 큰일날수잇음..
	}
}
