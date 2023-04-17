package level0;

public class Programmers_짝수홀수개수 {
	public int[] solution(int[] num_list) {
		int hol = 0;
		int jak = 0;
		int[] answer = new int[2];
		for (int i = 0; i < num_list.length; i++) {
			if (num_list[i] % 2 == 0) {
				jak++;
			} else {
				hol++;
			}
		}
		answer[0] = jak;
		answer[1] = hol;
		return answer;

	}

}
