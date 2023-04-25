package level0.solution;


import java.util.StringTokenizer;

public class Programmers_모스부호1 {
	public static void main(String[] args) {
		String letter = ".... . .-.. .-.. ---";
		System.out.println(solution(letter));
	}
	
    public static String solution(String letter) {
    	String morse [] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    	String alp [] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    	StringTokenizer st = new StringTokenizer(letter);
    	String answer = "";
    	while(true) {
    		if(!st.hasMoreTokens()) {
    			break;
    		}	
    		String str = st.nextToken();
    		System.out.println(str);
    		for(int i = 0; i < morse.length; i++) {
    			if(str.equals(morse[i])) {
    				answer += alp[i];
    				break;
    			}
    		}
    	}
    	
        
        return answer;
    }
	
}
