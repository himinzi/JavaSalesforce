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
			
			int where = 0;
			
			for(int i=0; i<arr.length; i++) {
				//answer 배열을 돌면서, 해당 idx가 나오면 제외하고 값 넣어주기!
				
				if(i == idx) {
					continue;
				}
	
				answer[where] = arr[i];
				
				where ++;
				
			}

			return answer;
			
//			if(arr.length == 1){
//		          int[] answer = {-1};
//		          return answer;
//		      }
//
//		      int[] answer = new int[arr.length-1];
//		      int minIndex=0;
//
//		      for(int i=0;i<arr.length;i++){
//		          if(arr[minIndex]>arr[i]){
//		              minIndex = i;
//		          }
//		      }
//		      for(int i=minIndex+1;i<arr.length;i++){
//		          arr[i-1] = arr[i];
//		      }
//		      for(int i=0;i<answer.length;i++){
//		          answer[i] = arr[i];
//		      }
//		      return answer;
		}
	}

}
