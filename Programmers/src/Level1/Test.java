package Level1;

public class Test {

	public static void main(String[] args) {
		Solution.solution("Hello");
		
	}
	
	
	static class Solution {
	   static boolean solution(String s) {
	        boolean answer = true;
	        
	        int pNum = 0;
	        int yNum = 0;
	        
	        String lower = s.toLowerCase();
	        
	        for(int i=0; i<lower.length(); i++){
	            
	        	System.out.println(lower.charAt(i));
	        	
	            if('p' == lower.charAt(i)){ // charAt 은 char 타입임!!
	                pNum++;
	            }else if('y' == lower.charAt(i)){
	                yNum++;
	            }
	        }
	        
	        if(pNum != yNum){
	            answer = false;
	        }

	        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
	        System.out.println("Hello Java");

	        return answer;
	    }
	}
}
