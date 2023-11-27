package level1.level1_solution;

import java.util.Arrays;

public class Programmers_바탕화면정리 {
	public static void main(String[] args) {
		String[] wallpaper = {"..", "#."};
		System.out.println(Arrays.toString(solution(wallpaper)));
	}
	
    public static int[] solution(String[] wallpaper) {
        int lux = -1;
        int luy = -1;
        int rdx = -1;
        int rdy = -1;
        for(int i = 0; i < wallpaper.length; i++) {
        	for(int j = 0; j < wallpaper[i].length(); j++) {
        		if(wallpaper[i].charAt(j) == '#') {
        			lux = lux > i || lux == -1 ? i : lux;
        			luy = luy > j || luy == -1 ? j : luy;
        			rdx = rdx < i+1 ? i+1 : rdx;
        			rdy = rdy < j+1 ? j+1  : rdy;        			
        		}
        	}
        }  
        return new int [] {lux, luy, rdx, rdy};
    }
    
}
