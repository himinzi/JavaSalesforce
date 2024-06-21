package ch05.sec12;

public class Example {
	public static void main(String[] args) {
		int[] la = {10, 20, 30};
		int[] ra = {10, 20, 30};
		
		System.out.println("left array 길이(갯수): " + la.length);
		System.out.println("right array 길이(갯수): " + ra.length);
		
		if(la.length == ra.length) {
			System.out.println("두 배열의 길이가 같습니다.");
		}
		
		boolean same = false;
		
		for(int i=0; i<la.length; i++) {
			if(la[i] != ra[i]) {
				same = false;
				break;
			}else {
				same = true;
			}
			
		}
		
		if(same) {
			System.out.println("두 배열이 같습니다.");
		}else {
			System.out.println("두 배열이 다릅니다.");
		}
		
		System.out.println("프로그램 종료");
	}
	
}
