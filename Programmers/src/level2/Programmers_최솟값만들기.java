package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

// 다시 풀어보기
public class Programmers_최솟값만들기 {
	public static void main(String[] args) {
		int[] A = {1, 4, 2};
		int[] B = {5, 4, 4};
		System.out.println(solution(A, B));
	}

	public static int solution(int[] A, int[] B) {
		int answer = 0;
		List<Integer>list = new ArrayList<>();
		list = Arrays.stream(B)
                .boxed()
                .collect(Collectors.toList());
		Collections.sort(list, Collections.reverseOrder());
		for(int i = 0; i < list.size(); i++) {
			B[i] = list.get(i);
		}
		for(int j = 0; j < A.length; j++) {
			answer = answer + A[j] * B[j];						
		}
		return answer;
	}
}
