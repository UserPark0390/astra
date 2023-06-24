package level1.level1_different;

public class Programmers_크기가작은부분문자열 {
	public static void main(String[] args) {
		String t = "3141592";
		String p = "271";
		System.out.println(solution(t, p));
	}
	
	// 풀이차이 length를 int로 풀었다...
    public static int solution(String t, String p) {
        int pLength = p.length();
        long pValue = Long.parseLong(p);
        int answer = 0;
        for (int i = 0; i <= t.length() - pLength; i++) {
            long tValue = Long.parseLong(t.substring(i, i + pLength));
            if (tValue <= pValue)
                answer++;
        }
        return answer;
    }
}
