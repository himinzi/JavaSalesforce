package Level1;

public class ReturnTel {
	
	public static void main(String[] args) {
		System.out.println(Solution.solution("01033334444"));
	}

	class Solution {
		public static String solution(String phone_number) {
			String answer = "";
			
			
			int index = phone_number.length()-5;
			
			for(int i=0; i<=index; i++) {
				answer += "*";
			}
			
			for(int i=index+1; i<phone_number.length(); i++) {
				answer += phone_number.charAt(i);
			}

			return answer;
		}
	}
}
