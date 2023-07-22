package level1.level1_solution;

import java.util.ArrayList;
import java.util.List;

public class Programmers_다트게임 {
	public static void main(String[] args) {
		String dartResult = "1D#2S*3S";
		System.out.println(solution(dartResult));
	}
	
    public static int solution(String dartResult) {
        int answer = 0;
        int number_tmp = 0;
        boolean check = false; // 숫자 1일 때 
        List<Integer> list_number = new ArrayList<>(); 
        for(int i = 0; i < dartResult.length(); i++) {
        	int dartResult_num = dartResult.charAt(i)-'0';        	        
        	if(dartResult_num <= 10 && dartResult_num >= 0) {
        		if(dartResult_num == 1) {
        			check = true;
        			number_tmp = dartResult.charAt(i)-'0';
        		} else if(dartResult_num == 0 && check) {
        			number_tmp = 10;
        			check = false;
        		} else {
        			number_tmp = dartResult.charAt(i)-'0';
        		}
        	} else if(dartResult_num > 18 ) {
        		if((dartResult.charAt(i)+"").equals("S")) {
        			list_number.add((int)Math.pow(number_tmp, 1));
        			number_tmp = 0;
        			check = false;
        		} else if((dartResult.charAt(i)+"").equals("D")) {
        			list_number.add((int)Math.pow(number_tmp, 2));
        			number_tmp = 0;
        			check = false;
        		} else if((dartResult.charAt(i)+"").equals("T")){
        			list_number.add((int)Math.pow(number_tmp, 3));
        			number_tmp = 0;
        			check = false;
        		}
        	} else {
        		if((dartResult.charAt(i)+"").equals("*")) {
        			if(list_number.size() > 1) {
        				list_number.set(list_number.size()-1, list_number.get(list_number.size()-1)*2);
						list_number.set(list_number.size()-2, list_number.get(list_number.size()-2)*2);
        			} else {
        				list_number.set(0, list_number.get(0)*2);
        			}
        		} else if((dartResult.charAt(i)+"").equals("#")) {
        			list_number.set(list_number.size()-1, list_number.get(list_number.size()-1)*-1);
        		}
        	}       	
        }
        for(int j = 0; j < list_number.size(); j++) {
        	answer += list_number.get(j);
        }
        return answer;
    }
}
