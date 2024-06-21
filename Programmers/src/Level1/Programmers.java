package Level1;

public class Programmers {

	public static void main(String[] args) {
		int[] bandage = { 5, 1, 5 };
		int health = 30;
		int[][] attacks = {{ 2, 10 }, { 9, 15 }, { 10, 5 }, { 11, 5 } }; // 516 86 { 2, 10 }, { 9, 15 }, { 10, 5 }, { 11, 5 }

		System.out.println(Solution.solution(bandage, health, attacks));

	}

	static class Solution {
		public static int solution(int[] bandage, int health, int[][] attacks) {

			int answer = 0;

			int t = bandage[0]; // 시전 시간
			int x = bandage[1]; // 초당 회복량
			int y = bandage[2]; // 추가 회복량

			answer = health; // 최대체력

			int attackTime = 0; // 이전 공격시간
			// 전체 시간 돌리기
			for (int i = 1; i <= attacks[attacks.length - 1][0]; i++) { // 1~11초 순서대로

				for (int j = 0; j < attacks.length; j++) {

					//System.out.println(attacks[j][1]);
					// 공격 시간 == 현재 시간이면 체력 - , 만약 체력이 0이하가 되면 종료 (return -1)
					if (attacks[j][0] == i) {
						System.out.println("공격 : "+ attacks[j][1] );
						answer -= attacks[j][1];
						if (answer <= 0) {
							return answer = -1;
						}
						attackTime = i; // attackTime에 현재 공격당한 시간 넣어주기 : 추가회복량 계산
						// 공격 시간, 현재시간 다를 때 초당 x 만큼 체력 더하기
					} 

				} // end of for j
				System.out.println("초당회복량"+x);
				if(attackTime != i) {
					answer += x;
					if((i - attackTime) == t) {
						answer +=y;
						attackTime = i;
					}
				}
				
				if(answer >= health) {
					answer = health;
				}

				System.out.println(answer);
			} // end of for i
			return answer;
		}
	}

}
