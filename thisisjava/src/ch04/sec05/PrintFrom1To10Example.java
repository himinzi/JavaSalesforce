package ch04.sec05;

public class PrintFrom1To10Example {
	public static void main(String[] args) {
		int i =1;
		while(i <= 10) {
			System.out.println(i + " ");
			i++;
		}
		
		for(;;) {
			if(!(i<=10)) {
				break;
			}
			System.out.println(i+ " ");
			i++;
		}
		
		i = 1;
		while(true) {
			if(!(i <= 10)) {
				break;
			}
			System.out.println(i + " ");
			i++;
		}
	}
}
