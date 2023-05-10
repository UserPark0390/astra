package level0.solution;

import java.util.Arrays;

public class Programmers_외계어사전 {
	public static void main(String[] args) {
		String[] spell = {"z", "d", "x"};
		String[] dic = {"def", "dww", "dzx", "loveaw"};
		System.out.println(solution(spell,dic));
	}
    public static int solution(String[] spell, String[] dic) {
        int answer = 0;
        boolean [] check = new boolean[dic.length];
        Arrays.fill(check, true);
                
        for(int i = 0; i < spell.length; i++) {
        	for(int j = 0; j < dic.length; j++) {
        		if(!check[j]) {
        			continue;
        		}
        		if(!dic[j].contains(spell[i])) {
        			check[j] = false;
        		}        		
        	}
        }
        for(int k = 0; k < check.length; k++) {
        	if(check[k]) {
        		answer = 1;
        		break;
        	} else {
        		answer = 2;
        	}
        }
        return answer;
    }
	
}
