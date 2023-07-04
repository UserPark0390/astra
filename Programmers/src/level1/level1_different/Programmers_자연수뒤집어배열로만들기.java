package level1.level1_different;

import java.util.Arrays;

public class Programmers_자연수뒤집어배열로만들기 {
	public static void main(String[] args) {
		long n = 123456789;
		System.out.println(Arrays.toString(solution(n)));
	}
	
    public static int[] solution(long n) {
    	return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
    }
}
