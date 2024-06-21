package Level1;

import java.util.Arrays;

public class ToStringOrder {

	public static void main(String[] args) {
		System.out.println(Solution.solution(118372));

	}

	class Solution {
		public static long solution(long n) {
			long answer = 0;
			long[] arrTemp = new long[("" + n).length()];

			for (int i = 0; i < arrTemp.length; i++) {
				arrTemp[i] = n % 10;
				n = n / 10;
			}
//	        System.out.println(Arrays.toString(arrTemp));

			// 크기비교
			long temp = 0;

			for (int i = 0; i < arrTemp.length; i++) {

				for (int j = i + 1; j < arrTemp.length; j++) {
					if (arrTemp[j] > arrTemp[i]) {
						temp = arrTemp[i];
						arrTemp[i] = arrTemp[j];
						arrTemp[j] = temp;
					}
//	        		System.out.println(Arrays.toString(arrTemp));
				} // end of for j
			} // end of for i

			for (int i = 0; i < arrTemp.length; i++) {
				answer += arrTemp[i] * Math.pow(10, (arrTemp.length - i - 1));
			}

			return answer;
		}
	}
}
