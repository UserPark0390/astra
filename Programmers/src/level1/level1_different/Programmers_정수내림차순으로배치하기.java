package level1.level1_different;

import java.util.Arrays;
import java.util.Collections;

public class Programmers_정수내림차순으로배치하기 {
	public static void main(String[] args) {
		long n = 118372;
		System.out.println(solution(n));
	}
	
    public static long solution(long n) {
        String str = ""+n;
        int[] arr = new int[str.length()];
        for(int i=0; i< str.length(); i++) {
            arr[i] = (int)(n%10);
            n/=10;
        }

        Integer[] tmp = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(tmp, Collections.reverseOrder());

        long answer = 0;
        int num = tmp.length;

        for(int i=0; i< tmp.length; i++) {
            answer += tmp[i] * (long) Math.pow(10, num-1);
            num-=1;

        }
        return answer;
    }
}
