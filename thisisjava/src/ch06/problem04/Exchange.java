package ch06.problem04;

public class Exchange {
	 public static double rate;
	    
	    public static void setRate(double r){
	    	Exchange.rate = r;
	    }
	    
	    public static double toDoller(double won){
	        return won / rate;
	    }

	    public static double toKRW(double dollar){
	        return dollar * rate;
	    }

}
