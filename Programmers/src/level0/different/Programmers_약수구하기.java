package level0.different;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programmers_약수구하기 {

	public static void main(String[] args) {
		int n = 24;
		System.out.println(Arrays.toString((solution(n))));
		
	}
	
    public static int[] solution(int n) {        
        List<Integer> answer = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(n % i == 0){
                answer.add(i);
            }
        }
        return answer.stream().mapToInt(x -> x).toArray();
    }
	
}
