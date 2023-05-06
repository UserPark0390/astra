package level0.solution;

public class Programmers_7의개수 {
	public static void main(String[] args) {
		int[] array = {10, 29};
		System.out.println(solution(array));
	}

	public static int solution(int[] array) {
		int answer = 0;
		for (int i = 0; i < array.length; i++) {

			String str = String.valueOf(array[i]);
			char[] ch = str.toCharArray();
			for (int j = 0; j < ch.length; j++)
				if (ch[j] == '7') {
					answer++;
				}
		}

		return answer;
	}

}
