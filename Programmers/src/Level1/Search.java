package Level1;

import java.util.Arrays;

public class Search {
	
	public static void main(String[] args) {
		String[] kim = {"Jane", "Kim"}	;
		System.out.println(Solution.solution(kim));
	}
	
	class Solution {
	    public static String solution(String[] seoul) {
	        String answer = "김서방은 ";
	        int x = Arrays.asList(seoul).indexOf("Kim");;
	        answer += Integer.toString(x) ;
	        answer +="에 있다.";
	        
	        return answer;
	    }
	}

}
