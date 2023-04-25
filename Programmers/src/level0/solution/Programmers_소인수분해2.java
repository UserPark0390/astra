package level0.solution;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Programmers_소인수분해2 {
	public static void main(String[] args) {
		int n = 12;
		System.out.println(Arrays.toString(solution(n)));
	}
	
    public static int[] solution(int n) {
        LinkedHashSet<Integer> primeNumbers = new LinkedHashSet<>();

        int i = 2;
        while (n != 0 && i <= n) {
            if (n % i == 0) {
                primeNumbers.add(i);
                n /= i;
            } else {
                i++;
            }
        }

//        System.out.println(primeNumbers);

        return primeNumbers.stream().mapToInt(Integer::intValue).toArray();
    }
	
}
