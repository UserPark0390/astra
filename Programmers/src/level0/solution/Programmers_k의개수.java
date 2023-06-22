package level0.solution;

public class Programmers_k의개수 {
	public static void main(String[] args) {
		int i = 1;
		int j = 13;
		int k = 1;
		System.out.println(solution(i,j,k));
	}

    public static int solution(int i, int j, int k) {
        int answer = 0;        
        String k_change = String.valueOf(k);
        for(int l = i; l <= j; l++) {
        	String l_change = String.valueOf(l);
        	for(int m = 0; m < l_change.length(); m++) {
        		String l_var = l_change.charAt(m)+"";
        		if(l_var.equals(k_change)){
        			answer++;
        		}        		
        	}        	
        }
        return answer;
    }
}
