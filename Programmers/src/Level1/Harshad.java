package Level1;

public class Harshad {

	public static void main(String[] args) {
		System.out.println(Solution.solution(11));
	}

	class Solution {
		public static boolean solution(int x) {
			boolean answer = true;
			int sum = 0;
			int num = x;

			while (true) {
				sum += x % 10;
				x /= 10;
				if (x == 0)
					break;
			}

			if (num % sum != 0)
				answer = false;

			return answer;
		}
	}

}
