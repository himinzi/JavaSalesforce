package Level1;

public class OddEven {
	public static void main(String[] args) {
		System.out.println(Solution.solution(626331));
	}
	
	class Solution {
	    public static int solution(int num) {
	        int answer = 0;
	        int cnt = 0;
	        
	        while(true){
	            if(num%2 == 0){
	                num = num/2;
	                cnt++;
	            }else{
	                num = num*3 +1;
	                cnt++;
	            }
	            
	            if(num == 1) {
	            	System.out.println(num);
	            	return answer = cnt;
	            }
	            
	            if(cnt == 500) return answer = -1;
	            
	        }
	        
	    }
	}

}
