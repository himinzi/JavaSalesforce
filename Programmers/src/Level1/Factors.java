package Level1;

public class Factors {
	public static void main(String[] args) {
		System.out.println(Solution.solution(5));
	}

	class Solution {
		public static int solution(int n) {
			int answer = 0;
			
			for(int i=1; i<=n; i++) {
				if(n%i == 0) {
					System.out.println(i);
					answer += i;
				}
			} // end of for i
			
			return answer;
		}
	}
}
