package level1.level1_different;

public class Programmers_콜라츠추측 {
	public static void main(String[] args) {
		int num = 626331;
		System.out.println(solution(num));
	}
	
    public static int solution(int num) {
        long n = (long)num;
        for(int i=0; i<500; i++){
            if(n==1) return i; 
          n = (n%2==0) ? n/2 : n*3+1;
        }

            return -1;
    }
}
