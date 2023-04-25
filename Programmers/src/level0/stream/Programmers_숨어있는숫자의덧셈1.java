package level0.stream;

public class Programmers_숨어있는숫자의덧셈1 {
	public static void main(String [] args) {
		String my_string = "1a2b3c4d123";
		System.out.println(solution(my_string));
	}
	
    public static int solution(String my_string) {
    	return my_string.chars().mapToObj(i -> (char) i).filter(Character::isDigit).map(String::valueOf).mapToInt(Integer::valueOf).sum();
    }
}
