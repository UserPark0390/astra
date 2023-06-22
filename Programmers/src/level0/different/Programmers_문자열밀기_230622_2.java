package level0.different;

public class Programmers_문자열밀기_230622_2 {

	public static void main(String[] args) {
		String A = "atat";
		String B = "tata";
		System.out.println(solution(A, B));
	}

    public static int solution(String A, String B) {

        return (B+B).indexOf(A);
    }

}
