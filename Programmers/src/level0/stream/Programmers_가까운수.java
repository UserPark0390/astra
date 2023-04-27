package level0.stream;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Programmers_가까운수 {
	public static void main(String[] args) {
		int[] array = {10, 14, 11, 12};
		int n = 13;
		System.out.println(solution(array, n));
	}
	
    public static int solution(int[] array, int n) {
    	 return Math.min(array[Arrays.stream(array).map(operand -> Math.abs(n - operand)).boxed().collect(Collectors.toList()).indexOf(Arrays.stream(array).map(operand -> Math.abs(n - operand)).min().orElse(0))], array[Arrays.stream(array).map(operand -> Math.abs(n - operand)).boxed().collect(Collectors.toList()).lastIndexOf(Arrays.stream(array).map(operand -> Math.abs(n - operand)).min().orElse(0))]);
    
    }
	
}
