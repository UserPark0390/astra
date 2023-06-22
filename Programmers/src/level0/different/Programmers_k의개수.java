package level0.different;

public class Programmers_k의개수 {
	public static void main(String[] args) {
		int i = 1;
		int j = 13;
		int k = 1;
		System.out.println(solution(i,j,k));
	}

    public static int solution(int i, int j, int k) {
        String str = "";
        for(int a = i; a <= j; a++) {
            str += a+"";
        }

        return str.length() - str.replace(k+"", "").length();
    }
}
