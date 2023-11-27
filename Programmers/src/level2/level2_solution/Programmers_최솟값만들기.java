package level2.level2_solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

// 정확성 100
// 효율성 0  -> Stream은 효율적인 코드가 아님
public class Programmers_최솟값만들기 {
	public static void main(String[] args) {
		int[] A = {1, 4, 2};
		int[] B = {5, 4, 4};
		System.out.println(solution(A, B));
	}

	public static int solution(int[] A, int[] B) {
		int answer = 0;
		List<Integer>list_A = new ArrayList<>();
		List<Integer>list_B = new ArrayList<>();
		list_A = Arrays.stream(A)
                .boxed()
                .sorted()
                .collect(Collectors.toList());;
		list_B = Arrays.stream(B)
                .boxed()
                .collect(Collectors.toList());
		Collections.sort(list_B, Collections.reverseOrder());
		for(int i = 0; i < A.length; i++) {
			A[i] = list_A.get(i);
			B[i] = list_B.get(i);
			answer = answer + A[i] * B[i];						
		}
		return answer;
	}
}
