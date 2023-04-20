package level0;

import java.math.BigInteger;
public class Programmers_구슬을나누는경우의수 {
	
	static int answer = 0;
	public static void main(String[] args) {
		int balls = 5;
		int share = 3;
		System.out.println(solution(balls, share));
	}
	
    public static int solution(int balls, int share) {
    	Bead(balls,share);

    	return answer;
    }
    
    public static void Bead(int balls, int share) {    
        if(balls-share == 0){
            answer = 1;            
            return;
        }
		int a = 1;
		int b = 1;
		int c = 1;
    	
		for(int i = 1; i<= balls; i++) {
    		a = i * a; 
    	}
    	 
    	for(int i = 1; i<= share; i++) {
    		b = i * b; 
    	}
        
        for(int i = 1; i <= balls - share; i++) {
            if(c != 0){
                c = i * c;     
            } else if(c == 0){
                c = 1;
            }
    		
    	}
    	BigInteger change =  BigInteger.valueOf(a / (c*b));
    	answer = change.intValue();   	
	}
     
}
