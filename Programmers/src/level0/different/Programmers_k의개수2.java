package level0.different;

public class Programmers_k의개수2 {
	public static void main(String[] args) {
		int i = 1;
		int j = 13;
		int k = 1;
		System.out.println(solution(i,j,k));
	}

    public static int solution(int i, int j, int k) {
        int answer = 0;

        for (int num = i; num <= j; num++){
            int tmp = num;
            while (tmp != 0){
                if (tmp % 10 == k)
                    answer++;
                tmp /= 10;
            }
        }
        return answer;
    }
}
