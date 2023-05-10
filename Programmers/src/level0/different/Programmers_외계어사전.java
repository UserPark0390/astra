package level0.different;

public class Programmers_외계어사전 {
	public static void main(String[] args) {
		String[] spell = { "z", "d", "x" };
		String[] dic = { "def", "dww", "dzx", "loveaw" };
		System.out.println(solution(spell, dic));
	}

	public static int solution(String[] spell, String[] dic) {
		int answer = 2;

		for (String dicS : dic) {

			boolean isRight = true;
			for (String spellS : spell) {
				if (dicS.indexOf(spellS) == -1) {
					isRight = false;
					break;
				}
			}

			if (isRight) {
				answer = 1;
				break;
			}
		}

		return answer;
	}

}
