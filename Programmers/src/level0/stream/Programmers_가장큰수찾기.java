package level0.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Programmers_가장큰수찾기 {
	public static void main(String[] args) {
		int[] array = {1, 8, 3};
		System.out.println(Arrays.toString(solution(array)));		
	}

    public static int[] solution(int[] array) {
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        int max = list.stream().max(Integer::compareTo).orElse(0);
        int index = list.indexOf(max);
        return new int[] {max, index};
    }

}
