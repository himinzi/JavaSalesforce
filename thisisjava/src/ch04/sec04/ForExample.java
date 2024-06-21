package ch04.sec04;

public class ForExample {
	
	public static void main(String[] args) {
		int sum = 0;
//		sum += 1;
//		sum += 2;
//		sum += 3;
//		sum += 4;
//		sum += 5;
		
		int i=1;
		for(; i<=5; ) { // 전부 생략가넝...ㄷㄷ 
			sum += i;
			i++;
		}
		
		System.out.println("sum : " + sum);
		
	}
}