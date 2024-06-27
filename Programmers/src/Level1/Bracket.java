package Level1;

import java.util.ArrayList;
import java.util.List;

public class Bracket {
	public static void main(String[] args) {
//		(())()  (()()())
		System.out.println(Solution.solution("()()()()()"));
	}

	class Solution {
		static boolean solution(String s) {
			
			if(s.charAt(0) == ')') return false;

	        boolean answer = true;

	        List<Character> list = new ArrayList<>();
	        list.add('(');

	        for(int i = 1; i < s.length(); i++){
	            char c = s.charAt(i);
//	            System.out.println(c);
	            if(list.size() <= 0){
	                if(c == ')') return false;
	                list.add(c);
	            } else if(list.get(list.size()-1) == c) {
	                list.add(c);
	            } else {   
	                list.remove(list.size()-1);
	            }
	        }

	        return list.size() > 0 ? false : true;
	        
			/*boolean answer = true;
			String[] arr = s.split("");
			
			// 배열을 ArrayList로
			List<String> list = new LinkedList<>(Arrays.asList(arr));
			// 배열을 ArrayList로
			// String[] array = arrayList.toArray(new String[arrayList.size()]);
			
//			System.out.println(Arrays.deepToString(list.toArray()));
//			System.out.println(list.size());]]]
			
			int cnt = 0;
			for(String k:arr) {
				if(k.equals("(")) {
					cnt++;
				}else {
					cnt--;
				}
			}
			
			if(cnt != 0) return false;

			
			boolean run = true;
			while(run) {
				int length = list.size();
				System.out.println(length);
				
				if(length == 0) break;
				for(int i=0; i<length; i++) { // 0 1 / 1 2 / 2 3 / 3 4 / 4 5 / 5 6  
					if(i+1 == length) {
						run = false;
						break;
					}
					if(list.get(i).equals("(") && list.get(i+1).equals(")")) {
						list.remove(i);
						list.remove(i); // 앞으로 당겨지기 때문!
						break;
					}
//					System.out.println("실행?");
				}
//				System.out.println(Arrays.deepToString(list.toArray()));
//				Stream<String> stream = list.stream();
//				stream.forEach(a -> System.out.print(a));
			}

			if(list.size() != 0) {
				answer = false;
			}
			
			return answer;*/

		}
	}

}
