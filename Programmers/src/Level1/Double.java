package Level1;

public class Double {

	public static void main(String[] args) {
		System.out.println(Solution.solution(11));
	}

	class Solution {
		public static long solution(long n) {
			long answer = 0;

			double num = n;
//	        if(Math.sqrt(num)*Math.sqrt(num) == num ){
			if (Math.pow((int)Math.sqrt(n), 2) == num) {
				answer = (long) (Math.pow(Math.sqrt(num) + 1, 2));
			} else {
				answer = -1;
			}
			

			return answer;
		}
	}
}
