package Level1;

public class SearchPlus {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 6, 7, 8, 0 };
		
		System.out.println(Solution.solution(arr));
	}

	class Solution {
		public static int solution(int[] numbers) {
			int answer = 0;

			for (int i = 1; i <= 9; i++) {
				boolean check = false;
				for (int n : numbers) {
					if (n != i) {
						check = true;
					}else {
						check = false;
						break;
					}
				}
				if (check) {
					answer += i;
				}

			} // end of i

			return answer;
		}
	}

}
