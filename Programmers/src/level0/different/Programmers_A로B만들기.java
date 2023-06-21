package level0.different;

public class Programmers_A로B만들기 {
	public static void main(String[] args) {
		String before = "allpe";
		String after = "apple";
		System.out.println(solution(before, after));
	}

	public static int solution(String before, String after) {
	       for(int i = 0; i < before.length(); i++){
	            after = after.replaceFirst(before.substring(i,i+1),"");
	        }
	        return after.length() == 0? 1: 0;
	}
} // char 정렬
