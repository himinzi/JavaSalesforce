package Level1;

import java.util.ArrayList;
import java.util.List;

public class DivisorCnt {
	public static void main(String[] args) {
		System.out.println(Solution.solution(13, 17));
		// 제곱수로 약수의 개수를 알 수 있음!! 
	}

	class Solution {
		public static int solution(int left, int right) {
			int answer = 0;
			
			for(int i=left; i<=right; i++) {
				List<Integer> list = new ArrayList<>(); // ArrayList 라고 된 이름을 가진 class 를 생성해버리면 에러가 날 수 있음..ㅋ
				
				for(int j=1; j<=i; j++) {
					if(i%j == 0) {
						list.add(j);
//						System.out.println(j);
					}
				}
				if(list.size()%2 == 0) {
					answer += i;
//					System.out.println("plus"+i);
				}else {
					answer -= i;
//					System.out.println("minus"+i);
				}
			}
			

			return answer;
		}
	}

}
