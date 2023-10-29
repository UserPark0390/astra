package level1.level1_stream;

import java.util.Arrays;

public class Programmers_제일작은수제거하기 {
	public static void main(String[] args) {
		int[] arr = {4,3,2,1};
		System.out.println(Arrays.toString(solution(arr)));				
	}
	
    public static int[] solution(int[] arr) {
        if (arr.length <= 1) return new int[]{ -1 };
        int min = Arrays.stream(arr).min().getAsInt();
        return Arrays.stream(arr).filter(i -> i != min).toArray();
    }
}
