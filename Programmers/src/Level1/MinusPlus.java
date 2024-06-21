package Level1;

public class MinusPlus {
	public static void main(String[] args) {
		System.out.println(Solution.solution("1234"));
		System.out.println(Solution.solution("-1234"));

	}

	class Solution {
		public static int solution(String s) {
			int answer = 0;
			int sign = 1;
			String sNum = "";

			if (s.charAt(0) == '-') {
				for (int i = 1; i < s.length(); i++) {
					sNum += s.charAt(i);
					sign = -1;
				}
			} else {
				sNum = s;
			}
			
			answer = Integer.parseInt(sNum)*sign;

//	       if(s.charAt(0) == '-'){
//	           for(int i=1; i<s.length(); i++){
//	               System.out.println("charAt : "+s.charAt(i));
//	               System.out.println(Math.pow(10, (s.length()-i-1)));
//	               System.out.println(i + " : " +answer);
//	               answer -= s.charAt(i)*Math.pow(10, (s.length()-i-1));
//	           }
//	       }else{
//	           for(int i=0; i<s.length()-1; i++){
//	               answer += s.charAt(i)*Math.pow(10, (s.length()-i-1));
//	           }
//	       }

			return answer;
		}
	}
}
