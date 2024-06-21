package Level1;

import java.util.Arrays;

public class MinusArray {

	public static void main(String[] args) {
		int[] arr = { 5, 2, 4, 6 };
		System.out.println(Arrays.toString(Solution.solution(arr)));
	}

	class Solution {
		public static int[] solution(int[] arr) {
			int[] answer = {};

			if (arr.length == 1) {
				answer = new int[] { -1 };
				return answer;
			}

			int idx = 0;
			int min = arr[0];
			for (int i = 1; i < arr.length; i++) {
				if (arr[i] < min) {
					min = arr[i];
					idx = i;

				}
			}
			

			answer = new int[arr.length - 1];
			int a=0;
			
			for (int i = 0; i < answer.length; i++) { // 전체 min -1
				for (int j = i; j < arr.length; j++) { // 전체
					a = j;
					if (j == idx) {
						break;
					}
				}
				answer[i] = a;
			}


			return answer;
		}
	}

}
