package Level1;

public class Natural {
	
	public static void main(String[] args) {
		System.out.println(Solution.solution(1000000000));
	}
	
	class Solution {
	    public static int[] solution(long n) {
	        int countN = 1;
	        long num = n;
	        
	        while(true){
	            num = num/10; // 1234 123 12 1 
	            
	            if(num == 0) break;
	            
	            countN++; // 1 2 3 4 5
//	            System.out.println(countN);
//	            System.out.println(num);
	        }
	        
	        num = n;
	        
	        int[] answer = new int[countN];
	        
	        for(int i=0; i<countN; i++){
	            answer[i] += (int)(num%10);
	            num = num/10;
	        }
	        
	        return answer;
	    }
	}

}
