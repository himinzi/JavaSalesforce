package ch02.sec03;

public class CharExample {
	
	public static void main(String[] args) {
		char c1 = 'A'; // ""는 안 됨!! 완-전 타입이 다름(String), // 65
		char c2 = 65;
		
		System.out.println(c1); // A
		System.out.println(c2); // A
		
		char c3 = '힣';
		char c4 = 44032;
		
		System.out.println(c3-1); // 55202
		System.out.println(c4);
		
//		char c = ''; // 비어있으면 안 됨
		char d = ' ';
//		String s = ''; // '' 안 됨
		String ss = "";
		
		System.out.println(d);
		
		
	}

}
