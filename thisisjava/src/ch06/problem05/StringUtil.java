package ch06.problem05;

public class StringUtil {

	public static String concatString(String[] arr) {
		String answer = "";
		
		// 메소드 내용작성
		for(String s:arr) {
			answer += s;
		}
		
		return answer;
	}

}
