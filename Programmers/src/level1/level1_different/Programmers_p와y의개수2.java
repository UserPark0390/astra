package level1.level1_different;

public class Programmers_p와y의개수2 {
	public static void main(String[] args) {
		String s = "Pyy";
		System.out.println(solution(s));
	}
	
    static boolean solution(String s) {
        s = s.toUpperCase();
        return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
    }
}
