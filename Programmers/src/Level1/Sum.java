package Level1;

public class Sum {
	
	public static void main(String[] args) {
		Sum ss = new Sum(); // 클래스 선언문 추가
		Solution s = ss.new Solution();
		System.out.println(s.solution(1234));
		
		System.out.println(101%10);
		
	}
	public class Solution {
	    public int solution(int n) {
	        int answer = 0;
//	        
//	        String sNum = Integer.toString(n);
//	        String s = "";
//	        
//	        for(int i=0; i<sNum.length(); i++) {
//	        	
//	        	s = Character.toString(sNum.charAt(i));
//	        	answer += Integer.parseInt(s);
//	        }
//	        
//
	    	 while (n != 0) {
	             answer += n % 10;
	             System.out.println(n);
	             System.out.println(answer);
	             n /= 10;
	         }
	    	 
	        return answer;
	    	
	    }
	}

}
