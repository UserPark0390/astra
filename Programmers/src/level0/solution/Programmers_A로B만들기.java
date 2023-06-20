package level0.solution;

import java.util.ArrayList;
import java.util.List;

public class Programmers_A로B만들기 {
	public static void main(String[] args) {
		String before = "olleh";
		String after = 	"hello";
		System.out.println(solution(before,after));				
	}
	
    public static int solution(String before, String after) {
        int answer = 0;
        List<String> list_before = new ArrayList<>();
        for(int i = 0; i < before.length(); i++) {
        	list_before.add(before.charAt(i)+"");
        }        
        int size = list_before.size();
        for(int j = 0; j < size; j++) {

        	
        	
        	// testrte
        }
        
        return answer;
    }
}
