package Level1;

public class Center {

	public static void main(String[] args) {
		System.out.println(Solution.solution("abcd"));
	}

//	substr(a,b) : a 는 시작값, B는 길이, a번째 부터 b 길이만 잘라내서 표시
//	Substring(a, b) : a는 시작값, b는 종료값, a 번째부터 b번째 전까지 잘라내서 표시
//	※substr() 에서는 b 번째가 아닌 b 길이 만큼까지 잘라내므로 차이가 있다.
//	slice(a, b) : a는 시작값, b는 종료값, a 번째부터 b번째 전까지 잘라내서 표시

	class Solution {
		public static String solution(String s) {
			String answer = "";
			int idx = 0;
			if (s.length() % 2 == 0) {
				idx = s.length() / 2 - 1; // 4 -> 1
				answer = Character.toString(s.charAt(idx)) + Character.toString(s.charAt(idx + 1));
			} else {
				idx = ((s.length() + 1) / 2) - 1; // 5 -> 2
				answer = Character.toString(s.charAt(idx));
			}

			return answer;
		}
	}

}
