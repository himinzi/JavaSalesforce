package Level1;

import java.util.Arrays;

public class ArrayList {
	public static void main(String[] args) {
		int[] arr = { 5, 9, 20, 1, 15 };
		System.out.println(Solution.solution(arr, 5));
	}

	class Solution {
		public static int[] solution(int[] arr, int divisor) {
			int[] answer = {};
			int cnt = 0;

			for (int n : arr) {
				if (n % divisor == 0) {
					cnt++;
				}
			}

			if (cnt == 0) {
				return answer = new int[] { -1 };
			}

			answer = new int[cnt];

			int where = 0;
			for (int j = 0; j < answer.length; j++) {
				for (int i = where; i < arr.length; i++) {
					if (arr[i] % divisor == 0) {
						where = i + 1;
						answer[j] = arr[i];
						break;
					}
				} // end of for j
			} // end of for i

			
			// 정렬
			int t = answer[0];
			for (int i = 0; i < answer.length; i++) {
				for (int j = i + 1; j < answer.length; j++) {
					if (answer[i] > answer[j]) {
						t = answer[i];
						answer[i] = answer[j];
						answer[j] = t;
					}
				}
			}
			return answer;
		}
	}

}
