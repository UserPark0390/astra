package level0.different;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Programmers_소인수분해 {
	public static void main(String[] args) {
		int n = 12;
		System.out.println(Arrays.toString(solution(n)));
	}
	
    public static Integer[] solution(int n) {
        Set<Integer> hashSet = new HashSet<>();
        int factor = n;
        int divisor = 2;

        while (factor >= 2) {
            if (factor % divisor == 0) {
                factor /= divisor;
                hashSet.add(divisor);
            } else {
                divisor++;
            }
        }
        return hashSet.toArray(new Integer[0]);
    }
	
}
