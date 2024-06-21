package ch06.problem04;

public class ExchangeApp {
	
	 public static void main(String[] args) {
		 	
			double dollar = 1000000;
			double won = 100;
	        
	        Exchange.setRate(1383.58);
	        
	        
	        //백만원을 달러로 출력
	        System.out.println("백만원은 " +Exchange.toDoller(1000000) +"달러입니다.");

	        
	        //100달러를 원으로 출력
	        System.out.println("백달러는 " +Exchange.toKRW(100)+ "원 입니다.");
	        
	        
	    }

}
