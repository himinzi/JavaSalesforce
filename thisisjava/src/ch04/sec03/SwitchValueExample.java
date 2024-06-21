package ch04.sec03;

public class SwitchValueExample {
	public static void main(String[] args) {
		String grade = "B";
		
		//Java 11 이전 문법
		int score = 0;
		switch(grade) {
			case "A":
				score = 100;
				break;
			case "B":
				int result = 100 - 20;
				score = result;
				break;
			default:
				score = 60;
		}
		
		System.out.println("score: " + score);
		
		
		//Java 13부터 가능
		int score1 = 0;
		switch(grade) {
			case "A" -> score1 = 100; 
			case "B" -> {
				int result = 100 - 20;
				score1 = result;
			}
			default -> score1 = 60;
		}
		System.out.println("score1: " + score1);
		
	}

}
	
