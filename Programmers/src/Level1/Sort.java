package Level1;

import java.util.Arrays;
import java.util.Collections;

public class Sort {

	public static void main(String[] args) {
		String s = "ZbcdefDg";
		System.out.println(Solution.solution(s));
	}

	class Solution {
		public static String solution(String s) {
			String answer = "";
			String[] arr = s.split("");
			Arrays.sort(arr, Collections.reverseOrder());
			
			
			
			for(String a:arr) {
				answer += a;
			}
			
			return answer;
		}
	}

}
